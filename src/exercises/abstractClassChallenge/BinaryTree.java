package exercises.abstractClassChallenge;

public class BinaryTree implements DataStructure {

    private ListItem head;

    public void addItem(ListItem listItem) {
        if (head == null) {
            head = listItem;
            System.out.println("Added item <" + head.getValue() + "> to the binary tree.");
        } else {
            ListItem checkedItem = head;
            boolean isAdded = false;
            while (!isAdded) {
                if (checkedItem.compareTo(listItem) == 0) {
                    System.out.println("Addition failed. Item <" + listItem.getValue() + "> already exists.");
                    isAdded = true;
                } else if (checkedItem.compareTo(listItem) > 0) {
                    if (checkedItem.leftItem == null) {
                        checkedItem.setLeftItem(listItem);
                        System.out.println("Added item <" + listItem.getValue() + "> to the binary tree.");
                        isAdded = true;
                    } else {
                        checkedItem = checkedItem.moveToLeftItem();
                    }
                } else {
                    if (checkedItem.rightItem == null) {
                        checkedItem.setRightItem(listItem);
                        System.out.println("Added item <" + listItem.getValue() + "> to the binary tree.");
                        isAdded = true;
                    } else {
                        checkedItem = checkedItem.moveToRightItem();
                    }
                }
            }
        }
    }

    public void printItems() {
        printItem(head);
    }

    private void printItem(ListItem listItem) {
        if (listItem == null) {
            return;
        }
        System.out.println(listItem.getValue());
        printItem(listItem.leftItem);
        printItem(listItem.rightItem);
    }

    @Override
    public void removeItem(ListItem listItem) {

    }
}
