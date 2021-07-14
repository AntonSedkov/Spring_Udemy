package anton.sample.ioc_di.animals.tests.xmltest;

import anton.sample.ioc_di.animals.model.Cat;
import anton.sample.ioc_di.animals.model.Dog;
import anton.sample.ioc_di.animals.model.Person;
import anton.sample.ioc_di.animals.model.PetAction;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
public class SimpleFirstTest {
    public static void main(String[] args) {
        PetAction pet = new Cat();
        pet.action();
        pet = new Dog();
        pet.action();

        Person person = new Person(pet);
        person.sayHi();

    }
}
