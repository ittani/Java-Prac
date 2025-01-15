package WebAPP.JPApp;

import WebAPP.JPApp.Customer.CustomerJdbcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JDBCCommandLineRunner implements CommandLineRunner {


    @Autowired
    private JDBCRepo repository;

    @Autowired
    private CustomerJdbcRepo customerJdbcRepo;

    @Override
    public void run(String... args) throws Exception{
        //Insert Employee,Student, and Course Data inserted successfully.
        repository.insert();

        //Customer Data inserted successfully.
        customerJdbcRepo.insert();

        //Customer date deleted
        customerJdbcRepo.deleteByID(1);

    }
}
