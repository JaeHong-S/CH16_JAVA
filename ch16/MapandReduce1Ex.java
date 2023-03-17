package ch16;

import java.util.Arrays;
import java.util.List;

public class MapandReduce1Ex {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(new Student2("보검",77), new Student2("하니", 22), new Student2("율곡", 21),
				new Student2("키위", 53));
		double avg = list.stream().mapToInt(Student2::getScore).average().getAsDouble();//정수로 비교
		System.out.println("평균 점수 : " + avg);
	}

}
