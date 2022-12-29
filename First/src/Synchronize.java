//synchronized is a keyword to lock a method 

public class Synchronize {
    public static void main(String[] args) {
        Table t1=new Table();
        Thread t=new Thread(){
            public void run(){
                t1.printTbale(5);
            }
        };

        Thread t2=new Thread(){
            public void run(){
                t1.printTbale(5);
            }
        };

        t.start();
        t2.start();
    }
}

class Table{
    synchronized void printTbale(int a){
        for(int i=1;i<=5;i++){
            System.out.println(i*a);
        }
    }
}
