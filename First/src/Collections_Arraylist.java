import java.util.*;
public class Collections_Arraylist {
    public static void main(String[] args) {
        int []a=new int[10];//array fixed size
        ArrayList<Integer> alist=new ArrayList<Integer>();//array list size not fixed you can store n number of items
        //alist.add(10);
        ArrayList slist=new ArrayList();//donot mention datatype and Arraylist support redudancy(copy of variable)
        slist.add("demo");
        slist.add(10);
        System.out.println(slist.get(0));
        slist.set(0,200);
        slist.remove(0);
        for(int i=0;i<10;i++){
            alist.add(i*2);//set a value in alist
        }
        for(int i:alist){
            System.out.println(i);//print the all elements in alist using for loop
        }
        Iterator<Integer> iter=alist.iterator();//initiaalize the iterator
        while(iter.hasNext()){//print the all elements in alist using iterator but while loop in this case our list length you not know
            //hasNext() return booolean whether next elememt present or not
            System.out.println("alist element using iter.next but while loop "+iter.next());
        }
        for(int i=0;i<10;i++){
            System.out.println("alist element using iter.next  "+iter.next());//print the all elements in alist using iterator but for loop in this case our list length you know

        } 

       
        
    }   
}