package ch16;

public class Member {
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	private String name;
	private int gender;
	private int age;
	public Member(String name, int age, int gender) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	
}
