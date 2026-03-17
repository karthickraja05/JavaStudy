class Cake extends Thread{
    public void run(){
        System.out.println("Mixing ingredients for cake:"+ Cake.currentThread().getId());
        System.out.println("Baking Cake:"+ Cake.currentThread().getId());
        System.out.println("Decorate Cake:"+ Cake.currentThread().getId());
    }
}

public class ThreadBaking {
    public static void main(String[] args) {
        int Count = 4;
        for (int i = 0; i < Count; i++) {
            // Cake obj = new Cake();
            // obj.start();    

            Employee obj = new Employee();
            Thread thread = new Thread(obj);
            thread.start();
        }
    }
}


class Employee implements Runnable{
    public void run(){
        System.out.println("Mixing ingredients for cake:"+ Thread.currentThread().getId());
        System.out.println("Baking Cake:"+ Thread.currentThread().getId());
        System.out.println("Decorate Cake:"+ Thread.currentThread().getId());
    }
}