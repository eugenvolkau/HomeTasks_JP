package com.telran.prof.hometask.testStudent15052024;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void excludeStudentWhenStudentExist () {

//        Student valiko = new Student(2, "Valid", 25, Degree.MASTER);
       Student student = uni.excludeStudent(1);
        int size = uni.getAllStudents().size();
        assertEquals(0, uni.getAllStudents().size());
        assertEquals(1,student.getId());
    }

    @Test
    void getAllStudents() {
        int size = uni.getAllStudents().size();
        assertEquals(1, size);
    }

    @Test
    void GetAllStudentsDegree() {
       // Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        //uni.addStudent(valiko);
        int size = uni.getAllStudentsDegree(Degree.MASTER).size();
        assertEquals(0, size);
    }

    @Test
    void getCountStudents() {
        int size = uni.getAllStudents().size();
        assertEquals(1, size);
    }

    @Test
    void getCountStudentsDegreeExist() {
        Student valiko = new Student(2, "Valiko", 25, Degree.BACHELOR);
        uni.addStudent(valiko);
        int countDegree =
                (int) uni.getAllStudentsDegree(Degree.BACHELOR).stream().count();
        assertEquals(2, countDegree);
    }

    @Test
    void getSumAgeAllStudents() {
        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        uni.addStudent(valiko);
        int sum = uni.getSumAgeAllStudents();
        assertEquals(80, sum);
    }

    @Test
    void getSumAgeAllStudentsDegree() {
        Student valiko = new Student(2, "Valiko", 25, Degree.BACHELOR);
        uni.addStudent(valiko);
        int sum = uni.getSumAgeAllStudentsDegree(Degree.BACHELOR);
        assertEquals(80, sum);
    }

    @Test
    void getAverageAgeStudents() {
        Student valiko = new Student(2, "Valiko", 25, Degree.MASTER);
        uni.addStudent(valiko);
        assertEquals(40, uni.getAverageAgeStudents());
    }
}