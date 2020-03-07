package tracker;

public class Tiger extends Predator {
    public Tiger (){
        super();
        System.out.println("Class Tiger");
    }

    public static void main(String[] args) {
        System.out.println(new Tiger());
    }
}
