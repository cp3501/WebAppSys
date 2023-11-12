package edu.fra.uas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/*
Das ist jetzt mein allererster coomit bzw. kommentar, den ich jetzt hinzufuegen werden auf mein github acc!
*/ 
@SpringBootApplication
public class BeanBeispielApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanBeispielApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        CommandLineRunner action = new CommandLineRunner() {

            @Override
            public void run(String... args) {
                System.out.println("Hello World");
            }
        };
        return action;
    }

    /* Das ist jetzt mein zweiter commit bzw. Kommentar auf meinem lokalen Rechner, also kein codespaces! */

}
