public class FinalKeyword {
    public static void main(String[] args) {
        
    }
}

class FinalKeyword1{
    final int A=10;//final keyword in variable
    {for(int i=0;i<110;i++){
        A++;//cannot not be modified
    }}


    final void FinalKeyword1Method(){//final method 
        System.out.println("this is aFinalKeyword1Method ");
    }

    void FinalKeyword1Method(int a){
        System.out.println("this is a FinalKeyword1Method overloading ");
    }

}



final class FinalKeyword2 extends FinalKeyword1{//final class
    {FinalKeyword1 k=new FinalKeyword1();
    k.FinalKeyword1Method();}
void FinalKeyword1Method(){//cannot over ride the final method 

}
}

class FinalKeyword3 extends FinalKeyword2{//cannot inharit the final class

}
