package edu.fra.uas.config;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.User;
import edu.fra.uas.service.UserService;
import jakarta.annotation.PostConstruct;

@Component
public class InitData {
    //Diese Klasse soll für die Initialiseierung der daten notwendig sein
    //hierfuer wurde ein Logger initialisiert, der die Klasse loggt
    private final Logger log = org.slf4j.LoggerFactory.getLogger(InitData.class);
    

    //Hier wurde die Klasse Userservice (im Packet service) in die Klasse InitDate injiziert mittels Autowired
    @Autowired
    UserService userService;

    @PostConstruct
    public void init() {
        log.debug("### Initialize Data ###"); //hier wird die Initialisierung angekuendigt

        log.debug("create user admin"); //Logausgabe kuendigt Erstellung eines user admins an
        User user = new User(); //Hier wird klassisch ein neuer User initilaisiert aus der Klasse User | Hier wird genauer gesagt ein User "ohne value" erzeugt
        //jetzt werden mit Setter die einzelenen Daten dem User zugewiesen
        user.setRole("ADMIN"); //dieser User bekommt die Rolle als Admin
        user.setFirstName("Administrator"); //Vorname 
        user.setLastName("Administrator");//Nachname
        user.setEmail("admin@example.com");//email
        user.setPassword("extremeSecurePassword1234");//passwort
        userService.createUser(user); //Hier wird der user in userService hinzugefuegt, auch von da bekommt er seine ID, auch wird dieser user automatisch in  die userRepository hinzugefuegt!

        log.debug("create user alice");
        user = new User();
        user.setRole("USER");
        user.setFirstName("Alice");
        user.setLastName("Adams");
        user.setEmail("alice@example.com");
        user.setPassword("alice1234");
        userService.createUser(user);

        log.debug("create user bob");
        user = new User();
        user.setRole("USER");
        user.setFirstName("Bob");
        user.setLastName("Builder");
        user.setEmail("bob@example.com");
        user.setPassword("bob1234");
        userService.createUser(user);

        log.debug("### Data initialized ###");
    }

}
