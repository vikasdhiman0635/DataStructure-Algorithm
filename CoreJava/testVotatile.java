package CoreJava;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class testVotatile {
    
    public static volatile int x = 5;

    public static void main(String[] args) {
        System.out.println();
        x=19;
        System.out.println(x);
        System.out.println();
        test();

        Runnable test = new Runnable() {

            @Override
            public void run() {
                System.out.println("test");
            }
            
        };

        Runnable newTry = () ->  System.out.println("try new with lambda functions");

        Thread t1=new Thread(newTry);
        t1.start();

        List<Employee> lis = new ArrayList<>();
        Employee e1= new Employee();
        e1.setName("Vikas");
        lis.add(e1);

        lis.stream().map(Employee::getName).forEach(System.out::println);
    }
    
    public static void test(){
        System.out.println(x);
    }

}


class Employee implements Externalizable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeExternal'");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readExternal'");
    }

    

}