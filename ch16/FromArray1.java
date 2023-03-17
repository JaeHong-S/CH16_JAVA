package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArray1 {
	public static void main(String[] args) {
		String[] list = {"철수", "미자", "광배","덕기","은례"};
		Stream<String> stream = Arrays.stream(list);
		stream.forEach(a -> System.out.println(a + ", "));
		System.out.println();
		int[] intArray = {11,22,33,55,63};
		IntStream stream2 = Arrays.stream(intArray);
		stream2.forEach(s -> System.out.println(s + ", "));
		System.out.println();
		
		List<Student2> list2 = Arrays.asList(new Student2("보검",77), new Student2("하니", 22), new Student2("율곡", 21),
				new Student2("키위", 53));
		Stream<Student2> stream3 = list2.stream();
		stream3.forEach(d -> System.out.println(d.getName() + ", "));
		System.out.println();
		Stream<Student2> stream4 = list2.stream();
		stream3.forEach(d -> System.out.println(d.getScore() + ", "));
		System.out.println();
		Stream<Student2> stream5 = list2.stream();
		stream3.forEach(d -> System.out.println(d.getName() + " : " + d.getScore() + ", "));
		

	}
}