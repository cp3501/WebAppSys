package edu.fra.uas.service;

import org.springframework.stereotype.Component;
//Component muss importiert werden!
@Component
public class MessageService {
    //deklariere message vom type String
    private String message;
    
    //public Methode soll jetzt die message returnen mit getMessage

    public String getMessage(){
        return message;
    }


    //diese Methode soll die message setten also aendern (Getter und Setter- Methoden)!
    public void setMessage(String message){
            this.message= message;
    }

}
