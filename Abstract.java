public class Abstract {

    public static void main(String[] args) {
        


    }
}

abstract class test implements A{
    // An abstract class must be declared with an abstract keyword.
    // It cannot be instantiated.
    abstract void run();

    // It can have abstract and non-abstract methods.
    void checkmain(){
        System.out.println("check Main");
    }

    // It can have constructors and static methods also.
    test(){}

    // It can have final methods which will force the subclass not to change the body of the method.
    final void testnewMethod(){};
}

class check extends test {

    @Override
    void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void tail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tail'");
    }
}


interface A{

    public void tail();
}