import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void testAdd () {
        String name = "Jack";
        String phone = "12345";
        int expected = 1;

        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add(name, phone);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {
        String name = "Jack";
        String phone = "12345";

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, phone);
        String result = phoneBook.findByNumber(phone);

        Assertions.assertEquals(name, result);
    }

    @Test
    public void testFindByName () {
        String name = "Jack";
        String phone = "12345";

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, phone);
        String result = phoneBook.findByName(name);

        Assertions.assertEquals(phone, result);
    }

    @Test
    public void testPrintAllNames() {
        String name = "Jack";
        String phone = "12345";
        String name1 = "John";
        String phone1 = "123";
        String expected = "Jack John ";


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name1, phone1);
        phoneBook.add(name, phone);
        String result = phoneBook.printAllNames();

        Assertions.assertEquals(expected, result);
    }
}