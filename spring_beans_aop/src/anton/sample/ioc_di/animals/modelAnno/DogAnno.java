package anton.sample.ioc_di.animals.modelAnno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */

@Component
@Scope("singleton")
public class DogAnno implements PetActionAnno {

    public DogAnno() {
        System.out.println("Dog is created");
    }

    @Override
    public void action() {
        System.out.println("Gav-Gav");
    }

    @PostConstruct
    //для prototype - destroy метод не вызывается
    //может быть private, protected - без параметров - может иметь return
    public void init() {
        System.out.println("Dog init");
    }

    @PreDestroy
    //может быть private, protected - без параметров - может иметь return
    public void destroy() {
        System.out.println("Dog destroy");
    }
}
