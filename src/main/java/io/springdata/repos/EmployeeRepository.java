package io.springdata.repos;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.springdata.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Modifying
    @Query("update Employee e set e.name = ?2 where e.id = ?1")
    void updateEmployeeById(Long id, String name);

}
