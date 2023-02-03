package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.esercente.Esercente;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.Acquisto;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.Regola;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PianoLivelli.class, name = "PianoLivelli"),
        @JsonSubTypes.Type(value = PianoPunti.class, name = "PianoPunti")
})
public interface Piano {
    public Long getId();

    public String getNomePiano();

    public Regola getRegola();

    // TODO Controllare l'eccezione
    public Double valutaAcquisto(Acquisto acquisto) throws Exception;

    public Esercente getProprietario();
}
