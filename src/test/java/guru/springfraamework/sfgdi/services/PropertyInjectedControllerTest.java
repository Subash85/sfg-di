package guru.springfraamework.sfgdi.services;

import guru.springfraamework.sfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingServiceImpl();
    }
    @Test
    void getGreeting(){

        System.out.println(controller.getGreeting());

    }

}