package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import it.cs.unicam.dicygroup.loyaltyprogrambackend.esercente.*;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.*;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.*;

public class PianoLivelli implements Piano {
    private Long idPiano;
    private String nomePiano;
    private RegolaLivelli regolaPiano;
    private Esercente proprietario;

    private Integer sogliaPunitLivello;
    private Integer numeroLivelli;

    public PianoLivelli(Long idPiano, Esercente proprietario, String nomePiano, RegolaLivelli regolaPiano, Integer sogliaPunitLivello, Integer numeroLivelli) {
        this.idPiano = idPiano;
        this.proprietario = proprietario;
        this.nomePiano = nomePiano;
        this.regolaPiano = regolaPiano;
        this.sogliaPunitLivello = sogliaPunitLivello;
        this.numeroLivelli = numeroLivelli;
    }

    public Integer getSogliaPunitLivello() {
        return sogliaPunitLivello;
    }

    public Integer getNumeroLivelli() {
        return numeroLivelli;
    }

    @Override
    public Long getId() {
        return this.idPiano;
    }

    @Override
    public String getNomePiano() {
        return this.nomePiano;
    }

    @Override
    public Regola getRegola() {
        return this.regolaPiano;
    }

    @Override
    public Integer valutaAcquisto(Acquisto acquisto) {
        if (!(acquisto instanceof AcquistoSoldi))
            throw new IllegalArgumentException();

        return this.regolaPiano.applica(acquisto.getImporto());
    }

    @Override
    public Long getIdProprietario() {
        return this.proprietario.getId();
    }
}
