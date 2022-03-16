package exercises.abstractClassChallenge;

public class Item extends ListItem {

    public Item(double value) {
        super(value);
    }

    @Override
    public ListItem moveToNextItem() {
        return this.getNextItem();
    }

    @Override
    public ListItem moveToPreviousItem() {
        return this.getPreviousItem();
    }

    @Override
    public void setNextItem(ListItem nextItem) {
        super.setNextItem(nextItem);
    }

    @Override
    public void setPreviousItem(ListItem previousItem) {
        super.setPreviousItem(previousItem);
    }

    @Override
    public int compareTo(ListItem listItem) {
        if (getValue() == listItem.getValue()) {
            return 0;
        } else if (getValue() > listItem.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }
}
