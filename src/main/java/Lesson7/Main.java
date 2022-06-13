package Lesson7;

public class Main {
    public static
    void main(String[] args) {
        Cats[] cats = {new Cats("Вася", 50), new Cats("Мурка", 50), new Cats("Снежка", 25), new Cats("Дымок", 5), new Cats("Котейка", 1)};
// здесь вводим наполнение миски и программа автоматический определит какой из котов сможет наесться а какой нет.
        Plate plate = new Plate( 80);

        for (Cats cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}

