public class ArithmaticOperator {
    public static void main(String[] args) {
        // +  - * / %
        System.out.println(90+90);
        System.out.println(90/90);
        System.out.println(90%90);
        System.out.println(90*90);
        System.out.println((float) 7/90);

        //compound opertaor

        int a=10;
        a+=3;
        System.out.println(a);
        a-=3;
        System.out.println(a);
        a%=3;
        System.out.println(a);

        //increment opertaor

        a++;//post increment
        ++a;//pre increment

        a--;//post decrement
        --a;//pre decrement

        int b=9;
        int c=b++;//first assinging after increment
        int d=++b;//first increement after assingn

        System.out.println(c+" "+d);
    }
    }

