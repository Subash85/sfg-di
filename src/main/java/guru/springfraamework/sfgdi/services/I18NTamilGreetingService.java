package guru.springfraamework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"TN","default"})
@Service("i18nService")
public class I18NTamilGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Ulakkathkk yenn Vanakkam ";
    }
}
