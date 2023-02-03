package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import it.cs.unicam.dicygroup.loyaltyprogrambackend.esercente.Esercente;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.Acquisto;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.AcquistoSoldi;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.Regola;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.RegolaPunti;

public class PianoPunti implements Piano {

    private Long idPiano;
    private String nomePiano;
    private RegolaPunti regolaPiano;
    private Esercente proprietario;

    public PianoPunti(Long idPiano, Esercente proprietario, String nomePiano, RegolaPunti regolaPiano) {
        this.idPiano = idPiano;
        this.nomePiano = nomePiano;
        this.regolaPiano = regolaPiano;
        this.proprietario = proprietario;
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
    public Double valutaAcquisto(Acquisto acquisto) throws Exception {
        if (!(acquisto instanceof AcquistoSoldi))
            throw new Exception();

        return this.regolaPiano.applica(((AcquistoSoldi) acquisto).getImporto());
    }

    @Override
    public Esercente getProprietario() {
        return this.proprietario;
    }
}
