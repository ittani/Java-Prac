package WebAPP;

import org.hibernate.sql.ast.tree.from.ValuesTableGroup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

record Person(String name, int age) {}
record Address(String address, String city) {}
record Occupation (String workType, String location) {}
record Vacation (String location, String Actity, double expenses) {}

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

    @Bean
    public Occupation occupation()
    {
        return new Occupation("Software-Engineer", "Rose-Bank");
    }

    //Bean for vacation record
    @Bean
    public Vacation vacation()
    {
        return  new Vacation("Cape-Town","Mountain-hiking", 15126.56);
    }
}
