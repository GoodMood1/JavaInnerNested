package pack;

import java.util.HashMap;

public class Main {
    public static String printColor(HashMap<String, String> Colors, String separator, String text) {
        for (String key : Colors.keySet()) {
            if (key.equalsIgnoreCase(separator)) {
                return Colors.get(key) + text;
            }
        }
        return text;
    }

    public static void main(String[] args) {
        //2
        HashMap<String, String> Colors = new HashMap<String, String>();
        Colors.put("RED", "\033[91m");
        Colors.put("PINK", "\033[95m");
        Colors.put("YELLOW", "\033[93m");
        Colors.put("GREEN", "\033[92m");
        Colors.put("SEA", "\033[96m");
        Colors.put("BLUE", "\033[94m");
        Colors.put("WHITE", "\033[97m");
        Colors.put("GRAY", "\033[91m");
        Colors.put("BLACK", "\033[30m");

        System.out.println(printColor(Colors, "123", "SomeText"));

    }
}
