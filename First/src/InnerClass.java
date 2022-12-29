public class InnerClass {
    public static void main(String[] args) {

        OuterClass o=new OuterClass();
        o.display_OuterClass();
        // OuterClass.InnerClass i=new OuterClass.InnerClass();//inner class calling 
        // i.display();

    }
}

class OuterClass{
    void display_OuterClass(){
        System.out.println("outter class display method");
    }

     static class InnerClass{//inner class
        void display(){
            System.out.println("inner class display method");
        }
        // OuterClass o=new OuterClass();
        // {o.display_OuterClass();}
        
    }

    InnerClass i=new InnerClass();
   { i.display();}
}
