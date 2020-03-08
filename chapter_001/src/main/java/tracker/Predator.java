package tracker;

public class Predator extends Animal{
    public Predator (){
        super();
        System.out.println("Class Predator");
    }

    public Predator (String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
