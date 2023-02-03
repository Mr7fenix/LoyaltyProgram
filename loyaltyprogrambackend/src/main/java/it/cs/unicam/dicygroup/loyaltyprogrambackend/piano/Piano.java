package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano;

import com.fasterxml.jackson.annotation.*;

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

    public Integer valutaAcquisto();
}
