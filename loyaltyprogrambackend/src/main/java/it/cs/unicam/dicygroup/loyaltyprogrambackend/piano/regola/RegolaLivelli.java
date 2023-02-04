package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola;

public class RegolaLivelli implements Regola {
    private Double moltiplicatore;
    // private Double maxLevel;

    public RegolaLivelli(Double moltiplicatore) {
        this.moltiplicatore = moltiplicatore;
    }

    public RegolaLivelli() {
    }


    @Override
    public Integer applica(Double importo) {
        return (int) (importo * moltiplicatore);
    }

    public Double getMoltiplicatore() {
        return moltiplicatore;
    }
}
