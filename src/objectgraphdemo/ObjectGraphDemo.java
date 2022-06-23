package objectgraphdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	B b=new B();
}
class B implements Serializable{
	C c=new C();
}
class C implements Serializable{
	int i=10;
	int j=20;
}
public class ObjectGraphDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	A a=new A();//create object of class A
	File file=new File("objectGraph.ser");
	FileOutputStream fos=new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(a);
	oos.close();
	fos.close();
	System.out.println("Object Serialized");
	FileInputStream fis=new FileInputStream("objectGraph.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	A deserializedA=(A) ois.readObject();
	ois.close();
	fis.close();
	System.out.println(deserializedA.b.c.i);
	System.out.println(deserializedA.b.c.j);
}
}
