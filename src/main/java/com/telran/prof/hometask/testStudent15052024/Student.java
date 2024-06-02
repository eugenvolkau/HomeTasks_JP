package com.telran.prof.hometask.testStudent15052024;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {

    private int id;

    @EqualsAndHashCode.Exclude
    private String name;

    @EqualsAndHashCode.Exclude
    private int age;

    @EqualsAndHashCode.Exclude
    private Degree degree;

    public Student() {

    }
}