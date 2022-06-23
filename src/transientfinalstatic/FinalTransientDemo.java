package transientfinalstatic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Sample implements Serializable{
	transient static int a=10;
	transient final int b=20;
	int c=30;
}
public class FinalTransientDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Sample obj=new Sample();
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	FileOutputStream fos=new FileOutputStream("FinalTransientDemo.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(obj);
	System.out.println("Object Serialized");
	oos.close();
	fos.close();
	FileInputStream fis=new FileInputStream("FinalTransientDemo.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Sample obj2=(Sample) ois.readObject();
	System.out.println("Object Deserialized");
	System.out.println("After Deserialization");
	System.out.println(obj2.a);
	System.out.println(obj2.b);
	System.out.println(obj2.c);
	ois.close();
	fis.close();
	
	
}
}
