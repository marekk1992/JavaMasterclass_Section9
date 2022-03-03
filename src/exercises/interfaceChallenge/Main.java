package exercises.interfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player newPlayer = new Player("Marek", 150, 100, 30);
        ArrayList playerFields = newPlayer.valuesToBeSaved();
        newPlayer.assignValues(playerFields);
        System.out.println(newPlayer.toString());
        newPlayer = revertPlayerToDefaultValues();
        System.out.println(newPlayer.toString());

        Monster newMonster = new Monster("BlackBeard", "dwarf", 50, 140, 80);
        ArrayList monsterFields = newMonster.valuesToBeSaved();
        newMonster.assignValues(monsterFields);
        System.out.println(newMonster.toString());
        newMonster = revertMonsterToDefaultValues();
        System.out.println(newMonster.toString());
    }

    public static Player revertPlayerToDefaultValues() {
        Player defaultPlayer = new Player();
        ArrayList defaultValue = defaultPlayer.valuesToBeSaved();
        defaultPlayer.assignValues(defaultValue);
        return defaultPlayer;
    }

    public static Monster revertMonsterToDefaultValues() {
        Monster defaultMonster = new Monster();
        ArrayList defaultValue = defaultMonster.valuesToBeSaved();
        defaultMonster.assignValues(defaultValue);
        return defaultMonster;
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> value = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    value.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return value;
    }
}
