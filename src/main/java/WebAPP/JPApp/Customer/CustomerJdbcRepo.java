package WebAPP.JPApp.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerJdbcRepo {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_CUSTOMER_QUERY = """
        insert into customer(name, expenses, balance)
        values (?, ?, ?);
        """;

    public void insert()
    {
        List<Object[]> CustomerData = List.of(
                new Object[]{"ittani", 7272.4, 345.5},
                new Object[]{"Gippe-Nthite", 1054.7, 9000.76},
                new Object[]{"Thomas-Chauke", 690.78, 3000.9},
                new Object[]{"Kharavho-Ndou", 9072.4, 550.90},
                new Object[]{"Mulamuleli-lloyd", 780.45, 521.66}
        );



        try {
            // single insert for course
            springJdbcTemplate.batchUpdate(INSERT_CUSTOMER_QUERY,CustomerData);

            System.out.println("Data inserted successfully.");
        } catch (DataAccessException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
    }

