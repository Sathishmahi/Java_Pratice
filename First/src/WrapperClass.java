import javax.print.attribute.IntegerSyntax;

public class WrapperClass {
    public static void main(String[] args) {
        int i=90;//primitive datatype
        Integer i1=Integer.valueOf(10);//boxing or wrapping
        int j=i1.intValue();//unoxing
        Integer i2=10;//auto boxing -- automatically compiler convert into boxing(Integer.valueOf(10))
        int k=i1;//auto unboxing

        int val=Integer.parseInt("123");//convert into str to int


    }
}
