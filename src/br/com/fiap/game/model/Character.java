package br.com.fiap.game.model;

public class Character {
    private String name;
    private int energy;
    private String ability;
    private SpecialAbility special;

    public String getName() {
        return name;
    }

    public Character setName(String name) {
        this.name = name;
        return this;
    }

    public int getEnergy() {
        return energy;
    }

    public Character setEnergy(int energy) {
        this.energy = energy;
        return this;
    }

    public String getAbility() {
        return ability;
    }

    public Character setAbility(String ability) {
        this.ability = ability;
        return this;
    }

    public Character(String name, int energy, String ability){
        this.name = name;
        this.energy = energy;
        this.ability = ability;
    }

    public Character(){}

    public SpecialAbility getSpecial() {
        return special;
    }

    public void setSpecial(SpecialAbility special) {
        this.special = special;
    }

    public void attack(String attackName) {
        if (this.energy >= 10) {
            System.out.println(this.name + " realizou um ataque: " + attackName + "!");
            this.energy -= 10;
        } else {
            System.out.println((this.name + " está sem energia para atacar."));
        }
    }

    public int increaseEnergy(int energy) {
        this.energy += energy;
        return this.energy;
    }

    public void activateSpecialAbility() {
        if (!this.special.isActive()) {
            System.out.println("Habilidade especial não está ativada");
        } else if (this.energy >= this.special.getCost()) {
            System.out.println("Ativando a habilidade: " + this.special.getName());
            this.energy -= this.special.getCost();
        } else {
            System.out.println(this.name + " está sem energia para a habilidade especial");
        }
    }

}
