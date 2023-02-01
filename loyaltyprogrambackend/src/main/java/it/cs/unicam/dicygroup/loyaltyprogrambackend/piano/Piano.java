package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

public interface Piano {
    public Long getId();

    public String getNomePiano();

    public Regola getRegola();

    public Integer valutaAcquisto();
}
