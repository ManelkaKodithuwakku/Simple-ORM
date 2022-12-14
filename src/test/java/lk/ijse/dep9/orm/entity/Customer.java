package lk.ijse.dep9.orm.entity;

import lk.ijse.dep9.orm.annotation.Id;
import lk.ijse.dep9.orm.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
}
