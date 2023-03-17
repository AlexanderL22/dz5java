
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        System.out.println("Введите фамилию : ");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.next();
        Map<String, String> resultPhoneBook = fillPhoneBook();
        getPhoneInfoByName(resultPhoneBook, name);
        iScanner.close();

    }

    public static Map<String, String> fillPhoneBook() {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("89804455883", "Tigrov");
        phoneBook.put("89103586695", "Kirilove");
        phoneBook.put("89162116544", "Novik");
        phoneBook.put("89000080800", "Targov");
        phoneBook.put("89104421063", "Targov");
        phoneBook.put("89106456353", "Kirilove");
        phoneBook.put("89112397864", "Kirilove");
        phoneBook.put("89345678987", "Novik");
        return phoneBook;

    }

    public static void getPhoneInfoByName(Map<String, String> phoneBook, String name) {

        for (Map.Entry<String, String> phoneBookEntry : phoneBook.entrySet()) {
            if (phoneBookEntry.getValue().equalsIgnoreCase(name)) {
                System.out.println(phoneBookEntry.getKey());
            }
        }

    }
}
