// Интерфейс для фигур
interface Shape {
    // Дефолтный метод для расчета периметра, возвращает 0 по умолчанию
    default double calculatePerimeter() {
        return 0; // Возвращаем 0 как стандартное значение
    }

    // Абстрактный метод для расчета площади
    double calculateArea();

    // Метод для получения цвета заливки
    String getFillColor();

    // Метод для получения цвета границы
    String getBorderColor();
}

// Класс для круга, реализует интерфейс Shape
class Circle implements Shape {
    private double radius; // Радиус круга
    private String fillColor; // Цвет заливки круга
    private String borderColor; // Цвет границы круга

    // Конструктор для создания круга с заданными параметрами
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius; // Инициализация радиуса
        this.fillColor = fillColor; // Инициализация цвета заливки
        this.borderColor = borderColor; // Инициализация цвета границы
    }

    // Реализация метода для расчета периметра (окружности)
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Формула: 2 * π * R
    }

    // Реализация метода для расчета площади круга
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Формула: π * R^2
    }

    // Метод для получения цвета заливки
    @Override
    public String getFillColor() {
        return fillColor; // Возвращаем цвет заливки
    }

    // Метод для получения цвета границы
    @Override
    public String getBorderColor() {
        return borderColor; // Возвращаем цвет границы
    }
}

// Класс для прямоугольника, реализует интерфейс Shape
class Rectangle implements Shape {
    private double width; // Ширина прямоугольника
    private double height; // Высота прямоугольника
    private String fillColor; // Цвет заливки прямоугольника
    private String borderColor; // Цвет границы прямоугольника

    // Конструктор для создания прямоугольника с заданными параметрами
    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width; // Инициализация ширины
        this.height = height; // Инициализация высоты
        this.fillColor = fillColor; // Инициализация цвета заливки
        this.borderColor = borderColor; // Инициализация цвета границы
    }

    // Реализация метода для расчета периметра прямоугольника
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height); // Формула: 2 * (ширина + высота)
    }

    // Реализация метода для расчета площади прямоугольника
    @Override
    public double calculateArea() {
        return width * height; // Формула: ширина * высота
    }

    // Метод для получения цвета заливки
    @Override
    public String getFillColor() {
        return fillColor; // Возвращаем цвет заливки
    }

    // Метод для получения цвета границы
    @Override
    public String getBorderColor() {
        return borderColor; // Возвращаем цвет границы
    }
}

// Класс для треугольника, реализует интерфейс Shape
class Triangle implements Shape {
    private double sideA; // Длина стороны A
    private double sideB; // Длина стороны B
    private double sideC; // Длина стороны C
    private String fillColor; // Цвет заливки треугольника
    private String borderColor; // Цвет границы треугольника

    // Конструктор для создания треугольника с заданными параметрами
    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA; // Инициализация стороны A
        this.sideB = sideB; // Инициализация стороны B
        this.sideC = sideC; // Инициализация стороны C
        this.fillColor = fillColor; // Инициализация цвета заливки
        this.borderColor = borderColor; // Инициализация цвета границы
    }

    // Реализация метода для расчета периметра треугольника
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC; // Формула: A + B + C
    }

    // Реализация метода для расчета площади треугольника
    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2; // Полупериметр
        // Формула Герона для расчета площади
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    // Метод для получения цвета заливки
    @Override
    public String getFillColor() {
        return fillColor; // Возвращаем цвет заливки
    }

    // Метод для получения цвета границы
    @Override
    public String getBorderColor() {
        return borderColor; // Возвращаем цвет границы
    }
}
