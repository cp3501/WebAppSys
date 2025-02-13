package edu.fra.uas.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


//Component muss importiert werden!
@Component
public class MessageService {
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    //testupdate aus meinem lenovo!
    //deklariere message vom type String
    private String message;
    

    private int counter;
    public int increment(){
    this.counter++;
    return counter;
   
    }
    public void setCounter(int counter){
        this.counter=counter;
    }
    

    //public Methode soll jetzt die message returnen mit getMessage
    public String getMessage(){
        log.debug(message);
        return message;
    }


    //diese Methode soll die message setten also aendern (Getter und Setter- Methoden)!
    public void setMessage(String message){
          log.debug( this.message= message);
    }
    public Integer getCounter() {
        return counter;
    }

}
