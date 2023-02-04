package it.cs.unicam.dicygroup.loyaltyprogrambackend.esercente;

import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.GestorePiani;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.Piano;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        this.gestorePiani.creaPiano(piano);
        return new ResponseEntity<>(piano, CREATED);
    }

    @GetMapping("/piani")
    public ResponseEntity<List<Piano>> getPiani() {
        return ResponseEntity.ok(this.gestorePiani.getListaPiani());
    }
}
