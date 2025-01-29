package view;

import controller.ContasController;
import inferfaces.RepositorioContas;
import repository.RepositorioContasLista;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContasController contasController = new ContasController();
        RepositorioContas repositorioContas = new RepositorioContasLista();
        MenusBanco menus = new MenusBanco();
        String continua;
        int op;

        do{
            menus.menuContas();
            op = input.nextInt();

            switch (op){
                case 1: contasController.criarConta(repositorioContas); break;
                case 3: contasController.listarTodasContas(repositorioContas); break;
                case 4: contasController.removerConta(repositorioContas); break;
                case 5: contasController.buscarContaPorNumero(repositorioContas); break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");

            }
            System.out.print("\n Deseja continuar?: ");
            continua = input.next();

        } while (continua.equalsIgnoreCase("sim"));


    }
}
