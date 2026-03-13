public class TestRelation {
    public static void main(String[] args) {
        Mother obj = new Mother();
        System.out.println(obj.gender);

        Uncle obj1 = new Uncle();
        System.out.println(obj1.gender);
        obj1.name();

        Computer obj3 = new HP();
        obj3.turnON();
        obj3.turnOFF();
    }
    
}


class GrandFather {
    char gender = 'G';
    String name = "Karthick Family";
}

class Mother extends GrandFather {
    char gender = 'M';

    void name(){
        System.out.println("My name is mother");
    }
}

class Uncle extends GrandFather {
    char gender = 'U';

    void name(){
        System.out.println("My name is uncle");
    }
}



abstract class Computer {
    void turnON(){
        System.out.println("System turn on");
    }

    void turnOFF(){
        System.out.println("System turn off");
    }

    abstract void systemOS();
    
}


class HP extends Computer{
    void turnON(){
        System.out.println("HP System turn on");
    }

    void turnOFF(){
        System.out.println("HP System turn off");
    }

    void systemOS(){
        System.out.println("Microsoft Os");
    }
}

class DELL extends Computer{
    void systemOS(){
        System.out.println("Microsoft Os");
    }
}