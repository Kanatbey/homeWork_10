package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
//    @Value("${person.animal}")
    private Animal animal;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Person(Dog dog) {
//        System.out.println("Dog bean is created!");
//    }
    @Autowired

    public Person(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }
    public void callYourAnimal(){
        System.out.println("Common dog !!!");
        animal.animalPlus();
        animal.animalMinus();
    }
}
