package tracker;

public class Predator extends Animal{
    public Predator (){
        super();
        System.out.println("Class Predator");
    }

    public static void main(String[] args) {
        System.out.println(new Predator());
    }
}
