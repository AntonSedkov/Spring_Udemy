package anton.sample.aop.library.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */

@Configuration
@ComponentScan("anton.sample.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}
