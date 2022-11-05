package QUESTAO3;

import java.util.Date;

public class PerfumesSintetico extends Perfume {

    private double taxaFatorDeRisco;

    public PerfumesSintetico(String nomeFantasia, String nomeTecnico, Date dataCriacao, double indiceDeRetencao, double taxaFatorDeRisco, double valor) {
        
        super(nomeFantasia, nomeTecnico, dataCriacao, indiceDeRetencao,valor);

        this.taxaFatorDeRisco = taxaFatorDeRisco;
    }

    public double getTaxaFatorDeRisco() {
        return taxaFatorDeRisco;
    }

    public void setTaxaFatorDeRisco(double taxaFatorDeRisco) {
        this.taxaFatorDeRisco = taxaFatorDeRisco;
    }

    
}