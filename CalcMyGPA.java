package code;

import java.util.Scanner;

public class CalcMyGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your number of classes: ");
		int classNumber = sc.nextInt();
		
		double totalCredits = 0;
		double totalGradePoints = 0;
		double gpa = 0;
		double gradeValue = 0;
		
		for (int i = 0; i < classNumber; i++)
		{
			System.out.print("Enter course information separated by "
					+ "commas (title,credit hours, letter grade) or type Q to quit: ");
			String courseStuff = sc.next();
			
			String[] courses = courseStuff.split(",");
			if (courseStuff.equals("Q"))
			{
				break;
			}
			else
			{
				String course = courses[0];
				double credit = Double.parseDouble(courses[1].trim()); 
				String grade = courses[2];
			
		if (grade.equals("A"))
		{
			gradeValue = 4.00 * credit;
		}
		else if (grade.equals("A-"))
		{
			gradeValue = 3.70 * credit;
		}
		
		else if (grade.equals("B+"))
		{
			gradeValue = 3.33 * credit;
		}
		
		else if (grade.equals("B"))
		{
			gradeValue = 3.00 * credit;
		}
		
		else if (grade.equals("B-"))
		{
			gradeValue = 2.70 * credit;
		}
		
		else if (grade.equals("C+"))
		{
			gradeValue = 2.30 * credit;
		}
		
		else if (grade.equals("C"))
		{
			gradeValue = 2.00 * credit;
		}
		
		else if (grade.equals("C-"))
		{
			gradeValue = 1.70 * credit;
		}
		
		else if (grade.equals("D+"))
		{
			gradeValue = 1.30 * credit;
		}
		
		else if (grade.equals("D"))
		{
			gradeValue = 1.00 * credit;
		}
		
		else if (grade.equals("D-"))
		{
			gradeValue = 0.70 * credit;
		}
		
		else if (grade.equals("F"))
		{
			gradeValue = 0.00 * credit;
		}
		
		else
		{
			System.out.println("Invalid Grade");
		}

		System.out.println("Course title: " + course + ", Credits: " + credit + ", Grade: " + grade + ", & Grade Points: " + gradeValue);
		totalCredits = totalCredits + credit;
		totalGradePoints = totalGradePoints + gradeValue;
		gpa = totalGradePoints / totalCredits;
		
			}
			
		}//for loop
		
		System.out.println("Your gpa is: " + gpa + ".");
		System.out.println("Total number of credits attempted: " + totalCredits);
		System.out.println("Total grade points: " + totalGradePoints);
		
	}//main

}//class
