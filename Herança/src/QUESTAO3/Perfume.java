package QUESTAO3;

import java.util.Date;;

public class Perfume {
    private String nomeFantasia;
    private String nomeTecnico;
    private Date dataCriacao;
    private double indiceDeRetencao;
    private double valor;

    public Perfume(String nomeFantasia, String nomeTecnico, Date dataCriacao, double indiceDeRetencao, double valor) {

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

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
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