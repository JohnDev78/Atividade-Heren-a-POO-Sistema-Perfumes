package QUESTAO3;


public class Consultor extends Comprador {
    private String dataFiliacao;

    public Consultor(String nome, String cpf, String sexo, String dataFiliacao,  double pontos) {

        super(nome, cpf, sexo, pontos);

        this.dataFiliacao = dataFiliacao;

    }

    public String getDataFiliacao() {
        return dataFiliacao;
    }

    public void setDataFiliacao(String dataFiliacao) {
        this.dataFiliacao = dataFiliacao;
    }

}