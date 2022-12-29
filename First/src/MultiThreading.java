public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        MultiThreadingClass1  m=new MultiThreadingClass1();
        m.start();//start a thread
        MultiThreadingClass2 m1=new MultiThreadingClass2();
        m1.printSomthing1();
        m.demoMethid();
        if(m.isAlive()){//check the threead are alive or not 
            System.out.println("alive the thread");
        }
        m.join();//join method used to m thread will finish after main was running
        System.out.print("all thread are finish");
        if(m.isAlive()){//check the threead are alive or not 
            System.out.println("alive the thread");
        }
    }
}

class MultiThreadingClass1 extends Thread{//
    public void run(){//over riding a run method inside the Thread class
        for(int i=0;i<5;i++){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("print something");}
    
    
    }

    void demoMethid(){
        System.out.println("this is a demo method");

    }
}


class MultiThreadingClass2{
    void printSomthing1(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}