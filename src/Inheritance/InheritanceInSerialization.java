package Inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class P implements Serializable{
	int i=10;
}
class Q extends P{
	int j=20;
}
public class InheritanceInSerialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Q q=new Q();
	File file=new File("inheritanceInSerialization.ser");
	FileOutputStream fos=new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(q);
	oos.close();
	fos.close();
	System.out.println("Object Serialized");
	FileInputStream fis=new FileInputStream(file);
	ObjectInputStream ois=new ObjectInputStream(fis);
	Q deserializedQ=(Q) ois.readObject();
	ois.close();
	fis.close();
	System.out.println(deserializedQ.i);
	System.out.println(q.j);
}
}
