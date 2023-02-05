package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
public class GestorePiani {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    //Temp
    Set<Piano> registroPiani = new HashSet<>();

    public void creaPiano(Piano piano) {
        registroPiani.add(Objects.requireNonNull(piano));
        logger.info("Piano creato: {}\nRegola: {}", piano, piano.getRegola());
    }


    public List<Piano> getListaPiani(Long idEsercente) {
        return registroPiani.stream()
                .filter(piano -> Objects.equals(piano.getIdProprietario(), idEsercente))
                .toList();
    }
}
