package exercises.interfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {

    private String name = "DefaultPlayer";
    private int damage = 10;
    private int health = 100;
    private int defence = 50;

    public Player() {

    }

    public Player(String name, int damage, int health, int defence) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.defence = defence;
    }

    @Override
    public List<String> write() {
        List<String> newList = new ArrayList<>();
        newList.add(name);
        newList.add(Integer.valueOf(damage).toString());
        newList.add(Integer.valueOf(health).toString());
        newList.add(Integer.valueOf(defence).toString());
        return newList;
    }

    @Override
    public void read(List<String> fields) {
        if (fields != null) {
            name = fields.get(0);
            damage = Integer.parseInt(fields.get(1));
            health = Integer.parseInt(fields.get(2));
            defence = Integer.parseInt(fields.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player '" + name + "' has these attributes: health=" + health + ", damage="
                + damage + ", defence=" + defence;
    }
}
