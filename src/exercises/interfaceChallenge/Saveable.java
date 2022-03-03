package exercises.interfaceChallenge;

import java.util.ArrayList;

public interface Saveable {

    ArrayList valuesToBeSaved();
    void assignValues(ArrayList fields);
}
