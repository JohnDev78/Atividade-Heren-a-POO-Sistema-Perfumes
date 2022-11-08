package QUESTAO3;

public class Comprador {
    private String nome;
    private String cpf;
    private String sexo;
    private double pontos;

    public Comprador(String nome, String cpf, String sexo, double pontos) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;

        this.pontos = pontos;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

}