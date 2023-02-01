package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

public class PianoPunti implements Piano {

    private Long idPiano;
    private String nomePiano;
    private Regola regolaPiano;


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
    public Integer valutaAcquisto() {
        return regolaPiano.applica(0.0);
    }
}
