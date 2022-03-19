package exercises.abstractClassChallenge;

public class LinkedList {

    private ListItem head;

    public void addToList(ListItem listItem) {
        if (head == null) {
            head = listItem;
            System.out.println("Item <" + listItem.value + "> added to the list.");
        } else {
            ListItem checkedItem = head;
            boolean isAdded = false;
            while (!isAdded) {
                if (checkedItem.compareTo(listItem) == 0) {
                    System.out.println("Item <" + listItem.value + "> already exists in a list. " +
                            "Addition failed.");
                    isAdded = true;
                } else if (checkedItem.compareTo(listItem) > 0) {
                    listItem.setRightItem(checkedItem);
                    head = listItem;
                    checkedItem.setLeftItem(listItem);
                    System.out.println("Item <" + listItem.value + "> added to the list.");
                    isAdded = true;
                } else {
                    if (checkedItem.rightItem == null) {
                        checkedItem.setRightItem(listItem);
                        listItem.setLeftItem(checkedItem);
                        System.out.println("Item <" + listItem.value + "> added to the list.");
                        isAdded = true;
                    } else if (checkedItem.rightItem.compareTo(listItem) > 0) {
                        listItem.setRightItem(checkedItem.rightItem);
                        checkedItem.setRightItem(listItem);
                        listItem.setLeftItem(checkedItem);
                        System.out.println("Item <" + listItem.value + "> added to the list.");
                        isAdded = true;
                    }
                }
                checkedItem = checkedItem.moveToRightItem();
            }
        }
    }

    public void removeFromTheList(ListItem listItem) {
        if (head == null) {
            System.out.println("List is empty.");
        }
        ListItem itemToRemove = findItem(listItem);
        if (itemToRemove == null) {
            System.out.println("Can`t find item <" + listItem.value + "> in the list.");
        } else if (itemToRemove.leftItem == null) {
            if (itemToRemove.rightItem != null) {
                head = itemToRemove.rightItem;
                System.out.println("Item <" + itemToRemove.value + "> removed from the list.");
            } else {
                head = null;
                System.out.println("Item <" + itemToRemove.value + "> removed from the list. "
                        + "List is empty now.");
            }
        } else if (itemToRemove.rightItem == null) {
            if (itemToRemove.leftItem != null) {
                itemToRemove.leftItem.setRightItem(null);
                System.out.println("Item <" + itemToRemove.value + "> removed from the list.");
            } else {
                head = null;
                System.out.println("Item <" + itemToRemove.value + "> removed from the list. "
                        + "List is empty now.");
            }
        } else {
            itemToRemove.leftItem.setRightItem(itemToRemove.rightItem);
            itemToRemove.rightItem.setLeftItem(itemToRemove.leftItem);
            System.out.println("Item <" + itemToRemove.value + "> removed from the list.");
        }
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

    public void printList() {
        printNextItem(head);
    }

    private void printNextItem(ListItem listItem) {
        if (listItem == null) {
            return;
        }
        System.out.println(listItem.value);
        printNextItem(listItem.rightItem);
    }
}
