package exercises.interfaceChallenge;

import java.util.ArrayList;

public class Player implements Saveable {

    private String name = "DefaultPlayer";
    private int damage = 10;
    private int health = 100;
    private int defence = 50;

    public Player(String name, int damage, int health, int defence) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.defence = defence;
    }

    public Player() {
    }

    @Override
    public ArrayList valuesToBeSaved() {
        ArrayList parameters = new ArrayList<>();
        parameters.add(name);
        parameters.add(damage);
        parameters.add(health);
        parameters.add(defence);

        return parameters;
    }

    @Override
    public void assignValues(ArrayList fields) {
        if (fields.isEmpty()) {
            System.out.println("Can`t assign value. List is empty.");
        } else {
            name = fields.get(0).toString();
            damage = Integer.valueOf(fields.get(1).toString());
            health = Integer.valueOf(fields.get(2).toString());
            defence = Integer.valueOf(fields.get(3).toString());
        }
    }

    @Override
    public String toString() {
        return "Player " + name + " has these attributes: health - " + health + ", damage - "
                + damage + ", defence - " + defence;
    }
}
