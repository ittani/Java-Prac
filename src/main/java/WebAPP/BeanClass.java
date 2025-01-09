package WebAPP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanClass {

    @Bean
    public String name()
    {
        return "Ittani-Maemo";
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
}
