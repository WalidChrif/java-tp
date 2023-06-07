package com.tppfe.entities;

import javax.persistence.*;

@Entity
//@IdClass(StudentId.class)
@Table(name = "student_table")
public class Student {

    @EmbeddedId
    private StudentId studentId;
    @Column(name = "student_name")
    private String name;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street",column = @Column(name = "street_student")),
            @AttributeOverride(name = "avenue",column = @Column(name = "avenue_student")),
            @AttributeOverride(name = "number",column = @Column(name = "number_student"))
    })
    private Address address;

//    @Id
//    private Long id;
//    @Id
//    private String code;

    public StudentId getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentId studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", address=" + address +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", code='" + code + '\'' +
//                '}';
//    }
}
