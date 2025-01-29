package controller;

import inferfaces.RepositorioContas;
import model.contas.Conta;
import model.contas.Poupanca;

import java.util.Scanner;

public class ContasController {
    Scanner input = new Scanner(System.in);
    Conta conta;
    String numConta;
    int agencia;

    public void criarConta(RepositorioContas repositorioContas){
        conta = new Poupanca();
        System.out.print("Digite o numero da conta: ");
        numConta = input.next();
        conta.setNumeroConta(numConta);
        System.out.print("Digite a agencia: ");
        agencia = input.nextInt();
        conta.setAgencia(agencia);
        conta.setSaldo(0.00);
        conta.setChequeEspecial(100.00);
        repositorioContas.criar(conta);
    }

    public void removerConta(RepositorioContas repositorioContas){
        System.out.print("Digite o numero da conta a remover: ");
        numConta = input.next();
        repositorioContas.remover(numConta);
        System.out.println("Conta Removida com sucesso!");
    }

    public void buscarContaPorNumero(RepositorioContas repositorioContas){
        System.out.print("Digite o numero da conta: ");
        numConta = input.next();
        System.out.println("Informações da Conta\n: " + repositorioContas.procurarPorNumero(numConta));;
    }

    public void listarTodasContas(RepositorioContas repositorioContas){
        System.out.println(repositorioContas.listarTodas());
    }

}
