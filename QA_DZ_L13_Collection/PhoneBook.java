import java.util.*;

public class PhoneBook {
    // Словарь для хранения фамилий и соответствующих им списков телефонов
    private Map<String, List<String>> phoneBook;

    // Конструктор, инициализирующий словарь
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи в телефонную книгу
    public void add(String lastName, String phoneNumber) {
        // Если фамилия уже есть в телефонной книге, добавляем новый номер
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            // Если фамилия новая, создаем список и добавляем первый номер
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(lastName, phoneNumbers);
        }
    }

    // Метод для получения всех номеров по фамилии
    public List<String> get(String lastName) {
        // Возвращаем список номеров для данной фамилии, если она существует
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    // Метод для вывода всех записей в телефонной книге
    public void printAllEntries() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Телефоны: " + entry.getValue());
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

        // Поиск номеров по фамилии
        System.out.println("Телефоны Голубева: " + phoneBook.get("Голубев"));
        System.out.println("Телефоны Сорокина: " + phoneBook.get("Сорокин"));
        System.out.println("Телефоны Соколова: " + phoneBook.get("Соколов"));
        System.out.println("Телефоны Курочкина (не существует): " + phoneBook.get("Курочкин"));

        // Вывод всех записей
        System.out.println("\nВсе записи в телефонной книге:");
        phoneBook.printAllEntries();
    }
}