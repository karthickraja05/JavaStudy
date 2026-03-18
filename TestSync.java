import java.util.prefs.BackingStoreException;

public class TestSync {
    public static void main(String[] args) {
        CakeCounter counter = new CakeCounter();
        Thread team1 = new Thread(new Team(counter));
        Thread team2 = new Thread(new Team(counter));
        team1.start();
        team2.start();
        team1.setName("team a thread");
        team2.setName("team b thread");
        try {
            team1.join();
            team2.join();
        } catch (Exception e) {
            
        }
        System.out.println(counter.getCount());
    }
}


class CakeCounter {
    int counter;

    public synchronized void increment(){
        counter++;
    }

    public int getCount(){
        return counter;
    }
}

class Team implements Runnable{
    CakeCounter counter;
    Team(CakeCounter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i = 0; i < 1000; i++){
            counter.increment();
        }
        System.out.println(Thread.currentThread().getName());
    }
}