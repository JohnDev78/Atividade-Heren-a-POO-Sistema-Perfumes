package QUESTAO3;

import java.util.Date;

public class Compra {

    private Date dataDaCompra;
    private double valor;
    private double quantidadeDePerfume;
    private Perfume perfume;



    public Compra(Date dataDaCompra, double valor, double quantidadeDePerfume, Perfume perfume) {
        this.dataDaCompra = dataDaCompra;
        this.valor = valor;
        this.quantidadeDePerfume = quantidadeDePerfume;
        this.perfume = perfume;
    }
    
    public Date getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(Date dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidadeDePerfume() {
        return quantidadeDePerfume;
    }

    public void setQuantidadeDePerfume(double quantidadeDePerfume) {
        this.quantidadeDePerfume = quantidadeDePerfume;
    }

    public Perfume getPerfume() {
        return perfume;
    }

    public void setPerfume(Perfume perfume) {
        this.perfume = perfume;
    }

    


    
}
