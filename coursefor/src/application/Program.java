package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stud = new Student();
		System.out.println("Students Name: ");
		stud.name = sc.nextLine();
		System.out.println("Grade one: ");
		stud.grade1 = sc.nextDouble();
		System.out.println("Grade two: ");
		stud.grade2 = sc.nextDouble();
		System.out.println("Grade tree: ");
		stud.grade3 = sc.nextDouble();
		System.out.println();
		System.out.println("FINAL GRADE = " + stud.finalGrade());
		if(stud.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.println("MISSING " + stud.misspoints());
		}
		else {
			System.out.println("PASS");
			System.out.println("CONGRATULATION!");
			
		}
		
		sc.close();

	}

}
