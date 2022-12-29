public class MultiThreading_1 {

/*

advantage of using Runnable interafce is suppose you think you extends a another class in interface sub class you can to it 

but you exteds the thread a class an this case you canot do it
*/    public static void main(String[] args) {


        //Runnable interafec act as a functional interface so we can create anonoymous or lambda expression
        Runnable r1=new Runnable(){//create  ing a anonymous c
            @Override
            public void run() {
                System.out.println("thos is max priorrity thread");
                for(int i=0;i<4;i++){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("this is run method");
                }
                
            }
        };

        Runnable r2=()->{//lambda expression 
            for(int i=0;i<4;i++){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("this is run method");
            }
        };

        Runnable r=new MultiThreading_1_Class();
        Thread t=new Thread(r);//create thread object and pass runnable object or connect to runnabel obj and thread object
        Thread t1=new Thread(r1);// connect to anonymous runnable obj and thread object
        Thread t2=new Thread(r2);//connect to labmda runnable obj and thread object
        t1.start();//start the thread object 
        t2.start();//start the thread object 
        t1.setName("t1 thread");//set a thread name 
        t1.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("this is a main method");
        
        
    }
}

class MultiThreading_1_Class implements Runnable{//implements the trread using interface 

    @Override
    public void run() {
        for(int i=0;i<4;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("this is run method");
        }
        
    }

}


