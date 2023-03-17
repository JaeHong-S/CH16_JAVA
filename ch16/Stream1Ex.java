package ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1Ex {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("로제"); list.add("제니"); list.add("보검");
		List<String> list = Arrays.asList("로제", "하니", "보검");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("==============");
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
		
	}
}
