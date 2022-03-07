package exercises.interfaceChallenge;

import java.util.List;

public interface Saveable {

    List<String> write();
    void read(List<String> fields);
}
