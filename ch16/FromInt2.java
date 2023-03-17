package ch16;

import java.util.stream.IntStream;

public class FromInt2 {
	static int sum = 0;
	public static void main(String[] args) {
//		1부터 100까지의 합
		
		IntStream  stream = IntStream.rangeClosed(1, 100); //rangeclosed -> 100포함
		stream.forEach(x -> sum += x);
		System.out.println("합계 : " +sum);
		
	}

}
