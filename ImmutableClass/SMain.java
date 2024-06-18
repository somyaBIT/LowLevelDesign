package ImmutableClass;

import java.util.*;

public class SMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
        List<String> subjectList = new ArrayList<>();
        subjectList.add("english");
       Student std1 = new Student(56,"Somya",subjectList);
        System.out.println(std1);
        subjectList.add("math");
        Student std2 = new Student(59,"sourabh",subjectList);
         System.out.println(" after adding new element in the list " + std1);
         System.out.println(" after adding new element in the list " + std2);
         subjectList.add("science");
         Student std3 = new Student(6,"Som",subjectList);
         System.out.println(" after adding new element in the list " + std1);
         System.out.println(" after adding new element in the list " + std2);
         System.out.println(" after adding new element in the list " + std3);
	}

}
