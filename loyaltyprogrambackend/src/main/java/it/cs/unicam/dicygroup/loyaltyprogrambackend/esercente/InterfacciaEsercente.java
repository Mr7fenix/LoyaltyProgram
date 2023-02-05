package it.cs.unicam.dicygroup.loyaltyprogrambackend.esercente;

import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.GestorePiani;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.Piano;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("api/esercente")
public class InterfacciaEsercente {

    private final GestorePiani gestorePiani;

    public InterfacciaEsercente(GestorePiani gestorePiani) {
        this.gestorePiani = gestorePiani;
    }

    @PostMapping("/piani")
    public ResponseEntity<Piano> creazionePiano(@RequestBody Piano piano) {
        try {
            this.gestorePiani.creaPiano(piano);
        } catch (NullPointerException e) {
            return ResponseEntity.status(BAD_REQUEST)
                    .build();
        }
        return new ResponseEntity<>(piano, CREATED);
    }

    @GetMapping("/piani")
    public ResponseEntity<List<Piano>> getPiani(@RequestParam Long idEsercente) {
        return ResponseEntity.ok(this.gestorePiani.getListaPiani(idEsercente));
    }
}
