package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	File file=new File("EmpStd.txt");
	FileInputStream fis=new FileInputStream(file);
	ObjectInputStream ois=new ObjectInputStream(fis);
	Employee e=(Employee) ois.readObject();
	Student s=(Student) ois.readObject();
	System.out.println(e);
	System.out.println(s);
	ois.close();
	fis.close();
}
}
