package QUESTAO3;


public class Compra {

    private String dataDaCompra;
    private double valor;
    private double quantidadeDePerfume;
   // private Perfume perfume;



    public Compra(String dataDaCompra, double valor, double quantidadeDePerfume) {
        this.dataDaCompra = dataDaCompra;
        this.valor = valor;
        this.quantidadeDePerfume = quantidadeDePerfume;
      
    }
    
    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
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

    
    


    
}
