import java.util.Scanner;



class Student{
	
	String studentName;
	int Roll;
	static String collegeName= "JNU";
	
	Student(String studentName,int Roll){
		this.studentName = studentName;
		this.Roll = Roll;
	}
	
	void studentDetails(){
		System.out.println("College Name : "+collegeName);
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Roll No : "+Roll);
	}
}

class Marks extends Student{

	int math,physics,cs;
	int totalMarks;
	Marks(String studentName, int Roll,int math,int physics,int cs) {
		super(studentName, Roll);
		this.math = math;
		this.physics = physics;
		this.cs = cs;
	}
	
	int totalNumber(){
		int totalMarks = math+physics+cs;
		return totalMarks;
	}
	

}



public class ResultProcess {
	public static void main(String args[]){
		
		int totalMarks;
		
		Scanner stu=new Scanner(System.in);
		System.out.print("Enter Student Name: "); 
		String StudentName= stu.next();
		
		Scanner roll=new Scanner(System.in);
		System.out.print("Enter Roll No: "); 
		int Roll= stu.nextInt();
		
		Scanner marks1=new Scanner(System.in);
		System.out.print("Enter Math Marks: "); 
		int mathMrk= marks1.nextInt();
		
		Scanner marks2=new Scanner(System.in);
		System.out.print("Enter Physics Marks: "); 
		int phyMrk= marks2.nextInt();
		
		Scanner marks3=new Scanner(System.in);
		System.out.print("Enter CS Marks: "); 
		int csMrk= marks3.nextInt();
		
		Marks marks = new Marks(StudentName,Roll,mathMrk,phyMrk,csMrk);
		
		int obtMarks = marks.totalNumber();
		
		marks.studentDetails();
		System.out.print("Total Marks : "+obtMarks);
		
		stu.close();roll.close();marks1.close();marks2.close();marks3.close();

		
	}
}



