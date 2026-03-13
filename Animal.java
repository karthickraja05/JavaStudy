public class Animal {
    int Leg = 4;

    void eat(){
        System.out.println("I am eating");
    }

    void walk(){
        System.out.println("I am walking");
    }
}

class Dog extends Animal{
    boolean barking = true;
    
}


class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        System.out.println(obj.Leg);
        obj.eat();
        obj.walk();


        Automobile obj2 = new Auto();
        obj2.fuel();
        obj2.callHelper();
    }
    
}



interface Automobile {
    void fuel();
    
    private void helper(){
        System.out.println("Helper method");
    }

    default void callHelper(){
        helper();
    }
}

class Auto implements Automobile {
    public void fuel(){
        System.out.println("Petrol is fuel");
    }

    

}