package io.springdata;

import io.springdata.entities.Employee;
import io.springdata.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
class SpringDataApplicationTests {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Test
    void contextLoads() {
    }

    @Test
    void testSave() {
        employeeRepository.save(
                Employee.builder().id(101l).name("Bunty").build()
        );
    }

    @Test
    @Transactional
    @Commit
    void testUpdate() {
        employeeRepository.updateEmployeeById(102l, "Buntu");
    }
}
