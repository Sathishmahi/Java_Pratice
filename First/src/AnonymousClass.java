public class AnonymousClass {
    
    public static void main(String[] args) {

        Cycle c=new Cycle(){
            void display(){//AnonymousClass 
                System.out.println("this is a  tricycleclass");
            }
        };
        c.display();
        Cycle c1=new Cycle();
        c1.display();

        DemoInterface d=new DemoInterface(){

            @Override
            public void display() {
                System.out.println("this is a Demo interface display method");
                
            }

            

        };
        d.display();
        d.demomethod();
    }
}


class Cycle{
    void display(){
        System.out.println("this is a cycle class");
    }
}


//create a object using AnonymousClass

interface DemoInterface{
    void display();

    default void demomethod(){
        System.out.println("this is a demomethod inside interface ");
    }
}
