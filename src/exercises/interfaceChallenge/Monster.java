package exercises.interfaceChallenge;

import java.util.ArrayList;

public class Monster implements Saveable {

    private String name = "DefaultMonster";
    private String type = "DefaultType";
    private int damage = 10;
    private int health = 100;
    private int defence = 50;

    public Monster() {
    }

    public Monster(String name, String type, int damage, int health, int defence) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.health = health;
        this.defence = defence;
    }

    @Override
    public ArrayList valuesToBeSaved() {
        ArrayList parameters = new ArrayList<>();
        parameters.add(name);
        parameters.add(type);
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
            type = fields.get(1).toString();
            damage = Integer.valueOf(fields.get(2).toString());
            health = Integer.valueOf(fields.get(3).toString());
            defence = Integer.valueOf(fields.get(4).toString());
        }
    }

    @Override
    public String toString() {
        return "Monster " + name + " from class - " + type + " has these attributes: health - "
                + health + ", damage - " + damage + ", defence - " + defence;
    }
}
