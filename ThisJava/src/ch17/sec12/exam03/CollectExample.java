package ch17.sec12.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



/*
 * 날짜 : 2024/01/21
 * 이름 : 이예나
 * 내용 : 요소 그룹핑 p.765
 */
public class CollectExample {

    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 100));

        // Grouping students by gender and calculating average score
        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getSex,
                                Collectors.averagingDouble(Student::getScore)
                        )
                );

        // Printing the map with average scores
        System.out.println(map);
    }
}















