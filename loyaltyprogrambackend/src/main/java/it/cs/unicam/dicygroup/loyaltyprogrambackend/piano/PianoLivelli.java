package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.*;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.*;

public class PianoLivelli implements Piano {
    private Long idPiano;
    private String nomePiano;
    private RegolaLivelli regolaPiano;
    private Long idProprietario;

    private Integer sogliaPuntiLivello;
    private Integer numeroLivelli;

    public PianoLivelli(Long idPiano,
                        Long idProprietario,
                        String nomePiano,
                        RegolaLivelli regolaPiano,
                        Integer sogliaPuntiLivello,
                        Integer numeroLivelli) {
        this.idPiano = idPiano;
        this.idProprietario = idProprietario;
        this.nomePiano = nomePiano;
        this.regolaPiano = regolaPiano;
        this.sogliaPuntiLivello = sogliaPuntiLivello;
        this.numeroLivelli = numeroLivelli;
    }

    public Integer getSogliaPuntiLivello() {
        return sogliaPuntiLivello;
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
        return this.idProprietario;
    }
}
