package br.com.fiap.game.model;

import java.util.Scanner;

public class ViewItem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Item item = null;
        int option;

        do {
            System.out.println("\nEscolha uma opção\n1 - Cadastrar item\n2 - Exibir item\n0 - Sair");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite o nome do item:");
                    String name = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do item:");
                    String description = sc.next() + sc.nextLine();
                    System.out.println("O item é raro? (true/false):");
                    boolean rare = sc.nextBoolean();
                    sc.nextLine();
                    System.out.println("Digite o nível de poder do item:");
                    int power = sc.nextInt();
                    item = new Item(name, description,rare,power);
                    break;
                case 2:
                    if (item != null) {
                        System.out.println("\nName: " + item.getName() + "\nDescription: " + item.getDescription() + "\nRare: " + item.isRare() + "\nPower: " + item.getPower());
                    } else {
                        System.out.println("\nNenhum item cadastrado.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }while(option != 0);
        sc.close();
    }
}
