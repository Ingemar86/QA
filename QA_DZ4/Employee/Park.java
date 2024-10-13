public class Park {
    // Внутренний класс Attraction для хранения информации об аттракционах
    class Attraction {
        private String name;      // Название аттракциона
        private String workingHours; // Время работы аттракциона
        private double price;     // Стоимость аттракциона

        // Конструктор для инициализации аттракциона
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void displayInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: BYN" + price);
            System.out.println(); // Для разделения записей
        }
    }

    // Массив для хранения аттракционов
    private Attraction[] attractions;
    private int count; // Количество аттракционов

    // Конструктор парка
    public Park(int capacity) {
        attractions = new Attraction[capacity]; // Инициализация массива аттракционов
        count = 0; // Изначально 0 аттракционов
    }

    // Метод для добавления аттракциона
    public void addAttraction(String name, String workingHours, double price) {
        if (count < attractions.length) {
            attractions[count] = new Attraction(name, workingHours, price);
            count++;
        } else {
            System.out.println("Нельзя добавить аттракционы");
        }
    }

    // Метод для вывода информации о всех аттракционах
    public void displayAttractions() {
        System.out.println("Аттракционы парка:");
        for (int i = 0; i < count; i++) {
            attractions[i].displayInfo(); // Вызываем метод для вывода информации
        }
    }

    // Основной класс программы
    public static void main(String[] args) {
        Park park = new Park(5); // Создаем парк для 5 аттракционов

        // Добавляем аттракционы
        park.addAttraction("Ролики", "10 AM - 10 PM", 5.50);
        park.addAttraction("Колесо обозрения", "9 AM - 11 PM", 3.00);
        park.addAttraction("Дом смехаe", "11 AM - 9 PM", 7.00);
        park.addAttraction("Гонки", "10 AM - 8 PM", 4.00);
        park.addAttraction("Лодочки", "9 AM - 10 PM", 2.50);

        // Выводим информацию о всех аттракционах
        park.displayAttractions();
    }
}