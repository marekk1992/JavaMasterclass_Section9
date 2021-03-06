package exercises.abstractClassChallenge;

public abstract class ListItem {

    ListItem rightItem;
    ListItem leftItem;
    private Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract ListItem moveToRightItem();
    public abstract ListItem moveToLeftItem();
    public abstract void setRightItem(ListItem listItem);
    public abstract void setLeftItem(ListItem listItem);
    public abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }
}
