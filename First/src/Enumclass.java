public class Enumclass{
    public static void main(String[] args) {
        level l=level.Advanced;
        level l1=level.Advanced;
        level l2=level.Beginner;
        String s="sathish";
        System.out.println(s.getClass().getName());//find the datatype of variable
        System.out.println(l.toString());//convert to string 
        System.out.println(l);
        System.out.println( l.equals(l1));//tofind when two object refer same memory or not
        System.out.println( l.compareTo(l2));//compare index between two object
    }
}
enum level {
    Beginner,Intermidiate,Advanced
}