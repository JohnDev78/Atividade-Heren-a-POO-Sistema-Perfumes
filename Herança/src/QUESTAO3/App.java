package QUESTAO3;

import java.util.Scanner;

public class App {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        Controller controlador = new Controller();

        int resposta = 1;

        while (resposta == 1) {

            int opcao;

            System.out.println("--------------MENU--------------");
            System.out.println("1-Cadastrar Perfume Sintetico");
            System.out.println("2-Cadastrar Perfume");
            System.out.println("3-Cadastrar novo Comprador");
            System.out.println("4-Cadastrar Consultor");
            System.out.println("5-Cadastrar Compra");
            System.out.println("6-Mostrar Perfume");
            System.out.println("7-Mostrar perfume sintetico");
            System.out.println("8-Mostrar Comprador");
            System.out.println("9-Mostrar Consultor");
            System.out.println("10-Mostrar Compra");
            System.out.println("..................................");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    controlador.adicionarPerfumeSintetico();

                    break;

                case 2:
                    controlador.adicionarPerfume();

                    break;

                case 3:
                    controlador.adicionarComprador();
                    break;

                case 4:
                    controlador.adicionarConsultor();

                    break;
                case 5:
                    controlador.adicionarCompra();

                    break;

                case 6:
                    controlador.mostrarPerfume();

                    break;
                case 7:
                    controlador.mostrarPerfumesSinteticos();

                    break;
                    case 8:
                    controlador.mostrarComprador();

                    break;
                    case 9:
                    controlador.mostrarConsultor();

                    break;
                    case 10:
                    controlador.mostrarCompra();

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
