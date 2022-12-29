import java.util.*;

/*
 linked list is a another type of collection in java 

strcture of linked lidt  [element ,*ptr(next element)]

main advantage of linked list is if you have add/remove in the middle very fastly compare to Array/Array_list

 */


public class Collection_LinkedList {
    public static void main(String[] args) {
        LinkedList li=new LinkedList();
        li.add(10);
        li.add(100);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        li.addFirst(909);
        li.addLast(9098);
        System.out.println(li);

        
    }
}
