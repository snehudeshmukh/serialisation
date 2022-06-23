package Inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent{
	int i;

	public Parent(int i) {
		super();
		this.i=i;
	}

	public Parent() {
		super();
		//i=30;//this constructor not present then Invalid Class Exception occured
		System.out.println("no arg constructor executed!!");//no arg constructor madhli value gheto in parent class
	}
	
	
}
class Child extends Parent implements Serializable{
	public Child(int i) {
		super(i);
	}
	int j=20;
}
public class ChildClassInheritance {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Child child=new Child(50);
		File file=new File("ChildInheritance.ser");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(child);
		System.out.println("Child Inheritance");
		oos.close();
		fos.close();
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child DeseChild=(Child) ois.readObject();
		System.out.println(DeseChild.i);
		System.out.println(DeseChild.j);
		ois.close();
		fis.close();
		
	}

}
