package WebAPP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
record Address(String address, String city) {}
@Configuration
public class BeanClass {

    @Bean
    public String name()
    {
        return "David-Obama";
    }

    @Bean
    public int age()
    {
        return 22;
    }

    @Bean
    public double salary()
    {
        return 12877.61;
    }

    @Bean
    public Person person()
    {
        var person = new Person("Samson", 90);
        return person;
    }

    @Bean
    public Address address()
    {
        return new Address("29-kerk-street","johannesburg");
    }
}
