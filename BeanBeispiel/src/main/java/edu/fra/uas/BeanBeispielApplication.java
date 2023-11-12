package edu.fra.uas;
//Import der Logger-Klassen
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// @Autowired-Annotation wurde importiert
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//Bei der Injizierung werden sie auch mitimportiert
import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;
/*
Das ist jetzt mein allererster coomit bzw. kommentar, den ich jetzt hinzufuegen werden auf mein github acc!
*/ 
@SpringBootApplication
public class BeanBeispielApplication {
    private static final Logger log =LoggerFactory.getLogger(BeanBeispielApplication.class);

    //hier wird jetzt Beancontroller injiziert
    @Autowired
    private BeanController beanController;


//Ausserhalb der Main-Methode wird folgende Zeile hinzugefuegt
    @Autowired
    private MessageService messageService;
    /*hier wurde jetzt die Klasse MessageService (welche mit Component zu einer Bean instanziiert wurde)
     * in die Main-Klasse injiziert durch die @Autowired-Annotation
     * 
     */


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
                //ich lasse das mal rein
                System.out.println("Hello World durch einfaches sysout!");
                messageService.setMessage("Hello World durch mS-Klasse");
                System.out.println(messageService.getMessage());
                messageService.setMessage("test");
                System.out.println(messageService.getMessage());

                log.debug(beanController.putMessage("Hallo Welt"));



/*Anmerkungen zu Autowired: Wenn man es weglaesst, so erhaelt man eine Nullpointer-Exception! D.h., dass
 * die Klasse nicht injiziert wurde.
 */

            }
        };
        return action;
    }

    /* Das ist jetzt mein zweiter commit bzw. Kommentar auf meinem lokalen Rechner, also kein codespaces! */

    //update: In codespaces musste ich die updates "pullen"!

}
