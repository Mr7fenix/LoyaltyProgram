package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

public class PianoLivelli implements Piano {
    private Long idPiano;
    private String nomePiano;
    private Regola regolaPiano;

    private Integer sogliaPunitLivello;
    private Integer numeroLivelli;

    public PianoLivelli(String nomePiano, Regola regolaPiano, Integer sogliaPunitLivello, Integer numeroLivelli) {
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
        return null;
    }

    @Override
    public String getNomePiano() {
        return null;
    }

    @Override
    public Regola getRegola() {
        return null;
    }

    @Override
    public Integer valutaAcquisto() {
        return null;
    }
}
