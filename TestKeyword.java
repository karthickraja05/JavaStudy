public class TestKeyword {
    public static void main(String[] args) {
        Father father = new Father();
        // System.out.println(father.gender);

        Daughter daughter = new Daughter();
        // System.out.println(daughter.gender);


        Car honda = new Car();
        honda.setValue("Petrol", 2016, true);
        honda.print();
    }   
}


class Father {
    final char gender = 'M';
    void print(){
        System.out.println("Father class print");
    }
}


class Daughter extends Father {
    char gender = 'F';
    int count = 0;
    void print(){
        System.out.println("Daughter class print");
        if(count < 5){
            count++;
            print();
        }
    }
}

class Car{
    String fuel;
    int makeYear;
    boolean isGear;
    void setValue(String fuel, int makeYear , boolean gear){
        this.fuel = fuel;
        this.makeYear = makeYear;
        isGear = gear;
    }

    void print(){
        System.out.println(this.fuel);
        System.out.println(this.makeYear);
        System.out.println(this.isGear);
        System.out.println(this);
    }

}