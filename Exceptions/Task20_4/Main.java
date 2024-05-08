package Task20_4;

import Task20_4.Service.ArrayValidationException;
import Task20_4.Service.UnknownAnimalException;
import Task20_4.model.*;

/**
 * Реализовать задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson13_inheritance/task2">...</a>
 * используя getClass().
 */
public class Main {
    public static void main(String[] args) throws UnknownAnimalException, ArrayValidationException {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), null, new Cow(), new Lizard()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        int index = 0;
        for (Animal animal : animals) {
            if(animal == null){
                throw new ArrayValidationException("Animal class is null at index " + index);
            }
            sound(animal);
            index++;
        }
    }

    private static void sound(Animal animal) {
        if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).meow();
        } else if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        } else {
//            System.out.println("Unknown animal!");
            throw new UnknownAnimalException("Unknown animal!");
        }
    }
}
