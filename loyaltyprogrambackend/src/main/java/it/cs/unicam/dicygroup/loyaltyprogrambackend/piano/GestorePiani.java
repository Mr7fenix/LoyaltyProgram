package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import org.springframework.stereotype.*;

import java.util.*;

@Service
public class GestorePiani {

    //Temp
    Set<Piano> registroPiani = new HashSet<>();

    public void creaPiano(Piano piano) {
        registroPiani.add(Objects.requireNonNull(piano));
        System.out.println("Piano creato: " + piano.getClass());
    }
}
