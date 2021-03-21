package de.dz2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private int id;
    private String department;
    private String firstName;
    private String lastName;
    private int vacationStart;
}
