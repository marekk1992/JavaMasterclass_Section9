package exercises.abstractClassChallenge;

public class Main {

    public static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {
        Item firstItem = new Item(2.5);
        Item secondItem = new Item(3.5);
        Item thirdItem = new Item(4.5);
        Item fourthItem = new Item(6.5);
        Item fifthItem = new Item(5.5);

        linkedList.addToList(firstItem);
        System.out.println("================");
        linkedList.addToList(secondItem);
        System.out.println("================");
        linkedList.addToList(thirdItem);
        System.out.println("================");
        linkedList.addToList(fourthItem);
        System.out.println("================");
        linkedList.addToList(fifthItem);
    }
}
