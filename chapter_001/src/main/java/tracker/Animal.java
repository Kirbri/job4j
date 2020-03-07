package tracker;

public class Animal {
    String name;

    public Animal (){
        super();
        System.out.println("Class Animal");
    }
    public Animal (String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(new Animal());
    }
}
