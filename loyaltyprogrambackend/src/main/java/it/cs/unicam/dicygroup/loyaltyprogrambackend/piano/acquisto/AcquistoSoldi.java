package it.cs.unicam.dicygroup.loyaltyprogrambackend.piano.acquisto;

public record AcquistoSoldi(Double importo) implements Acquisto {

    public AcquistoSoldi {
        requirePositive(importo);
    }

    private void requirePositive(Double importo) {
        if (importo < 0) throw new IllegalArgumentException("Importo non valido");
    }

    @Override
    public Double getImporto() {
        return importo;
    }
}
