package anton.sample.animals.model;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
public class Cat implements PetAction {

    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void action() {
        System.out.println("Meow-Meow");
    }
}
