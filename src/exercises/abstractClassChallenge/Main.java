package exercises.abstractClassChallenge;

public class Main {

    public static LinkedList linkedList = new LinkedList();
    public static BinaryTree binaryTree = new BinaryTree();

    public static void main(String[] args) {

        Item firstItem = new Item(2);
        Item secondItem = new Item(1);
        Item thirdItem = new Item(2.1);
        Item fourthItem = new Item(2.7);
        Item fifthItem = new Item(0.5);
        Item sixthItem = new Item(3);

        linkedList.addToList(firstItem);
        linkedList.addToList(secondItem);
        linkedList.addToList(thirdItem);
        linkedList.addToList(fourthItem);
        linkedList.addToList(fifthItem);
        linkedList.addToList(sixthItem);

        linkedList.printList();

        linkedList.removeFromTheList(secondItem);
        linkedList.removeFromTheList(firstItem);
        linkedList.removeFromTheList(thirdItem);
        linkedList.removeFromTheList(fourthItem);
        linkedList.removeFromTheList(sixthItem);
        linkedList.removeFromTheList(fifthItem);

        linkedList.printList();

//        binaryTree.addToBinaryTree(firstItem);
//        binaryTree.addToBinaryTree(secondItem);
//        binaryTree.addToBinaryTree(thirdItem);
//        binaryTree.addToBinaryTree(fourthItem);
//        binaryTree.addToBinaryTree(fifthItem);
//        binaryTree.addToBinaryTree(sixthItem);
//
//        binaryTree.printBinaryTree();
    }
}
