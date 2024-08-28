public interface Animals {

    public void bark();

    public default void eat(){
        System.out.println("Animals are eating");
    }

}