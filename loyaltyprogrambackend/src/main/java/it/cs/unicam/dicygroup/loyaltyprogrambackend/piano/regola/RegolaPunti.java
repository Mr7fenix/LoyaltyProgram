package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola;

public class RegolaPunti implements Regola {
    private Double moltiplicatore;

    public RegolaPunti(Double moltiplicatore) {
        this.moltiplicatore = moltiplicatore;
    }

    @Override
    public Double applica(Double importo) {
        return importo * moltiplicatore;
    }
}
