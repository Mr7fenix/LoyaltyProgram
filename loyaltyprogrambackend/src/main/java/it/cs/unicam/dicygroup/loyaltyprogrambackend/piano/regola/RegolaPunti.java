package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.regola;

public class RegolaPunti implements Regola {

    private Double moltiplicatore;


    public RegolaPunti(Double moltiplicatore) {
        this.moltiplicatore = moltiplicatore;
    }

    public RegolaPunti() {
    }

    @Override
    public Integer applica(Double importo) {
        return (int) (importo * moltiplicatore);
    }

    public Double getMoltiplicatore() {
        return moltiplicatore;
    }

}
