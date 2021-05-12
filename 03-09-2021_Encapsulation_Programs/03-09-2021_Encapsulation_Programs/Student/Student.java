package oops;

public class Student {
	int studentId;
	String StudentsName;
	private int marks;
	private char grade;
	

	public Student() {

	}

	public Student(int studentId, String studentsName, int marks) {
		
		this.studentId = studentId;
		this.StudentsName = studentsName;
		this.marks = marks;
		calculateGrade();
	}

	
	String displayDetails() {

		return "Student [studentId=" + studentId + ", StudentsName=" + StudentsName + ", marks=" + marks + ",getgrade ="+grade+"]";
	}

	private void calculateGrade() {
		if (marks > 90)

		{

			grade = 'A';

		}

		else if (marks > 80 && marks <= 90)

		{

			grade = 'B';

		}

		else if (marks > 70 && marks <= 80)

		{

			grade = 'C';

		}

		else if (marks > 60 && marks <= 70)

		{

			grade = 'D';

		}

		else

		{

			grade = 'E';

		}

	}
}
