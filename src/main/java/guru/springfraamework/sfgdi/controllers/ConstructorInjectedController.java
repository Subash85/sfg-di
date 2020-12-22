package guru.springfraamework.sfgdi.controllers;

import guru.springfraamework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private final GreetingService greetingService;

    /*@AutoWired  is not required here because its optional from Spring 4.2*/
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
