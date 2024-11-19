// Базовый класс Животное
class Animal {
    // Статическая переменная для подсчета всех животных
    private static int animalCount = 0;

    // Конструктор, увеличивающий счетчик животных при создании нового экземпляра
    public Animal() {
        animalCount++;
    }

    // Метод для получения количества всех животных
    public static int getAnimalCount() {
        return animalCount;
    }

    // Метод для бега, может быть переопределен в подклассах
    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    // Метод для плавания, может быть переопределен в подклассах
    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }
}

// Класс Собака, наследует от Животного
class Dog extends Animal {
    // Статическая переменная для подсчета созданных собак
    private static int dogCount = 0;

    // Конструктор, увеличивающий счетчик собак при создании нового экземпляра
    public Dog() {
        dogCount++;
    }

    // Переопределенный метод для бега
    @Override
    public void run(int distance) {
        // Проверка, может ли собака пробежать указанное расстояние
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать " + distance + " м.");
        }
    }

    // Переопределенный метод для плавания
    @Override
    public void swim(int distance) {
        // Проверка, может ли собака проплыть указанное расстояние
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть " + distance + " м.");
        }
    }

    // Метод для получения количества созданных собак
    public static int getDogCount() {
        return dogCount;
    }
}

// Класс Кот, наследует от Животного
class Cat extends Animal {
    // Статическая переменная для подсчета созданных котов
    private static int catCount = 0;
    // Поле, показывающее, сыт ли кот
    private boolean isFull = false;

    // Конструктор, увеличивающий счетчик котов при создании нового экземпляра
    public Cat() {
        catCount++;
    }

    // Переопределенный метод для бега
    @Override
    public void run(int distance) {
        // Проверка, может ли кот пробежать указанное расстояние
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать " + distance + " м.");
        }
    }

    // Переопределенный метод для плавания
    @Override
    public void swim(int distance) {
        // Сообщение, что кот не умеет плавать
        System.out.println("Кот не умеет плавать.");
    }

    // Метод, позволяющий коту поесть из миски
    public boolean eat(FoodBowl bowl) {
        // Проверка, есть ли еда в миске
        if (bowl.getFood() > 0) {
            bowl.decreaseFood(1); // Уменьшаем количество еды на 1
            isFull = true; // Кот становится сытым
            return true; // Возвращаем true, если кот поел
        }
        return false; // Возвращаем false, если еды не хватило
    }

    // Метод для проверки, сыт ли кот
    public boolean isFull() {
        return isFull;
    }

    // Метод для получения количества созданных котов
    public static int getCatCount() {
        return catCount;
    }
}

// Класс Миска
class FoodBowl {
    // Поле, содержащее количество еды в миске
    private int food;

    // Конструктор, инициализирующий количество еды в миске
    public FoodBowl(int food) {
        this.food = Math.max(0, food); // Не допускаем отрицательного количества еды
    }

    // Метод для получения текущего количества еды
    public int getFood() {
        return food;
    }

    // Метод для уменьшения количества еды в миске
    public void decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount; // Уменьшаем количество еды
        } else {
            food = 0; // Если еды не хватает, устанавливаем 0
        }
    }

    // Метод для добавления еды в миску
    public void addFood(int amount) {
        if (amount > 0) {
            food += amount; // Увеличиваем количество еды в миске
        }
    }
}
