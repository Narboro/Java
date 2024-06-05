package NestedClasses_2.InnerClass;


import NestedClasses_2.InnerClass.model.Animal;

/**
 * Используя новые знания, упростите реализацию задачи 2 из предыдущего урока:
 * <a href="https://telegra.ph/Nasledovanie-Klyuchevoe-slovo-extends-i-ispolzovanie-protected-Klyuchevoe-slovo-super-Privedenie-ssylochnyh-tipov-11-23">...</a>
 * Допустимо использовать метод sound() вместо woof(), meow() и moo().
 * Метод sound() допустимо сделать публичным.
 * <p>
 * Использовать отдельное поле для хранения выводимой строки — недопустимо:)
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Main().new Cat(), new Main().new Dog(), new Main().new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    public class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("woof");
        }
    }
    public class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("moo");
        }
    }
    public class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    }
}
