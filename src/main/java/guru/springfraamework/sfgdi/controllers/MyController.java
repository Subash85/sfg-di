package guru.springfraamework.sfgdi.controllers;

import guru.springfraamework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;
/* not adding @Autowired because this is a constructor*/
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();

    }
}
