package br.com.fiap.game.view;

import br.com.fiap.game.model.Character;
import br.com.fiap.game.model.SpecialAbility;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int option;

        Character character = new Character();


        do {
            System.out.println("Escolha uma opção: \n1 - Cadastrar personagem\n2 - Exibir personagem\n3 - Realizar ataque\n4 - Aumentar energia\n5 - Habilitar habilidade especial\n0 - Sair");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite o nome do personagem:");
                    String name = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de energia:");
                    int energy = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o poder do personagem:");
                    String ability = sc.nextLine();

                    character.setName(name).setEnergy(energy).setAbility(ability);

                    System.out.println("Digite o nome do habilidade especial:");
                    String abilityName = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia:");
                    int abilityCost = sc.nextInt();
                    sc.nextLine();
                    System.out.println("A habilidade está ativada? (true/false)");
                    boolean isActive = sc.nextBoolean();

                    SpecialAbility specialAbility = new SpecialAbility(abilityName,abilityCost,isActive);

                    character.setSpecial(specialAbility);
                    break;
                case 2:
                    System.out.println("Name: " + character.getName() + "\nEnergy: " + character.getEnergy() + "\nAbility: " + character.getAbility());
                    System.out.println("AbilityName: " + character.getSpecial().getName() + "\nCost: " + character.getSpecial().getCost() + "\nActive: " + character.getSpecial().isActive());
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque");
                    String attack = sc.next() + sc.nextLine();
                    character.attack(attack);
                    break;
                case 4:
                    System.out.println("Digite a quantidade de energia:");
                    int qt = sc.nextInt();
                    int currentQt= character.increaseEnergy((qt));
                    System.out.println("Nível atualde energia: " + currentQt);
                    break;
                case 5:
                    character.activateSpecialAbility();
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");

            }
        } while (option != 0);
        sc.close();
    }
}
