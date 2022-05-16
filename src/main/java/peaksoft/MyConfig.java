package peaksoft;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:app.properties")

public class MyConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }
    @Bean
    public Person myPerson(){
        return new  Person(dog());
    }
}
