package Copy;
import java.util.*;
public class Student {
	int roll;
	public String name;
    public ArrayList<String> subject;
 
    public Student(int roll,String name, ArrayList<String> subject)
    {
        this.roll = roll;
    	this.name = name;
        this.subject = subject;
    }
}
