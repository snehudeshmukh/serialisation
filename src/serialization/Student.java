package serialization;

import java.io.Serializable;

public class Student implements Serializable{
int rollNo;
String name;
float marks;
public Student() {
	super();
}
public Student(int rollNo, String name, float marks) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
}

}
