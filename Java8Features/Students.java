import java.util.function.Function;
import java.util.function.Predicate;

class FI {
    public static void main(String[] args) {

        Students[] array = {
                new Students("Vikas", 85),
                new Students("Yogi", 75),
                new Students("vivek", 55),
                new Students("Aman", 45),
                new Students("Gaurav", 25)
        };
        Predicate<Integer> p1 = s -> s >= 60 && s < 80;
        Predicate<Integer> p2 = marks -> marks >= 50 && marks < 60;
        Predicate<Integer> p3 = marks -> marks >= 35 && marks < 50;
        Function<Students, String> f = s -> {
            int marks = s.marks;
            String grade = "";
            if (marks >= 80)
                grade = "A";
            else if (p1.test(marks))
                grade = "B";
            else if (p2.test(marks))
                grade = "C";
            else if (p3.test(marks))
                grade = "D";
            else if (marks < 35)
                grade = "E";
            return grade;
        };

        for (Students student : array) {
            System.out.println(f.apply(student));
        }

    }
}

public class Students {

    String name;
    int marks;

    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}