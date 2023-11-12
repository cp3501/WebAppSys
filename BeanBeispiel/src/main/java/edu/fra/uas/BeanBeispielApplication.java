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
    /*Anmerkungen zur 1. Aufgabe: Aufgabe war es die Annotation zu löschen.
     * Ich hab das ausgeklammert, was den selben Effekt auslöst.
     * Hierbei wird die Sysout-Line nicht ausgeprintet (hier: "Hello World")
     * Wenn man die Bean-Notation lässt, so wird dies ausgefuehrt.
     *"Dies (@Bean) bewirkt,  dass  der  Spring  
     *Container  nach  dem  Start  der  Anwendung  die  Bean  unmitelbar  ausführt. 
     * Die  Bean  ist  dabei  das 
     *Rückgabeobjekt der anonymen Klasse CommandLineRunner" 
     */
     
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

    //update: In codespaces musste ich die updates "pullen"!

}
