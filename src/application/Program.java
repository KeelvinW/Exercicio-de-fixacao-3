package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stud = new Student();

        stud.name = sc.nextLine();
        stud.nota1 = sc.nextDouble();
        stud.nota2 = sc.nextDouble();
        stud.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", stud.finalGrade());

        if (stud.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", stud.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

    }
}
