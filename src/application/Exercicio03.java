package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Student student = new Student();

		System.out.println("Enter student name and grades (3): ");
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
