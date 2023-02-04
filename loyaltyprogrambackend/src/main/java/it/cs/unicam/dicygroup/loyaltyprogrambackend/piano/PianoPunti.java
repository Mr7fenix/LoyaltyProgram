package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.*;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.*;

public class PianoPunti implements Piano {

    private Long idPiano;
    private String nomePiano;
    private RegolaPunti regolaPiano;
    //todo
    private Long idProprietario;

    public PianoPunti(Long idPiano, Long idProprietario, String nomePiano, RegolaPunti regolaPiano) {
        this.idPiano = idPiano;
        this.nomePiano = nomePiano;
        this.regolaPiano = regolaPiano;
        this.idProprietario = idProprietario;
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
