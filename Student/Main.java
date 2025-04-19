import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        Student[] arr=new Student[2];

        for(int i=0;i<arr.length;i++) {

            System.out.println("Enter name:");
            String name = input.nextLine();  input.nextLine();

            System.out.println("Enter RollNo: ");
            int rollNo = input.nextInt();   input.nextLine();


            System.out.println("Enter Depatment:");
            String Department = input.nextLine();

            System.out.println("Enter cgpa:");
            float cgpa = input.nextFloat();   input.nextLine();

            System.out.println("Enter Attandaance: ");
            float attandance = input.nextFloat();

            arr[i] = new Student(name, rollNo, Department, cgpa, attandance);
        }

        Student.sort(arr);

        System.out.println(" Sorted Student Detiles");
        Student.ShowDeties(arr);

        Student topStudent = Student.MaxCgpa(arr);

        System.out.println(" Top Ranker Stundent: ");
        System.out.println( " Cgpa is:"+ topStudent.name);


        Student lowAttendanceStudent = Student.lowAt(arr);
        System.out.println("\nStudent with lowest attendance:");
        System.out.println(lowAttendanceStudent.name + " (Attendance: " + lowAttendanceStudent.name + ")");

        






    }



}

