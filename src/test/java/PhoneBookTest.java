import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        String name = "Jack";
        String phone = "12345";
        int expected = 1;

        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add(name, phone);

        Assertions.assertEquals(expected, result);
    }
}