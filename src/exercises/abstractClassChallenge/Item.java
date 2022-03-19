package exercises.abstractClassChallenge;

public class Item extends ListItem {

    public Item(Object value) {
        super(value);
    }

    @Override
    public ListItem moveToRightItem() {
        return rightItem;
    }

    @Override
    public ListItem moveToLeftItem() {
        return leftItem;
    }

    @Override
    public void setRightItem(ListItem nextItem) {
        this.rightItem = nextItem;
    }

    @Override
    public void setLeftItem(ListItem previousItem) {
        this.leftItem = previousItem;
    }

    @Override
    public int compareTo(ListItem listItem) {
        String existingItem = value.toString();
        String itemToBeAdded = listItem.value.toString();
        return existingItem.compareTo(itemToBeAdded);
    }
}
