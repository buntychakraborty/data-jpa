package io.springdata.repos;

import io.springdata.entities.Employee;
import io.springdata.entities.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    @Modifying
    @Query("update Employee e set e.name = ?2 where e.id = ?1")
    void updateEmployeeById(Long id, String name);

}
