package DesignPatterns;

public class Singleton {

    public static void main(String[] args) {

        System.out.println();

        Employee a = Animal.getAnimal();
        Employee b = Animal.getAnimal();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // Dog d1 = Dog.getDog();
        // Dog d2 = Dog.getDog();

        // System.out.println(d1.hashCode());
        // System.out.println(d2.hashCode());

    }

}

// Lazy way creating single Object
class Animal {

    private static Employee animal;

    private Animal() {
    }

    public static Employee getAnimal() {
        if (animal == null) {
            synchronized (Animal.class) {
                if (animal == null) {
                    animal = new Employee();
                }
            }
        }
        return animal;
    }

}

// Eager way creating Object
class Dog {

    private static Dog dog = new Dog();

    private Dog() {
    }

    public static Dog getDog() {
        return dog;
    }

}

class Employee {

    private String name;
    private String email;

    Employee() {
        this.name="Vikas";
        this.email="vikas@gmail.com";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}