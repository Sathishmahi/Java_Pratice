/*
 in a interface contain only one abstrct method that interace called single interface method(SAM) or 
 functional inrerface 
 in java 8 to allow create a lambda expression way to achive or to create a functional interface 
 */

public class LambdaExpression {
    public static void main(String[] args) {
        DemoInterface i1=new DemoInterface(){//normal anonoymous class

            @Override
            public void Demodisplay() {
                System.out.println("this is a demomethod inside the DemoInterface ");
            }
            
        };

        DemoInterface i2= () -> System.out.println("this is a demomethod inside the DemoInterface ");//lambda expression 
        DemoInterface i3= () ->{ System.out.println("this is a demomethod inside the DemoInterface ");
                                System.out.println("this is a multiline lambda expression");
    };//Multiline lambda expression 
    i3.Demodisplay();

    }
}


interface DemoInterface{//contain only one abstrct method so that class SAM Class 
    void Demodisplay();
   
}

/*
 *diff between createing a 
    anonoymous class and lambda expression is 
    lambda expression to create if that interface contain only one  abstract method for exmaple  DemoInterface
    but anonymous class to create if to our interace more then one abstract method  that situation we can use  anonymous class
 * 
 */
