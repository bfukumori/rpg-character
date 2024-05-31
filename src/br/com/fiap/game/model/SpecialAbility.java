package br.com.fiap.game.model;

public class SpecialAbility {
    private String name;
    private int cost;
    private boolean isActive;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public SpecialAbility(String name, int cost, boolean isActive) {
        this.name = name;
        this.cost = cost;
        this.isActive = isActive;
    }
}
