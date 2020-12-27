package io.springdata.entities;


import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GenericGenerator(name = "generic-gen", strategy = "io.springdata.custom_id_generators.CustomRandomStudentIDGenerator")
    @GeneratedValue(generator = "generic-gen")
    private String id;
    private String name;
}
