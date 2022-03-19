package exercises.abstractClassChallenge;

public class LinkedList implements DataStructure {

    private ListItem head;

    public void addItem(ListItem listItem) {
        if (head == null) {
            head = listItem;
            System.out.println("Item <" + listItem.getValue() + "> added to the list.");
        } else {
            ListItem checkedItem = head;
            boolean isAdded = false;
            while (!isAdded) {
                if (checkedItem.compareTo(listItem) == 0) {
                    System.out.println("Item <" + listItem.getValue() + "> already exists in a list. " +
                            "Addition failed.");
                    return;
                } else if (checkedItem.compareTo(listItem) > 0) {
                    listItem.setRightItem(checkedItem);
                    head = listItem;
                    checkedItem.setLeftItem(listItem);
                    System.out.println("Item <" + listItem.getValue() + "> added to the list.");
                    isAdded = true;
                } else {
                    if (checkedItem.rightItem == null) {
                        checkedItem.setRightItem(listItem);
                        listItem.setLeftItem(checkedItem);
                        System.out.println("Item <" + listItem.getValue() + "> added to the list.");
                        isAdded = true;
                    } else if (checkedItem.rightItem.compareTo(listItem) > 0) {
                        listItem.setRightItem(checkedItem.rightItem);
                        checkedItem.setRightItem(listItem);
                        listItem.setLeftItem(checkedItem);
                        checkedItem.rightItem.setLeftItem(listItem);
                        System.out.println("Item <" + listItem.getValue() + "> added to the list.");
                        isAdded = true;
                    }
                }
                checkedItem = checkedItem.moveToRightItem();
            }
        }
    }

    public void removeItem(ListItem listItem) {
        if (head == null) {
            System.out.println("List is empty.");
        }
        ListItem itemToRemove = findItem(listItem);
        if (itemToRemove == null) {
            System.out.println("Can`t find item <" + listItem.getValue() + "> in the list.");
        } else if (isHead(itemToRemove)) {
            if (itemToRemove.rightItem != null) {
                itemToRemove.setLeftItem(null);
                head = itemToRemove.rightItem;
                System.out.println("Item <" + itemToRemove.getValue() + "> removed from the list.");
            } else {
                head = null;
                System.out.println("Item <" + itemToRemove.getValue() + "> removed from the list. "
                        + "List is empty now.");
            }
        } else if (itemToRemove.rightItem == null) {
            if (itemToRemove.leftItem != null) {
                itemToRemove.leftItem.setRightItem(null);
                itemToRemove.setLeftItem(null);
                System.out.println("Item <" + itemToRemove.getValue() + "> removed from the list.");
            } else {
                head = null;
                System.out.println("Item <" + itemToRemove.getValue() + "> removed from the list. "
                        + "List is empty now.");
            }
        } else {
            itemToRemove.leftItem.setRightItem(itemToRemove.rightItem);
            itemToRemove.rightItem.setLeftItem(itemToRemove.leftItem);
            itemToRemove.setLeftItem(null);
            itemToRemove.setRightItem(null);
            System.out.println("Item <" + itemToRemove.getValue() + "> removed from the list.");
        }
    }

    private boolean isHead(ListItem listItem) {
        return listItem.compareTo(head) == 0;
    }

    private ListItem findItem(ListItem listItem) {
        ListItem checkedItem = head;
        while (checkedItem != null) {
            if (checkedItem.compareTo(listItem) == 0) {
                return checkedItem;
            }
            checkedItem = checkedItem.moveToRightItem();
        }
        return null;
    }

    public void printItems() {
        printNextItem(head);
    }

    private void printNextItem(ListItem listItem) {
        if (listItem == null) {
            return;
        }
        System.out.println(listItem.getValue());
        printNextItem(listItem.rightItem);
    }
}
