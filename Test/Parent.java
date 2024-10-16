public class Parent {

    public void print(){
        System.out.println("this is parent");
    }

}

class Child extends Parent {
    @Override
    public void print() {
        System.out.println("this is child");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println();
        
        Parent p = new Child();
        p.print();
    }
}