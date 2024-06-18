package Copy;

import java.util.*;

public class Copy {
	public static void main(String[] args) {
		// Create a list
		ArrayList<String> sub = new ArrayList<>();
		sub.add("eng");
		sub.add("math");
		
		//object created
		Student obj = new Student(1,"somya", sub);

		System.out.println("\nOriginal: "+ obj.name + " "+ obj.roll);
		for (String subject : obj.subject) {
			System.out.print(subject + " ");
		}
		System.out.println();
		
		// Deep copy of student
		Student deepcopyStudent = new Student(5,"deep", new ArrayList<>(obj.subject));
		deepcopyStudent.subject.add("hindi");
		System.out.print("Deepcopy: " +deepcopyStudent.name + " "+deepcopyStudent.roll);
		for (String subject : deepcopyStudent.subject) {
			System.out.print(subject + " ");
		}
		
		System.out.println("\nOriginal: "+ obj.name + " "+ obj.roll);
		for (String subject : obj.subject) {
			System.out.print(subject + " ");
		}
		System.out.println();

		// Shallow Copy of Student
       // here we are copying refrences of the object
		Student shallowCopyStudent = obj;
		shallowCopyStudent.name = "shallow";
		shallowCopyStudent.roll = 10;
		sub.add("chem");
		System.out.print("Shallow Copy: "+shallowCopyStudent.name+" "+shallowCopyStudent.roll);
	
		for (String subject : shallowCopyStudent.subject) {
			System.out.print(subject + " ");
		}
		
		System.out.println("\nOriginal: "+ obj.name + " "+ obj.roll);
		for (String subject : obj.subject) {
			System.out.print(subject + " ");
		}
		System.out.println();
	}
}
