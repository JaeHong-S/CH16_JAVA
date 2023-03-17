package ch16;

import java.util.Arrays;
import java.util.List;

public class PipedSt1Ex {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("하니", 17, Member.FEMALE),
				new Member("수란", 22, Member.FEMALE), new Member("남궁", 55, Member.MALE), new Member("각수", 66, Member.MALE));
		
		double avg =list.stream().mapToInt(Member :: getAge).average().getAsDouble();
		System.out.println("평균나이 : " + avg);
		
		 avg =list.stream().filter(m->m.getGender() == Member.MALE).mapToInt(Member :: getAge).average().getAsDouble();
		System.out.println("남자 평균나이 : " + avg);
		
		 avg =list.stream().filter(m->m.getGender() == Member.FEMALE).mapToInt(Member :: getAge).average().getAsDouble();
			System.out.println("여자 평균나이 : " + avg);
			
		
	}

}
