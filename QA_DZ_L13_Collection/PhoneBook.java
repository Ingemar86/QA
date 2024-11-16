public class PhoneBook {

    // Хранение телефонных номеров и фамилий владельцев
    private Map<String, String> phoneBook;

    // Конструктор
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public boolean add(String surname, String phoneNumber) {
        // Проверяем, не занят ли этот номер уже
        if (phoneBook.containsKey(phoneNumber)) {
            System.out.println("Этот номер уже зарегистрирован у другого человека.");
            return false;  // Номер уже есть в справочнике
        } else {
            phoneBook.put(phoneNumber, surname);
            return true;  // Успешно добавили
        }
    }

    // Метод для получения фамилии по номеру телефона
    public String get(String phoneNumber) {
        return phoneBook.getOrDefault(phoneNumber, "Номер не найден");
    }

    public static void main(String[] args) {
        // Создаем объект справочника
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
        System.out.println("Все записи в телефонной книге:");
        phoneBook.printAllEntries();
    }
}