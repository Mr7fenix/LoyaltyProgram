package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola;

public class RegolaLivelli implements Regola {
    private Double moltiplicatore;
    // private Double maxLevel;

    public RegolaLivelli(Double moltiplicatore) {
        this.moltiplicatore = moltiplicatore;
    }

    @Override
    public Double applica(Double importo) {
        return importo * moltiplicatore;
    }
}
