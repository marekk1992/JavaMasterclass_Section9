package exercises.interfaceChallenge;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Saveable firstSaveable = new Player("Marek", 150, 100, 30);
        List<String> firstSaveableFields = firstSaveable.write();
        firstSaveable.read(firstSaveableFields);
        System.out.println(firstSaveable);

        Saveable secondSaveable = copyObject(firstSaveable);
        System.out.println(secondSaveable);

        Saveable thirdSaveable = new Monster("BlackBeard", "dwarf", 50, 140, 80);
        List<String> thirdSaveableFields = thirdSaveable.write();
        thirdSaveable.read(thirdSaveableFields);
        System.out.println(thirdSaveable);

        Saveable fourthSaveable = copyObject(thirdSaveable);
        System.out.println(fourthSaveable);
    }

    public static Saveable copyObject(Saveable object) {
        List<String> newObjectList = object.write();
        if (newObjectList.size() == 4) {
            Saveable newObject = new Player();
            newObject.read(newObjectList);
            return newObject;
        }
        Saveable newObject = new Monster();
        newObject.read(newObjectList);
        return newObject;
    }
}
