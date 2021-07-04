package anton.sample.animals.modelAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
@Component("personBean")
public class PersonAnno {

    /*  @Autowired
      @Qualifier("dogAnno")*/
    private PetActionAnno pet;
    private String surname;
    private int age;

    public PersonAnno() {
        System.out.println("person without pet is created");
    }

/*    @Autowired
    public PersonAnno(@Qualifier("catAnno") PetActionAnno pet) {
        System.out.println("person is created");
        this.pet = pet;
    }*/

    @Autowired
    @Qualifier("dogAnno")
    public void setPet(PetActionAnno pet) {
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
