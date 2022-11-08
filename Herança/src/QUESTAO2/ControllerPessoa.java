package QUESTAO2;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerPessoa {

    ArrayList<PessoaFisica> pessoas = new ArrayList<PessoaFisica>();
    ArrayList<PessoaJuridica> juridicas = new ArrayList<PessoaJuridica>();

    Scanner Ler = new Scanner(System.in);

    public Pessoa adicionarPessoaFisica() {

        limparTela();

        System.out.print("\nNome da Pessoa: ");
        String nome = Ler.nextLine();

        System.out.print("\nEndereco: ");
        String endereco = Ler.nextLine();

        System.out.print("\nCpf: ");
        String cpf = Ler.nextLine();

        PessoaFisica newPessoa = new PessoaFisica(nome, endereco, cpf);

        pessoas.add(newPessoa);

        return newPessoa;
    }

    public Pessoa adicionarPessoaJuridica() {
        limparTela();

        System.out.print("\nNome da Pessoa: ");
        String nome = Ler.nextLine();

        System.out.print("\nEndereco: ");
        String endereco = Ler.nextLine();

        System.out.print("\nCnpj: ");
        String cnpj = Ler.nextLine();

        PessoaJuridica newPessoaJuridica = new PessoaJuridica(nome, endereco, cnpj);

        juridicas.add(newPessoaJuridica);

        return newPessoaJuridica;
    }

    public void deletarPessoa() {

        System.out.println(" -> DELETAR PESSOA <-");

        mostrarPessoasFisicas();

        System.out.print("\nnome da pessoa a ser deletado: ");
        String nome = Ler.next();

        pessoas.removeIf(
                (pessoa) -> pessoa.getNome() == nome);

        for (PessoaFisica pessoa : pessoas) {
            if (pessoa.getNome() == nome) {
                pessoas.remove(pessoa);
                System.out.println("Pessoa (" + pessoa.getNome() + ") deletado com sucesso");
                return;
            }
        }

        System.out.println("Pessoa não encontrado!");

    }

    public void mostrarPessoasFisicas() {
        limparTela();

        System.out.println("Pessoa na lista: ");
        for (PessoaFisica pessoa : pessoas) {
            System.out.println(("Nome: ") + pessoa.getNome() + " -- " + (" CPF: ") + pessoa.getCpf() + " -- "
                    + (" Endereço: ") + pessoa.getEndereco());

        }

    }

    public void mostrarPessoasJuridicas() {
        limparTela();

        for (PessoaJuridica pessoa : juridicas) {
            System.out.println(("Nome: ") + pessoa.getNome() + " -- " + (" CNPJ: ") + pessoa.getCnpj() + " -- "
                    + (" Endereço: ") + pessoa.getEndereco());

        }

    }

    static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
