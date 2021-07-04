package anton.sample.animals.modelAnno;

import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */

@Component(/*"catBean"*/)
//default bean name: Cat->cat; CatMea->catMea; CATme->CATme
public class CatAnno implements PetActionAnno {

    public CatAnno() {
        System.out.println("Cat is created");
    }

    @Override
    public void action() {
        System.out.println("Meow-Meow");
    }
}
