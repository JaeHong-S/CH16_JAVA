package ch16;

import java.util.Arrays;
import java.util.List;

public class Filter1Ex {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("김철수", "김미자", "최창제", "이득군", "남궁민수", "함곽배", "이득군");
		names.stream().distinct().forEach(n -> System.out.println(n)); //중복된것을 제거함
		System.out.println("===============");
		names.stream().filter(n->n.startsWith("남")).forEach(n->System.out.println(n));
		System.out.println("===============");
		names.stream().filter(n -> n.startsWith("남")).distinct().forEach(n -> System.out.println(n));
		
	}

}
