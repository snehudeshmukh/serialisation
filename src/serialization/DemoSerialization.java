package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {
public static void main(String[] args) throws IOException {
	Employee emp1=new Employee(10,"Ram");
	Student s1=new Student(20,"Sham",200.5f);
	File file= new File("EmpStd.txt");
	file.createNewFile();
	FileOutputStream fos= new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(emp1);
	oos.writeObject(s1);
	System.out.println("Object Serialized successfully!!!");
	oos.close();
	fos.close();
}
}
