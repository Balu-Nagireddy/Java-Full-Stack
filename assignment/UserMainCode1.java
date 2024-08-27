package assignment;

import java.util.HashMap;
import java.util.Map;

class UserMainCode1 {
    public static int sizeOfResultandHashMap(HashMap<Integer, String> map) {
        map.entrySet().removeIf(entry -> entry.getKey() % 4 == 0);
        return map.size();
    }
}