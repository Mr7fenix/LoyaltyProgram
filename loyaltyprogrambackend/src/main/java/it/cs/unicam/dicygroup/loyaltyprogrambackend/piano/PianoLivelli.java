package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import it.cs.unicam.dicygroup.loyaltyprogrambackend.esercente.Esercente;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.Acquisto;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.AcquistoSoldi;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.Regola;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.RegolaLivelli;

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
