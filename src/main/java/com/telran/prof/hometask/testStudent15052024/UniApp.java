//package com.telran.prof.hometask.testStudent15052024;
//
//public class UniApp {
//
//    public static void main(String[] args) {
//
//        Uni students = new Uni();
//
//        Student vaso = new Student(1, "Vaso", 16, Degree.BACHELOR);
//        Student givi = new Student(2, "Givi", 20, Degree.MASTER);
//        Student kote = new Student(3, "Kote", 17, Degree.BACHELOR);
//        Student vano = new Student(4, "Vano", 30, Degree.BACHELOR);
//        Student mamuka = new Student(5, "Mamuka", 80, Degree.MASTER);
//
//        students.addStudent(vaso);
//        students.addStudent(givi);
//        students.addStudent(kote);
//        students.addStudent(vano);
//        students.addStudent(mamuka);
//
//        // System.out.println("Class     " + students);
//
//        System.out.println("All students  " + students.getAllStudents());
//        System.out.println("Bachelors  " + students.getAllStudentsDegree(Degree.BACHELOR));
//        System.out.println("Masters   " + students.getAllStudentsDegree(Degree.MASTER));
//        System.out.println("SummAll   " + students.getCountStudents());
//        System.out.println("Count of Bachelors  : " + students.getCountStudentsDegree(Degree.BACHELOR));
//        System.out.println("Count of Masters  : " + students.getCountStudentsDegree(Degree.MASTER));
//        System.out.println(" Total age of all students :" + students.getSumAgeAllStudents());
//        System.out.println(" Total age of students-Bachelors :" + students.getSumAgeAllStudentsDegree(Degree.BACHELOR));
//        System.out.println(" Total age of all students-Masters :" + students.getSumAgeAllStudentsDegree(Degree.MASTER));
//        System.out.println("Exclude Studen  : " + students.excludeStudent(3));
//        System.out.println("All students after Exclude " + students.getAllStudents());
//        System.out.println("Average Age of students " + students.getAverageAgeStudents());
//
//    }
//}