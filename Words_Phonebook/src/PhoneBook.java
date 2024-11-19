import java.util.*;

public class PhoneBook {
    // Словарь для хранения номеров телефонов и соответствующих им фамилий
    private Map<String, List<String>> phoneBook;

    // Конструктор, инициализирующий словарь
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи в телефонную книгу
    public void add(String lastName, String phoneNumber) {
        // Получаем список фамилий по номеру телефона, если номер существует, или создаем новый список
        phoneBook.putIfAbsent(phoneNumber, new ArrayList<>());
        phoneBook.get(phoneNumber).add(lastName);
    }

    // Метод для получения всех фамилий по номеру телефона
    public List<String> get(String phoneNumber) {
        // Возвращаем список фамилий для данного номера телефона, если номер существует
        return phoneBook.getOrDefault(phoneNumber, Collections.emptyList());
    }

    // Метод для вывода всех записей в телефонной книге
    public void printAllEntries() {
        // Пройдем по всем записям и красиво выведем
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пуста.");
        } else {
            for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
                System.out.println("Телефон: " + entry.getKey() + ", Фамилии: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавление записей
        phoneBook.add("Голубев", "123-456-789");
        phoneBook.add("Сорокин", "987-654-321");
        phoneBook.add("Соколов", "111-222-333");
        phoneBook.add("Синицын", "555-555-555");
        phoneBook.add("Голубев", "444-555-666");
        phoneBook.add("Сорокин", "123-456-789");

        // Поиск фамилий по номеру телефона
        System.out.println("Фамилии для номера 123-456-789: " + phoneBook.get("123-456-789"));
        System.out.println("Фамилии для номера 987-654-321: " + phoneBook.get("987-654-321"));
        System.out.println("Фамилии для номера 111-222-333: " + phoneBook.get("111-222-333"));
        System.out.println("Фамилии для номера 000-000-000 (не существует): " + phoneBook.get("000-000-000"));

        // Вывод всех записей
        System.out.println("\nВсе записи в телефонной книге:");
        phoneBook.printAllEntries();
    }
}
