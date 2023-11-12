package edu.fra.uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Auch hier wird die Klasse zur Bean instanziiert mithilfe des @Component-Annotation

import edu.fra.uas.service.MessageService;
@Component
public class BeanController {

    //in dieser Bean-Klasse wird eine andere Bean (MessageService) injiziert!
    @Autowired    
    private MessageService messageService;

    public String putMessage(String message){
        messageService.setMessage("put message from Beancontroller"+message);
    
            return messageService.getMessage();
    }


}
