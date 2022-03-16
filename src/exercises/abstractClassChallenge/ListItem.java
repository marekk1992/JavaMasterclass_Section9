package exercises.abstractClassChallenge;

public abstract class ListItem {

    private ListItem nextItem;
    private ListItem previousItem;
    private double value;

    public ListItem(double value) {
        this.value = value;
    }

    public abstract ListItem moveToNextItem();
    public abstract ListItem moveToPreviousItem();
    public abstract int compareTo(ListItem listItem);

    public double getValue() {
        return value;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }

    public void setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
    }

    public ListItem getNextItem() {
        return nextItem;
    }

    public ListItem getPreviousItem() {
        return previousItem;
    }


}
