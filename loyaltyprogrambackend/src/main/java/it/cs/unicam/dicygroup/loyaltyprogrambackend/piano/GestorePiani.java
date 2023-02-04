package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import org.slf4j.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class GestorePiani {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    //Temp
    Set<Piano> registroPiani = new HashSet<>();

    public void creaPiano(Piano piano) {
        registroPiani.add(Objects.requireNonNull(piano));
        logger.info("Piano creato: {}\nRegola: {}", piano, piano.getRegola());
    }


    public List<Piano> getListaPiani() {
        return registroPiani.stream().toList();
    }
}
