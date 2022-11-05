package QUESTAO3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    static ArrayList<Comprador> compradores = new ArrayList<Comprador>(0);
    static ArrayList<Perfume> perfumes = new ArrayList<Perfume>(0);
    

    
    public static void main(String[] args) throws Exception {

    }

    static void menu() {
        String selecao;

        do {
            limparTela();

            System.out.println("--------------MENU--------------");
            System.out.println("1-Mostrar Perfumes");
            System.out.println("2-Mostrar Comprador");
            System.out.println("3-Cadastrar novo Cliente");
            System.out.println("4-Cadastrar novo Perfume");
            System.out.println("5-Cadastrar novo Consultor");
            System.out.println("6-Vender Perfumes");
            System.out.println("7-Sair ");
            System.out.println("..................................");

            System.out.print("Selecione uma opção: ");
            selecao = input.nextLine();

            switch (selecao) {
                case "1":
                    mostrarPerfumes();
                    break;

                case "2":
                    mostrarClientes();
                    break;
                case "3":
                    cadastrarCliente();
                    break;

                case "4":
                    cadastrarPerfume();
                    break;

                
                case "6":
                    venderPerfume();
                    break;

               
                default:
                    esperarEnter();
                    break;
            }

        } while (!selecao.equals("6"));

    }

    private static void venderPerfume() {

        limparTela();

        mostrarPerfumes();

        int nomeTecnicoSelecionado = pedirInteiro("Insira o id do perfume: ");

        Perfume PerfSelecionado = null;

        for (int i = 0; i < perfumes.size(); i++) {
            if (perfumes.get(i).getNomeTecnico() == nomeTecnicoSelecionado) {
                nomeTecnicoSelecionado = perfumes.get(i);
                break;
            }
        }

        if (PerfSelecionado == null) {
            System.out.println(" -! Perfume não encontrado !- ");

            esperarEnter();
            return;
        }

        System.out.println("Perfume selecionado: ");
        mostrarPerfume(PerfSelecionado);

        int qtdPedida = pedirInteiro("Quantidade requerida: ");

        if (qtdPedida > PerfSelecionado.qtdEstoque) {
            System.out.println(" -! Estoque insuficiente !-");

            esperarEnter();
            return;
        }

        double valorTotal = qtdPedida * PerfSelecionado.valor;

        System.out.println("\n      	 RECIBO");
        System.out.println("Nome do Perfume: ..." + PerfSelecionado.getNomeFantasia());
        System.out.println("Valor unitário: ....R$" + PerfSelecionado.getValor());
        System.out.println("Quantidade: ........" + qtdPedida);
        System.out.println("Valor total: .......R$" + valorTotal + "\n");

        System.out.println("Confirmar venda? [S]im | [N]ão: ");
        String confirmacao = input.nextLine();

        if (confirmacao.equals("S")) {
            saldo += valorTotal;
            PerfSelecionado.qtdEstoque -= qtdPedida;
            System.out.println(" -> Venda concluída <-");
        } else if (confirmacao.equals("N")) {
            System.out.println(" -! Venda cancelada !-");
        }

        esperarEnter();
    }

    static void mostrarSaldo() {
        limparTela();

        System.out.println("\nSaldo em caixa: R$ " + saldo);

        esperarEnter();

    }

    static void cadastrarCliente() {

        System.out.print("\nInsira o nome do Cliente: ");
        String nome = input.nextLine();

        compradores.add(nome);

        System.out.println("\n -> Cliente cadastrado com sucesso! <- \n");

        esperarEnter();
    }

    static void cadastrarPerfume() {
        limparTela();

        int qtdProds = perfumes.size();

        

        System.out.print("\nInsira o nome do Perfume: ");
        String nome = input.nextLine();

        System.out.print("\nInsira o nome tecnico do Perfume: ");
        String nomeTecnico = input.nextLine();


        System.out.print("\nInsira o valor do Perfume: ");
        double valor = Double.parseDouble(input.nextLine());

        int qtdEstoque = pedirInteiro("\nInsira a quantidade contida em estoque: ");

        Perfume Perf1 = new Perfume(nome, nomeTecnico, null, valor, valor);

        perfumes.add(Perf1);

        System.out.println("\n -> Perfume cadastrado com sucesso! <- \n");

        esperarEnter();
    }

    static void mostrarClientes() {
        limparTela();
        

        System.out.println("\nQuantidade: " + compradores.size());
        System.out.println("\nClientes cadastrados: ");
        System.out.println("\n id | Nome");
        System.out.println("\n --------------------------");
        for (int i = 0; i < compradores.size(); i++) {

            int id = i + 1;
            System.out.println(id + " | " + compradores.get(i));
    
        }

        esperarEnter();

    }

    static void mostrarPerfumes() {
        limparTela();

        System.out.println("\nQuantidade: " + perfumes.size());
        System.out.println("\nPerfumes cadastrados: ");

        System.out.println(" Id | Perfume                        |   Valor   | Quantidade em estoque");
        System.out.println("------------------------------------------------------------------------");
        for (Perfume Perfume : perfumes) {
            
             System.out.println(Perfume.getNomeTecnico()+ " | " + Perfume.getNomeFantasia() + " | R$" +
             Perfume.getValor());
        }

        esperarEnter();

    }

    static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void esperarEnter() {
        System.out.print("\nPressione <enter> para continuar...");
        input.nextLine();
    }

    static int pedirInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int numero = Integer.parseInt(input.nextLine());
                return numero;
            } catch (Exception e) {
                System.out.println(" -! Algo deu errado. Tente novamente");
            }

        }

    }

}
