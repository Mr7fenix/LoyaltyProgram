package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import com.fasterxml.jackson.annotation.*;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto.*;
import it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PianoLivelli.class, name = "PianoLivelli"),
        @JsonSubTypes.Type(value = PianoPunti.class, name = "PianoPunti")
})
public interface Piano {
    Long getId();

    String getNomePiano();

    Regola getRegola();

    // TODO Controllare l'eccezione
    Integer valutaAcquisto(Acquisto acquisto);

    Long getIdProprietario();
}
