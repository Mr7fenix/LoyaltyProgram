package it.cs.unicam.dicygroup.loyaltyprogrambackend.esercente;

import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
        return new ResponseEntity<>(piano, HttpStatus.OK);
    }

    @GetMapping("/piani")
    public List<Piano> get() {
        return gestorePiani.getListaPiani();
    }
}
