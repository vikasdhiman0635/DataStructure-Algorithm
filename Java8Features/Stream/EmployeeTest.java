package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(1, "vikas", "dhiman", 24, 10000));
        emp.add(new Employee(2, "prateek", "sharma", 24, 10000));
        emp.add(new Employee(3, "vivek", "sahu", 24, 10000));
        emp.add(new Employee(4, "alok", "sharma", 24, 1000));
        emp.add(new Employee(5, "yogi", "chhibber", 24, 1000));
        emp.add(new Employee(6, "aman", "patel", 24, 1000));
        emp.add(new Employee(7, "aman", "ghandi", 24, 10000));
        emp.add(new Employee(8, "aman", "sharma", 24, 20000));
        emp.add(new Employee(9, "ram", "kumar", 24, 20000));
        emp.add(new Employee(11, "ram", "dhiman", 24, 2000));
        emp.add(new Employee(10, "ram", "dhiman", 24, 2000));







        
        // find the third higest salary employee
        Employee thirdSalary = emp.stream()
                .sorted((s1, s2) -> s2.getSalary() > s1.getSalary() ? 1 : s1.getSalary() > s2.getSalary() ? -1 : 0)
                .skip(2)
                .findFirst().get();
        System.out.println(thirdSalary.toString());

        System.out.println("---------------------------------------------");

        // find the List of Higest Paid salary third
        Map<Integer, List<Employee>> lisEmp = emp.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));
        Set<Integer> str = lisEmp.keySet();

        int thirdLargest = str.stream().sorted((s1, s2) -> s2.compareTo(s1)).skip(2).findFirst().get();

        lisEmp.get(thirdLargest).forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        // find the higest salary with is starting from alphabaticaly order
        Map<Integer, List<Employee>> listEmp = emp.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));
        Set<Integer> str1 = listEmp.keySet();

        int data = str1.stream().sorted((s1, s2) -> s2.compareTo(s1)).skip(2).findFirst().get();    

        listEmp.get(data).stream().sorted((s1, s2) -> s2.getfName().compareToIgnoreCase(s1.getfName())).findFirst().ifPresent(System.out::println);
    }

}
