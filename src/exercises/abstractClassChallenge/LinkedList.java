package exercises.abstractClassChallenge;

public class LinkedList {

    private ListItem head;

    public void addToList(ListItem listItem) {
        if (head == null) {
            head = listItem;
            System.out.println("Added first item to the list.");
        } else {
            ListItem checkedItem = head;
            boolean finishedAddition = false;
            while (!finishedAddition) {
                if (checkedItem.compareTo(listItem) == 0) {
                    finishedAddition = true;
                    System.out.println("Item with this value already exists.");
                } else if (checkedItem.compareTo(listItem) > 0) {
                    checkedItem.getPreviousItem().setNextItem(listItem);
                    listItem.setPreviousItem(checkedItem.getPreviousItem());
                    listItem.setNextItem(checkedItem);
                    System.out.println("Item added to the list before.");
                    finishedAddition = true;
                } else {
                    listItem.setNextItem(checkedItem.getNextItem());
                    checkedItem.setNextItem(listItem);
                    listItem.setPreviousItem(checkedItem);
                    System.out.println("Item added to the list after.");
                    finishedAddition = true;
                }
                checkedItem = checkedItem.moveToNextItem();
            }
        }
    }

    public void removeFromTheList(ListItem listItem) {

    }
}
