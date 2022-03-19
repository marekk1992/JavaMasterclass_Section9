package exercises.abstractClassChallenge;

public class BinaryTree {

    private ListItem head;

    public void addToBinaryTree(ListItem listItem) {
        if (head == null) {
            head = listItem;
            System.out.println("Added item <" + head.value + "> to the binary tree.");
        } else {
            ListItem checkedItem = head;
            boolean isAdded = false;
            boolean movingLeft = false;
            while (!isAdded) {
                if (checkedItem.compareTo(listItem) == 0) {
                    System.out.println("Addition failed. Item <" + listItem.value + "> already exists.");
                    isAdded = true;
                } else if (checkedItem.compareTo(listItem) > 0) {
                    movingLeft = true;
                    if (checkedItem.leftItem == null) {
                        checkedItem.setLeftItem(listItem);
                        System.out.println("Added item <" + listItem.value + "> to the binary tree.");
                        isAdded = true;
                    }
                } else {
                    if (checkedItem.rightItem == null) {
                        checkedItem.setRightItem(listItem);
                        System.out.println("Added item <" + listItem.value + "> to the binary tree.");
                        isAdded = true;
                    }
                }
                if (movingLeft) {
                    checkedItem = checkedItem.moveToLeftItem();
                    movingLeft = false;
                } else {
                    checkedItem = checkedItem.moveToRightItem();
                }
            }
        }
    }

    public void printBinaryTree() {
        printItem(head);
    }

    private void printItem(ListItem listItem) {
        if (listItem == null) {
            return;
        }
        System.out.println(listItem.value);
        printItem(listItem.leftItem);
        printItem(listItem.rightItem);
    }


}
