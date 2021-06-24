package anton.sample.animals.model;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
public class Dog implements PetAction {

    public Dog() {
        System.out.println("Dog is created");
    }

    @Override
    public void action() {
        System.out.println("Gav-Gav");
    }
}
