package com.luvina.assignment.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import static jakarta.persistence.GenerationType.IDENTITY;


@AllArgsConstructor
@Entity
@Getter
@EqualsAndHashCode
@ToString
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

    public Employee() {

    }
}
