package ch16;
import java.util.*;
import java.util.stream.Stream;
class Student1{
	private String name;
	private int age;
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class LambdaStreamEx1 {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("하니",17), new Student1("보검", 31), new Student1("제니", 26));
		Stream<Student1> stream = list.stream();
		stream.forEach(s -> System.out.println(s.getName() + " : " + s.getAge()));
	}
}
