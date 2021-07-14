package anton.sample.udemy_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//For devtool: Settings-> Compiler -> Build project automatically

// Ctrl+Shift+A => registry
//compiler.automake.allow.when.app.running = true

@SpringBootApplication
public class UdemyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyBootApplication.class, args);
    }

}
