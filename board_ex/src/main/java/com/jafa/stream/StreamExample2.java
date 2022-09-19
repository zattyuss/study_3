package com.jafa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("길동");
		list.add("고");
		list.add("스트림 생성");
		
		//스트링 생성
		Stream<String> stream = list.stream();
		
		// 파라미터로 람다식 전달
		// 파라미터 타입 생략가능
		// 파라미터가 하나이면 소괄호 생략 가능
		stream.forEach(   e -> {
			System.out.println(e);
			System.out.println("길이 : " + e.length());
			System.out.println("===============================");
		});
			
		System.out.println("람다식");
		Stream<String> stream2 = list.stream();
		
		//중괄호 내 코드가 한 줄인 경우
		// 중괄호 생략 가능
		// stream2.forEach(e -> {System.out.println(e);});
		
		stream2.forEach(e -> System.out.println(e));
		
		//메소드 참조
		System.out.println("메소드 참조");
		list.stream().forEach(System.out::println);
		
		
		
	}
}