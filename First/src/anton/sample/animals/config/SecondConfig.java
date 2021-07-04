package anton.sample.animals.config;

import anton.sample.animals.model.Cat;
import anton.sample.animals.model.Person;
import anton.sample.animals.model.PetAction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */

/*Для жтого способа конфигурирования не нужны на классах указания аннотаций @Component и @Autowired (@Qualifier and @Value)*/
@Configuration
@PropertySource("classpath:app.properties")
public class SecondConfig {

    @Bean
    @Scope("prototype")
    public PetAction catBean() {
        System.out.println("catBean is created in the Spring container");
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }


}
