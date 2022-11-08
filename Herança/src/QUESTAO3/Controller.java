package QUESTAO3;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    Scanner Ler = new Scanner(System.in);
    Scanner Ler2 = new Scanner(System.in);
    Scanner Ler3 = new Scanner(System.in);
    Scanner Ler4 = new Scanner(System.in);
    Scanner Ler5 = new Scanner(System.in);

    ArrayList<PerfumesSintetico> perfumes = new ArrayList<PerfumesSintetico>();
    ArrayList<Perfume> perfumes2 = new ArrayList<Perfume>();
    ArrayList<Comprador> compradores = new ArrayList<Comprador>();
    ArrayList<Consultor> consultores = new ArrayList<Consultor>();
    ArrayList<Compra> compras = new ArrayList<Compra>();

    public Perfume adicionarPerfumeSintetico() {

        limparTela();

        System.out.print("\nNome do perfume: ");
        String nomeFantasia = Ler.nextLine();

        System.out.print("\nNome Técnico: ");
        String nomeTecnico = Ler.nextLine();

        System.out.print("\nData de Criação: ");
        String dataCriacao = Ler.nextLine();

        System.out.print("\nIndice de Retenção: ");
        double indiceDeRetencao = Ler.nextDouble();

        System.out.print("\nTaxa Fator de Risco: ");
        double taxaFatorDeRisco = Ler.nextDouble();

        System.out.print("\nValor: ");
        double valor = Ler.nextDouble();

        PerfumesSintetico novoPerfume = new PerfumesSintetico(nomeFantasia, nomeTecnico, dataCriacao, indiceDeRetencao,
                taxaFatorDeRisco, valor);

        perfumes.add(novoPerfume);

        return novoPerfume;
    }

    public Perfume adicionarPerfume() {

        limparTela();

        System.out.print("\nNome do perfume: ");
        String nomeFantasia = Ler2.nextLine();

        System.out.print("\nNome Técnico: ");
        String nomeTecnico = Ler2.nextLine();

        System.out.print("\nData de Criação: ");
        String dataCriacao = Ler2.nextLine();

        System.out.print("\nIndice de Retenção: ");
        double indiceDeRetencao = Ler2.nextDouble();

        System.out.print("\nValor: ");
        double valor = Ler2.nextDouble();

        Perfume novoPerfume2 = new Perfume(nomeFantasia, nomeTecnico, dataCriacao, indiceDeRetencao, valor);

        perfumes2.add(novoPerfume2);

        return novoPerfume2;
    }

    public Comprador adicionarComprador() {

        limparTela();

        System.out.print("\nNome do Comprador ");
        String nome = Ler3.nextLine();

        System.out.print("\nCPF: ");
        String cpf = Ler3.nextLine();

        System.out.print("\nSexo: ");
        String sexo = Ler3.nextLine();

        System.out.print("\nPontos: ");
        Double pontos = Ler3.nextDouble();

        Comprador novoComprador1 = new Comprador(nome, cpf, sexo, pontos);

        compradores.add(novoComprador1);

        return novoComprador1;
    }

    public Consultor adicionarConsultor() {

        limparTela();

        System.out.print("\nNome do Consultor ");
        String nome = Ler4.nextLine();

        System.out.print("\nCPF: ");
        String cpf = Ler4.nextLine();

        System.out.print("\nSexo: ");
        String sexo = Ler4.nextLine();

        System.out.print("\nData de filiação: ");
        String dataFiliacao = Ler4.nextLine();

        System.out.print("\nPontos: ");
        Double pontos = Ler4.nextDouble();

        Consultor novoConsultor1 = new Consultor(nome, cpf, sexo, dataFiliacao, pontos);

        consultores.add(novoConsultor1);

        return novoConsultor1;
    }

    public Compra adicionarCompra() {

        limparTela();

        System.out.print("\nData da compra ");
        String dataCompra = Ler5.nextLine();

        System.out.print("\nValor: ");
        Double valor = Ler5.nextDouble();

        System.out.print("\nQuantidade de Perfumes: ");
        Double quantidadeDePerfume = Ler5.nextDouble();

        Compra novaCompra = new Compra(dataCompra, valor, quantidadeDePerfume);

        compras.add(novaCompra);

        return novaCompra;

    }

    public void mostrarPerfume() {
        limparTela();

        System.out.println("Perfume na lista: ");
        for (Perfume perfume : perfumes2) {
            System.out.println(("Nome Fantasia: ") + perfume.getNomeFantasia() + " -- " + (" Nome Técnico ")
                    + perfume.getNomeTecnico() + " -- "
                    + (" Data da Criação: ") + perfume.getDataCriacao() + " -- " + ("Indice de Retenção: ")
                    + perfume.getIndiceDeRetencao() + " -- "
                    + " -- " + ("Valor: ") + perfume.getValor());

        }

    }

    public void mostrarPerfumesSinteticos() {
        limparTela();

        System.out.println("Perfume na lista: ");
        for (PerfumesSintetico perfume : perfumes) {
            System.out.println(("Nome Fantasia: ") + perfume.getNomeFantasia() + " -- " + (" Nome Técnico ")
                    + perfume.getNomeTecnico() + " -- "
                    + (" Data da Criação: ") + perfume.getDataCriacao() + " -- " + ("Indice de Retenção: ")
                    + perfume.getIndiceDeRetencao() + " -- "
                    + ("Taxa fator de risco: ") + perfume.getTaxaFatorDeRisco() + " -- " + ("Valor: ")
                    + perfume.getValor());

        }

    }

    public void mostrarComprador() {
        limparTela();

        System.out.println("Comprador na lista: ");
        for (Comprador comprador : compradores) {
            System.out.println(("Nome: ") + comprador.getNome() + " -- " + (" CPF ")
                    + comprador.getCpf() + " -- "
                    + (" Sexo: ") + comprador.getSexo() + " -- " + ("Pontos: ")
                    + comprador.getPontos());

        }

    }

    public void mostrarConsultor() {
        limparTela();

        System.out.println("Consultor na lista: ");
        for (Consultor consultor : consultores) {
            System.out.println(("Nome: ") + consultor.getNome() + " -- " + (" CPF ")
                    + consultor.getCpf() + " -- "
                    + (" Sexo: ") + consultor.getSexo() + " -- " + ("Pontos: ")
                    + consultor.getPontos() + " -- " + ("Data de Filiação: ") + consultor.getDataFiliacao());

        }

    }

    public void mostrarCompra() {
        limparTela();

        System.out.println("Compra na lista: ");
        for (Compra compra : compras) {
            System.out.println(("Data da Compra: ") + compra.getDataDaCompra() + " -- " + (" Valor: ")
                    + compra.getValor() + " -- "
                    + (" Quantidade de Perfume: ") + compra.getQuantidadeDePerfume());

        }

    }

    static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
