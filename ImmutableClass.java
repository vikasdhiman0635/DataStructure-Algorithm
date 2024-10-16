class ImmutableClass {

    public static void main(String[] args) {
        
        test t1= new test("vikas", "vikas");

        test t2 =new test("vikas", "dhimen");

        System.out.println(t1.getEmail());
        System.out.println(t2.getEmail());

    }

}


final class test{

    public final String name;

    public final String email;

    public test(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}