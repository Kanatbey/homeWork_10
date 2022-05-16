package peaksoft;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    private Animal animal;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(Animal dog) {
        this.animal = dog;
//        System.out.println("Dog bean is created!");
    }

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

    public void callYourAnimal(){
        System.out.println("Common dog !!!");
        animal.animalPlus();
        animal.animalMinus();
    }
}
