package peaksoft;

import org.springframework.beans.factory.annotation.Value;

public class Dog implements Animal {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private int age;
    @Value("${dog.breed}")
    private String breed;
    @Value("${dog.color}")
    private String color;

    public Dog() {
        System.out.println("Dog is bean created!");
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void animalPlus() {
        System.out.println("plus");
    }

    @Override
    public void animalMinus() {
        System.out.println("minus");
    }
}
