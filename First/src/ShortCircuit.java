import org.omg.CORBA.DATA_CONVERSION;

public class ShortCircuit {

    //normal and , or  & ,|
    // ShortCircuit operator &&  ||
    public static void main(String[] args) {
        int a=12;
        //check only first so its statify go agin next if condtion is fail imidiatly terminated 
        System.out.println(a>20 && a<30);
        System.out.println(a>20 || a<30);


        //operator precedence

        double c=(10*(10/120))-(910+82)+a++;
        a=3;
        double d=++a*10+9;
        //BODMAS
        System.out.println(c);
        System.out.println(d);
    }
}
