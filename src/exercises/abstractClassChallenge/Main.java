package exercises.abstractClassChallenge;

public class Main {

    public static DataStructure myDataStructure = new BinaryTree();

    public static void main(String[] args) {

        Item firstItem = new Item(2);
        Item secondItem = new Item(1);
        Item thirdItem = new Item(2.1);
        Item fourthItem = new Item(2.7);
        Item fifthItem = new Item(0.5);
        Item sixthItem = new Item(3);

        myDataStructure.addItem(firstItem);
        myDataStructure.addItem(secondItem);
        myDataStructure.addItem(thirdItem);
        myDataStructure.addItem(fourthItem);
        myDataStructure.addItem(fifthItem);
        myDataStructure.addItem(sixthItem);

        myDataStructure.printItems();

        myDataStructure.removeItem(secondItem);
        myDataStructure.removeItem(firstItem);
        myDataStructure.removeItem(thirdItem);
        myDataStructure.removeItem(fourthItem);
        myDataStructure.removeItem(sixthItem);
        myDataStructure.removeItem(fifthItem);

        myDataStructure.printItems();

    }
}
