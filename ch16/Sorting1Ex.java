package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sorting1Ex {
	public static void main(String[] args) {
		IntStream intstrm = Arrays.stream(new int[] {5,2,4,3,1});
		intstrm.sorted().forEach(n -> System.out.print(n + ", "));
		System.out.println();
		List<Student2> list = Arrays.asList(new Student2("보검",77), new Student2("하니", 22), new Student2("율곡", 21),
				new Student2("키위", 53));
		list.stream().sorted().forEach(s -> System.out.println(s.getScore() + " "));
		System.out.println();
		list.stream().sorted().forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		System.out.println();

		
	}

}
