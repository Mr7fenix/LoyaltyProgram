package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto;

public class AcquistoSoldi implements Acquisto<Double> {
    private Double importo;

    public AcquistoSoldi(Double importo) {
        this.importo = importo;
    }

    @Override
    public Double getImporto() {
        return importo;
    }
}
