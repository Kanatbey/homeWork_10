package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("myPerson",Person.class);

        Dog dog = context.getBean("dog",Dog.class);
        person.callYourAnimal();
        System.out.println(person.getName() + " " + person.getAge());

        System.out.println(dog.getName() + " " + dog.getAge() + " " +dog.getBreed() + " " + dog.getColor());
    }
}
