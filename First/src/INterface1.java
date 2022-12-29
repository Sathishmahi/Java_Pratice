public class INterface1 {
    public static void main(String[] args) {
        INterface11 inter=new InterFaceClass();//creatig a interface instance using sub class
        inter.bye();//calling a inter face method using interface instance
        inter.demo();//calling a interface abstract method 
        InterFaceClass1 inter1=new InterFaceClass1();
        InterFaceClass1.InterFaceClass11 interobj=new InterFaceClass1.InterFaceClass11();
        interobj.DemointerMethod();


       Demointer11 sub=new sunDemointer11();
       Demointer11.Demo d=new Demointer11.Demo();
       d.demo();

        
    }
}

interface INterface11{//outter interface 

    void demo();
    default void bye(){
        System.out.println("this is bye method ");
    }

    interface newInter{//inner interace 
        void demo1();
    }

}

class InterFaceClass implements INterface11,INterface11.newInter{//calling amultiple interface

 


    @Override
    public void demo() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void demo1() {
        // TODO Auto-generated method stub
        
    }
}


class InterFaceClass1{
    interface Demointer{
        void DemointerMethod();

        
    }

    static class InterFaceClass11 implements Demointer{

        @Override
        public void DemointerMethod() {
           System.out.println("this interface method but inside class ");
            
        }
        
    }
}



interface Demointer11{
    int i=10;//interface varibale by default final and static 
    void demo();
    static class Demo implements Demointer11{//inner class implements the super interface

        @Override
        public void demo() {//interface method
            System.out.println("this is interface methosbut this class inside the super interface ");
            
        }

    }
}

class sunDemointer11 implements Demointer11{

    @Override
    public void demo() {
        // TODO Auto-generated method stub
        
    }

}