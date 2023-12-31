package nameinverter;

import java.util.ArrayList;
import java.util.Arrays;

public class NameInverter {
    public String inverterName(String name) {
        if (name.equals("")) {
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        } else {
            ArrayList<String> names = new ArrayList<>(Arrays.asList(name.split("\\s+")));
            removeHonorifics(names);
            return names.get(1) + ", " + names.get(0);
        }
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (names.get(0).matches("Mrs.|Mr.|Miss") && names.size() > 2) {
            names.remove(0);
        }
    }
}
