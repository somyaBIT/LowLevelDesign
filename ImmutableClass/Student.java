package ImmutableClass;

import java.util.*;

public final class Student {
	private final int roll;
	private final String name;
	private final List<String> subject;

	Student(int roll, String name, List<String> subjectList) {
		this.roll = roll;
		this.name = name;
		this.subject = new ArrayList<>();
		for (String sub : subjectList) {
			subject.add(sub);
		}
//		this.subject= subjectList;
		}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public List<String> getSubject() {
		List<String> newList = new ArrayList<>();
		for (String sub : subject) {
			newList.add(sub);
		}
		return newList;
//		passing the copy of the object
//		return new ArrayList<>(subject);
//		return subject;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subject=" + subject + "]";
	}
	
}