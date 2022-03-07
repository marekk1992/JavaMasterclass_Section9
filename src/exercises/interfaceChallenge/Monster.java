package exercises.interfaceChallenge;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> write() {
        List<String> newList = new ArrayList<>();
        newList.add(name);
        newList.add(type);
        newList.add(Integer.valueOf(damage).toString());
        newList.add(Integer.valueOf(health).toString());
        newList.add(Integer.valueOf(defence).toString());
        return newList;
    }

    @Override
    public void read(List<String> fields) {
        if (fields != null) {
            name = fields.get(0);
            type = fields.get(1);
            damage = Integer.parseInt(fields.get(2));
            health = Integer.parseInt(fields.get(3));
            defence = Integer.parseInt(fields.get(4));
        }
    }

    @Override
    public String toString() {
        return "Monster '" + name + "' from class='" + type + "' has these attributes: health="
                + health + ", damage=" + damage + ", defence=" + defence;
    }
}
