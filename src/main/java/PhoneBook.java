import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> map = new TreeMap<>();

    public int add(String name, String phone) {
        map.put(name, phone);
        return map.size();
    }
}