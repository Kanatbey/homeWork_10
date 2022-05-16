package peaksoft;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("peaksoft")
public class MyConfig {
    @Bean
    public Animal dog(){
        return new Dog();
    }
    @Bean
    public Person myPerson(){
        return new  Person((Dog) dog());
    }
}
