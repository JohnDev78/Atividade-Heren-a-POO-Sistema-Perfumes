package QUESTAO2;

import java.util.Scanner;

public class App {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        ControllerPessoa controlador = new ControllerPessoa();

        /*
         * controlador.adicionarPessoaFisica();
         * 
         * controlador.adicionarPessoaJuridica();
         * 
         * controlador.mostrarPessoasFisicas();
         * 
         * controlador.mostrarPessoasJuridicas();
         */

        int resposta = 1;

        while (resposta == 1) {

            int opcao;

            System.out.println("Escollha uma opção abaixo ");
            System.out.println("[1]---Adicionar Pessoa Fisica ");
            System.out.println("[2]---Adicionar Pessoa Juridica ");
            System.out.println("[3]---Mostrar Pessoas Fisicas");
            System.out.println("[4]---Mostrar Pessoas Juridicas");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    controlador.adicionarPessoaFisica();
                    break;

                case 2:
                    controlador.adicionarPessoaJuridica();
                    break;

                case 3:
                    controlador.mostrarPessoasFisicas();
                    break;

                case 4:
                    controlador.mostrarPessoasJuridicas();
                    break;

                default:
                    System.out.println("Voce digitou uma opção invalida");
                    break;
            }
            System.out.println("Deseja realizar algo mais ? [1] sim [2] não");
            resposta = ler.nextInt();
            if (resposta != 1) {
                
                System.out.print("Programa Finalizado!");


            }

        }

    }
}
