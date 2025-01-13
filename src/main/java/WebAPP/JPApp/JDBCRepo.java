package WebAPP.JPApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

// creating a function that updates sql queries in H2-Database

@Repository
public class JDBCRepo {

    @Autowired
    //JdbcTemplate class is the key class for accessing databases through JDBC in Spring.
   private JdbcTemplate springTemplate;
    // Queries separated from logic
    private static final String INSERT_STUDENT_QUERY = """
    INSERT INTO student(id, name, studentid, location) 
    VALUES (?, ?, ?, ?);
""";

    private static final String INSERT_EMPLOYEE_QUERY = """
    INSERT INTO employee(id, name, employeeId)
    VALUES (?, ?, ?);
    """;

    private static final String INSERT_COURSE_QUERY = """
    INSERT INTO course(id, name)
    VALUES (?, ?);
    """;

    public void insert() {
        List<Object[]> studentData = List.of(
                new Object[]{1, "ittani-maemo", "23719311", "Polokwane"},
                new Object[]{2, "Gippe-Nthite", "23215375", "Pretoria"},
                new Object[]{3, "Thomas-Chauke", "23436843", "Giyani"},
                new Object[]{4, "Kharavho-Ndou", "23517544", "Centurion"},
                new Object[]{5, "Mulamuleli-lloyd", "23469073", "Rosebank"}
        );


        List<Object[]> employeeData = List.of(
                new Object[]{1, "Ittani", "Andile001"},
                new Object[]{2, "Moddah", "Andile002"},
                new Object[]{3, "Matodzi", "Andile003"},
                new Object[]{4, "Tshililo", "Andile004"},
                new Object[]{5, "Karabo", "Andile005"}
        );

        List<Object[]> courseData = List.of(
                new Object[]{1, "Computer Science"},
                new Object[]{2, "Chemistry"},
                new Object[]{3, "Physical Sciences"},
                new Object[]{4, "Mechatronics"},
                new Object[]{5, "Electronics"}
        );

        try {
            // Batch update for students
            springTemplate.batchUpdate(INSERT_STUDENT_QUERY, studentData);

            // Single insert for employee
            springTemplate.batchUpdate(INSERT_EMPLOYEE_QUERY, employeeData);

            // single insert for course
            springTemplate.batchUpdate(INSERT_COURSE_QUERY,courseData);

            System.out.println("Data inserted successfully.");
        } catch (DataAccessException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }


}
