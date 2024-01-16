package ch17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 파일로부터 스트림 얻기 p.734
 * data.txt파일 생성후 실습하기
 */
public class StreamExample {

	public static void main(String[] args) throws Exception {
		//data.txt 파일의 경로(Path) 객체 얻기
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		//Path로부터 파일을 열고 한 행씩 읽으면서 문자열 스트림 생성, 기본 utf-8 문자셋으로 읽음
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();
		
	}
	
}
