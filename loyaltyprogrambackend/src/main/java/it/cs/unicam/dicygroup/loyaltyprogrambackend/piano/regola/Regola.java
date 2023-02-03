package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola;

// TODO Valutare se trasformarla in una interfaccia parametrica, dove il tipo T è il tipo di ritorno del premio (ES: Integer per Premio, Double per Livelli)
public interface Regola {
    // TODO Valutare se restituire un possibile oggetto "Premio"
    public Double applica(Double importo);
}
