// Основной класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Создаем объект круга с радиусом 5, красной заливкой и черной границей
        Shape circle = new Circle(5, "Красный", "Черный");

        // Создаем объект прямоугольника с шириной 4, высотой 6, синей заливкой и зеленой границей
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");

        // Создаем объект треугольника с длинами сторон 3, 4 и 5, желтой заливкой и фиолетовой границей
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        // Вывод характеристик круга
        System.out.println("Круг:");
        System.out.println("Периметр: " + circle.calculatePerimeter()); // Вывод периметра круга
        System.out.println("Площадь: " + circle.calculateArea()); // Вывод площади круга
        System.out.println("Цвет заливки: " + circle.getFillColor()); // Вывод цвета заливки круга
        System.out.println("Цвет границы: " + circle.getBorderColor()); // Вывод цвета границы круга
        System.out.println(); // Пустая строка для разделения вывода

        // Вывод характеристик прямоугольника
        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + rectangle.calculatePerimeter()); // Вывод периметра прямоугольника
        System.out.println("Площадь: " + rectangle.calculateArea()); // Вывод площади прямоугольника
        System.out.println("Цвет заливки: " + rectangle.getFillColor()); // Вывод цвета заливки прямоугольника
        System.out.println("Цвет границы: " + rectangle.getBorderColor()); // Вывод цвета границы прямоугольника
        System.out.println(); // Пустая строка для разделения вывода

        // Вывод характеристик треугольника
        System.out.println("Треугольник:");
        System.out.println("Периметр: " + triangle.calculatePerimeter()); // Вывод периметра треугольника
        System.out.println("Площадь: " + triangle.calculateArea()); // Вывод площади треугольника
        System.out.println("Цвет заливки: " + triangle.getFillColor()); // Вывод цвета заливки треугольника
        System.out.println("Цвет границы: " + triangle.getBorderColor()); // Вывод цвета границы треугольника
    }
}