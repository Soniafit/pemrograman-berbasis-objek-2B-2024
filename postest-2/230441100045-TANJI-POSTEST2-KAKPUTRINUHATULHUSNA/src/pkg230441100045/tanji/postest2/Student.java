/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100045.tanji.postest2;

/**
 *
 * @author Tanji
 */
 public class Student extends Person {
    private int grade;
    private static int totalStudents = 0;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
        totalStudents++;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama: " + name + ", Umur: " + age + ", Kelas: " + grade);
    }

    public void promote() {
        grade++;
        System.out.println(name + " Telah naik kelas ke kelas " + grade);
    }

    public static void greet() {
        System.out.println("Halo, saya seorang mahasiswa sistem informasi.");
    }

    public static void displayTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Bohi", 15, 9);
        Student student2 = new Student("Robi", 14, 8);
        Student student3 = new Student("Charli", 16, 10);

        student1.displayInfo();
        student2.promote();
        Student.greet();
        Student.displayTotalStudents();
    }
}
