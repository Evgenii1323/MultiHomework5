import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> map = new TreeMap<>();

    public int add(String name, String phone) {
        map.put(name, phone);
        return map.size();
    }

    public String findByNumber(String phone) {
        String key = null;
        for (String i : map.keySet()) {
            if (map.get(i).equals(phone)) {
                key = i;
            }
        }
        return key;
    }
}