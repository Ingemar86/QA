class Employee {
    // Поля класса
    private String fullName; // ФИО
    private String position;  // Должность
    private String email;     // Email
    private String phone;     // Телефон
    private double salary;    // Зарплата
    private int age;          // Возраст

    // Конструктор для инициализации полей
    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName; // Устанавливаем ФИО
        this.position = position;  // Устанавливаем должность
        this.email = email;        // Устанавливаем Email
        this.phone = phone;        // Устанавливаем телефон
        this.salary = salary;      // Устанавливаем зарплату
        this.age = age;            // Устанавливаем возраст
    }

    // Метод для вывода информации об объекте
    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println(); // Для разделения записей
    }
}

