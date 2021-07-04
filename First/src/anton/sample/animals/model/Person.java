package anton.sample.animals.model;

import org.springframework.beans.factory.annotation.Value;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
public class Person {
    private PetAction pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("person without pet is created");
    }

    public Person(PetAction pet) {
        System.out.println("person is created");
        this.pet = pet;
    }

    public void setPet(PetAction pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

    public void sayHi() {
        pet.action();
    }

}
