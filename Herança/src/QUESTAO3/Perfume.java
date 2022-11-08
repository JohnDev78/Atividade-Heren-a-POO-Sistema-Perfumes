package QUESTAO3;



public class Perfume {
    private String nomeFantasia;
    private String nomeTecnico;
    private String dataCriacao;
    private double indiceDeRetencao;
    private double valor;

    public Perfume(String nomeFantasia, String nomeTecnico, String dataCriacao, double indiceDeRetencao, double valor) {

        this.nomeFantasia = nomeFantasia;
        this.nomeTecnico = nomeTecnico;
        this.dataCriacao = dataCriacao;
        this.indiceDeRetencao = indiceDeRetencao;
        this.valor = valor;

    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public double getIndiceDeRetencao() {
        return indiceDeRetencao;
    }

    public void setIndiceDeRetencao(double indiceDeRetencao) {
        this.indiceDeRetencao = indiceDeRetencao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}