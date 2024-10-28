public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // Создаем экземпляр собаки
        dog1.run(300); // Собака пробегает 300 м
        dog1.swim(5); // Собака плывет 5 м

        Cat cat1 = new Cat(); // Создаем экземпляр кота
        cat1.run(150); // Кот пробегает 150 м
        cat1.swim(10); // Кот пытается плавать

        FoodBowl bowl = new FoodBowl(5); // Создаем миску с 5 единицами еды
        Cat[] cats = { new Cat(), new Cat(), new Cat() }; // Создаем массив из трех котов

        // Цикл для кормления котов из миски
        for (Cat cat : cats) {
            if (cat.eat(bowl)) { // Если кот поел
                System.out.println("Кот поел и теперь сыт.");
            } else {
                System.out.println("Коту не хватило еды."); // Если еды не хватило
            }
        }

        // Вывод количества созданных животных, собак и котов
        System.out.println("Количество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("Количество созданных котов: " + Cat.getCatCount());
    }
}
