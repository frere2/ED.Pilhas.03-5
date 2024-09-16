package view;

import br.edu.fateczl.pilha.PilhaString;
import controller.HistoricoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        PilhaString historico = new PilhaString();
        HistoricoController controller = new HistoricoController();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir novo endereço");
            System.out.println("2. Remover o último endereço");
            System.out.println("3. Consultar o último endereço");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o endereço: ");
                    String endereco = scanner.nextLine();
                    controller.inserirEndereco(historico, endereco);
                    break;
                case 2:
                    controller.removerUltimoEndereco(historico);
                    break;
                case 3:
                    controller.consultarUltimoEndereco(historico);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 4);

        scanner.close();
    }
}
