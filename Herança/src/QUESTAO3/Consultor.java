package QUESTAO3;

import java.util.ArrayList;
import java.util.Date;

public class Consultor extends Comprador {
    private Date dataFiliacao;

    public Consultor(String nome, String cpf, String sexo, Date dataFiliacao, ArrayList<Compra> compras, double pontos) {

        super(nome, cpf, sexo, compras, pontos);

        this.dataFiliacao = dataFiliacao;

    }

    public Date getDataFiliacao() {
        return dataFiliacao;
    }

    public void setDataFiliacao(Date dataFiliacao) {
        this.dataFiliacao = dataFiliacao;
    }

}