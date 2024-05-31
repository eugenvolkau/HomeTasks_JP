package com.telran.prof.hometask.testStudent15052024;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniTest {

    private Uni uni;

    @BeforeEach
    private void init() {
        uni = new Uni();
        Student soso = new Student(1, "Soso", 55, Degree.BACHELOR);
        uni.addStudent(soso);
    }

    @Test
    public void addStudentWhenStudentNotExistsInUni() {
        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        uni.addStudent(valiko);
        int size = uni.getAllStudents().size();
        assertEquals(2, size);
    }

    @Test
    public void addStudentWhenStudentExistsInUni() {
        Student soso = new Student(1, "Soso", 55, Degree.MASTER);
        assertThrows(NotUniqueStudentException.class, () -> uni.addStudent(soso));
    }

    @Test
    void excludeStudent(int i) {

//        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
//        uni.excludeStudent(1);
        int size = uni.getAllStudents().size();
        assertEquals(null, uni.excludeStudent(1));
    }

    @Test
    void getAllStudents() {
        int size = uni.getAllStudents().size();
        assertEquals(1, size);
    }

    @Test
    void GetAllStudentsDegree(Degree degree) {
        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        uni.addStudent(valiko);
        int size = uni.getAllStudentsDegree(Degree.MASTER).size();
        assertEquals(1, size);
    }

    @Test
    void getCountStudents() {
        int size = uni.getAllStudents().size();
        assertEquals(1, size);
    }

    @Test
    void getCountStudentsDegree(Degree degree) {
        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        uni.addStudent(valiko);
        int size = uni.getAllStudentsDegree(Degree.MASTER).size();
        assertEquals(1, size);
    }

    @Test
    void getSumAgeAllStudents() {
        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        uni.addStudent(valiko);
        int sum = uni.getSumAgeAllStudents();
        assertEquals(80, sum);
    }

    @Test
    void getSumAgeAllStudentsDegree(Degree degree) {
        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        uni.addStudent(valiko);
        int sum = uni.getSumAgeAllStudentsDegree(Degree.BACHELOR);
        assertEquals(25, sum);
    }

    @Test
    void getAverageAgeStudents() {
        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        uni.addStudent(valiko);
        assertEquals(40, uni.getAverageAgeStudents());
    }
}