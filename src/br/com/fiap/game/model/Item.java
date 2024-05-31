package br.com.fiap.game.model;

public class Item {
    private String name;
    private String description;
    private boolean rare;
    private int power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRare() {
        return rare;
    }

    public void setRare(boolean rare) {
        this.rare = rare;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Item(String name, String description, boolean rare, int power) {
        this.name = name;
        this.description = description;
        this.rare = rare;
        this.power = power;
    }
}
