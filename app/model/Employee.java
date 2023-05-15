package model;


import javax.persistence.*;

//@JsonIdentityInfo(generator = null)
@Table(name = "employee")
@Entity
public class Employee{

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;


    @Column
    private String name;


    @Column
    private Integer year;


    @Column
    private String department;

    public Employee(Integer id, String name, Integer year, String department) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
