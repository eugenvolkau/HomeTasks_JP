package com.telran.prof.hometask.testStudent15052024;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@ToString
public class Uni {

    // Check uni size : 10 students

    private Map<Integer, Student> students;

    public Uni() {
        students = new HashMap<>();
    }

    //To home
    public void addStudent(Student student) {
        int id = student.getId();
        if (students.containsKey(id)) {
            throw new NotUniqueStudentException("Student with id " + id + " allredy " +
                    "allready Exists");
        }
        students.put(id, student);

    }

    public Student excludeStudent(int id) {
        students.values();

        System.out.println("Befor " + students.get(id));
        students.remove(id);
        return students.get(id);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());

    }

    public List<Student> getAllStudentsDegree(Degree degree) {
        List<Student> degreeBachelor = (students.values())
                .stream().filter(d -> d.getDegree().equals(degree))
                .collect(Collectors.toList());
        // System.out.println("Bachelor  " + degreeBachelor);
        return degreeBachelor;
    }

    public int getCountStudents() {
        int countAll = (int) (students.values())
                .stream().count();
        return countAll;
    }

    public int getCountStudentsDegree(Degree degree) {
        int countDegree = (int) (students.values())
                .stream()
                .filter(d -> d.getDegree().equals(degree))
                .count();
        return countDegree;
    }

    public int getSumAgeAllStudents() {
        int sumAges = (int) (students.values())
                .stream()
                //.filter(d-> d.getDegree().equals(degree))
                .mapToInt(a -> a.getAge())
                .sum();
        return sumAges;
    }

    //To home
    public int getSumAgeAllStudentsDegree(Degree degree) {
        int countAges = (int) (students.values())
                .stream()
                .filter(d -> d.getDegree().equals(degree))
                .mapToInt(a -> a.getAge())
                .sum();
        return countAges;
    }

    //To home
    public int getAverageAgeStudents() {
        int sumAges = (int) (students.values())
                .stream()
                //.filter(d-> d.getDegree().equals(degree))
                .mapToInt(a -> a.getAge())
                .sum();
        int AverageAge = (int) (sumAges / getCountStudents());
        return AverageAge;
    }

}