package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id=id;
}
public void setName(String name) {
	this.name=name;
}
public String toString() {
	return this.id+" "+this.name;
}
}
