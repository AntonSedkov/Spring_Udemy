package anton.sample.animals.modelAnno;

import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */

@Component
public class DogAnno implements PetActionAnno {

    public DogAnno() {
        System.out.println("Dog is created");
    }

    @Override
    public void action() {
        System.out.println("Gav-Gav");
    }

    //для prototype - destroy метод не вызывается
    //может быть private, protected - без параметров - может иметь return
    public void init() {
        System.out.println("Dog init");
    }

    //может быть private, protected - без параметров - может иметь return
    public void destroy() {
        System.out.println("Dog destroy");
    }
}
