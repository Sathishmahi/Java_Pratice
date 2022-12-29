public class AbstrctClass {
    public static void main(String[] args) {
        
        WelcomeMessageClass t=new Teacher();
        t.welcomeMessage();
        t.demo();
        
    }

    
}

abstract class WelcomeMessageClass {
    abstract void welcomeMessage();//absract method 
    void demo(){ //concreate method
        welcomeMessage();//call the abstrct method inside the abstract class
        System.out.println("good morning ");
    } 
    
}


abstract class DemoabstrctClass extends WelcomeMessageClass{
    abstract void DemoabstrctMethod();
}

class RealClass extends DemoabstrctClass{

    @Override
    void DemoabstrctMethod() {
        System.out.println("this is a DemoabstrctMethod inside the RealClass");
        
    }

    @Override
    void welcomeMessage() {
        System.out.println("this is a welcomeMessage inside the RealClass");
        
    }
    
}


class Student extends WelcomeMessageClass{
void welcomeMessage() {
        System.out.println("welcome student ");
    }
    void welcomeMessage(String name) {//overloding
        System.out.println("welcome  "+name);
    }

}

class Teacher extends WelcomeMessageClass{
    void welcomeMessage() {
            System.out.println("welcome teacher ");
        }
    
    void TeacherFunction(){
        System.out.println("this is teacher function");
    }
    }

