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
public class Employee {

    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE,generator ="table-gen")
//    @TableGenerator(name = "table-gen",allocationSize = 100,table = "id_gen",initialValue = 1000,pkColumnName = "gen_name",
//            valueColumnName = "gen_val")
    @GenericGenerator(name = "generic-gen", strategy = "io.springdata.CustomRandomIDGenerator")
    @GeneratedValue(generator = "generic-gen")
    private Long id;
    private String name;


}
