package guru.springfraamework.sfgdi.services;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello there - Property";
    }
}
