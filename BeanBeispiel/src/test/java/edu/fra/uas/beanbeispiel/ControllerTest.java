package edu.fra.uas.beanbeispiel;


import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllerTest {
    @Autowired
    private BeanController beanController;
    @Autowired
    private MessageService messageService;

    
    @Test
    void testController(){
        assertThat(beanController.putMessage("Das ist ein Test")).isEqualTo("Das ist ein Test");
    }


@Test
void counterTest(){
    messageService.setCounter(3);
        
    int a= messageService.getCounter()+1;
assertEquals(a, messageService.increment());
   
}

}
