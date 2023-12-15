package com.Centum1.CapEmployee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sherise {
    @Id
    @GeneratedValue

    public int id;
    public String candidatecode;
    public String candidatename;
    public String emailid;
    public String phonenumber;
    public String address;
    public String dob;
    public String gender;
}
