package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class testFile {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        System.out.println();
        // Question 1:
        // Find list of students whose first name starts with alphabet A
        // Answer:
        List<Student> startWithA = list.stream().filter(std -> std.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
        startWithA.forEach(System.out::println);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 2:
        // Group The Student By Department Names
        // Answer:
        Map<String, List<Student>> groupByDepartment = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName));

        groupByDepartment.forEach((department, students) -> {
            System.out.println(department);
            students.forEach(System.out::println);
        });

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 3:
        // Find the total count of student using stream
        // Answer:
        long count = list.stream().count();
        System.out.println(count);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 4:
        // Find the max age of student
        // Answer:
        list.stream().sorted((s1, s2) -> s1.getAge() > s2.getAge() ? -1 : s2.getAge() > s1.getAge() ? 1 : 0).findFirst()
                .ifPresent(System.out::println);
        OptionalInt maxAge = list.stream().mapToInt(student -> student.getAge()).max();
        System.out.println(maxAge.getAsInt());

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 5:
        // Find all departments names
        // Answer:

        List<String> allDepartments = list.stream().filter(s -> s.getDepartmantName() != null)
                .map(s -> s.getDepartmantName()).distinct().collect(Collectors.toList());
        allDepartments.forEach(System.out::println);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 6:
        // Find the count of student in each department
        // Answer:
        Map<String, Long> countByDepartment = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));

        countByDepartment.forEach((str, cnt) -> System.out.println("Department: " + str + ", Count: " + cnt));

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 7:
        // Find the list of students whose age is less than 30
        // Answer:

        List<Student> lessThen30 = list.stream().filter(s -> s.getAge() < 30).collect(Collectors.toList());
        lessThen30.forEach(System.out::println);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 8:
        // Find the list of students whose rank is in between 50 and 100
        // Answer:
        List<Student> inBetween = list.stream().filter(s -> s.getRank() > 50 && s.getRank() <= 100)
                .collect(Collectors.toList());

        inBetween.forEach(System.out::println);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 9:
        // Find the average age of male and female students
        // Answer:
        Map<String, Double> averageAgeByGender = list.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));

        averageAgeByGender.forEach((gender, age) -> System.out.println("Gender: " + gender + ", Avg.: " + age));

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 10:
        // Find the department who is having maximum number of students
        // Answer:
        list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet()
                .stream().sorted((i1, i2) -> i1.getValue() > i2.getValue() ? -1 : i2.getValue() > i1.getValue() ? 1 : 0)
                .map(s -> s.getKey()).findFirst().ifPresent(s -> System.out.println(s));

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 11:
        // Find the Students who stays in Delhi and sort them by their names
        // Answer:

        List<Student> stayInDelhi = list.stream().filter(s -> s.getCity().equals("Delhi"))
                .sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());

        stayInDelhi.forEach(s -> System.out.println(s));

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 12:
        // Find the average rank in all departments
        // Answer:

        Map<String, Double> avgRank = list.stream().collect(
                Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingDouble(Student::getRank)));

        avgRank.forEach((dept, avg) -> System.out.println("Department: " + dept + ", Average Rank: " + avg));

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 13:
        // Find the highest rank in each department
        // Answer:
        Map<String, Optional<Student>> maxRank = list.stream().collect(
                Collectors.groupingBy(Student::getDepartmantName,
                        Collectors.maxBy(Comparator.comparing(Student::getRank))));

        maxRank.forEach((dept, std) -> {
            System.out.println("Department: " + dept);
            System.out.println("Student: " + std);
        });

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 14:
        // Find the list of students and sort them by their rank
        // Answer:
        List<Student> sortedByRank = list.stream().sorted(Comparator.comparing(Student::getRank))
                .collect(Collectors.toList());

        sortedByRank.forEach(System.out::println);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        // Question 14:
        // Find the student who has second rank
        // Answer:

        list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().ifPresent(System.out::println);

        
    }

}
