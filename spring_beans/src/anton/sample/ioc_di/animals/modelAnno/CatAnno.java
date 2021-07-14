package anton.sample.ioc_di.animals.modelAnno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */

@Component(/*"catBean"*/)
@Scope("prototype")
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
