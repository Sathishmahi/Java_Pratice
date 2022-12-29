

class ClassDemo1 {

    static int a=90;
    int b=90;

    ClassDemo1(){

     

        System.out.println("demo class ");
    }

    ClassDemo1(int a){

        System.out.println("demo class1 ");
    }



    
}

public class ClassDemo {

    static int a=90;
    int b=90;

    ClassDemo(){

        MainClass cd=new MainClass();
     
        String a[]={"sathish"};
        MainClass.Demo(a);
    }

    ClassDemo(int a){

        System.out.println("demo class1 ");
    }



    
}


