public class Main {
    public static void main(String[] args) {
        // Создаем массив из 5 объектов Employee
        Employee[] employees = new Employee[5];
        Park park = new Park(5); // Создаем парк для 5 аттракционов

        // Добавляем аттракционы
        park.addAttraction("Ролики", "10 AM - 10 PM", 5.50);
        park.addAttraction("Колесо обозрения", "9 AM - 11 PM", 3.00);
        park.addAttraction("Дом смехаe", "11 AM - 9 PM", 7.00);
        park.addAttraction("Гонки", "10 AM - 8 PM", 4.00);
        park.addAttraction("Лодочки", "9 AM - 10 PM", 2.50);

        // Инициализируем массив данными сотрудников
        employees[0] = new Employee("Ivan Ivanov", "Manager", "ivan.ivanov@example.com", "+1234567890", 50000, 30);
        employees[1] = new Employee("Anna Petrova", "Developer", "anna.petrov@example.com", "+0987654321", 60000, 25);
        employees[2] = new Employee("Sergey Sidorov", "Designer", "sergey.sidorova@example.com", "+1122334455", 55000, 35);
        employees[3] = new Employee("Olga Smirnova", "Analyst", "olga.smirnova@example.com", "+2233445566", 65000, 28);
        employees[4] = new Employee("Dmitry Nikolaev", "HR", "dmitry.nikolaev@example.com", "+3344556677", 70000, 40);

        // Выводим информацию о всех аттракционах
        park.displayAttractions();
        
        // Выводим информацию о каждом сотруднике
        for (Employee employee : employees) {
            employee.displayInfo(); // Вызываем метод для вывода информации
        }
    }
}

