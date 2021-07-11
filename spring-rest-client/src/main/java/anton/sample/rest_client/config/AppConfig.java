package anton.sample.rest_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * User: Sedkov Anton
 * Date: 11.07.2021
 */

@Configuration
@ComponentScan(basePackages = "anton.sample.rest_client")
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}