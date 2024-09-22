package Lec23;

//import java.util.ArrayList;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> ll = new ArrayList<>();
		System.out.println("Hello");
		Student s1 = new Student();
		// s1.Intro_yourSelf();
		s1.name = "Kaju";
		s1.age = 21;
		s1.Intro_yourSelf();
		Student s2 = new Student();
		s2.name = "Raj";
		s2.age = 20;
		s2.Intro_yourSelf();
		s1.SayHey("Raju");
		Student.MentorName();
		s1.MentorName();

	}

	static {
		System.out.println("Welcome to Student client class");
	}
}
