import java.util.*;

/*
 Queue is another type of java collections 
 Queue is a interface

 concept of Queue is ----->   (first in first out)
 */
public class Collections_Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList();
        Queue<Integer> q1=new PriorityQueue();//another type of queue but sorting the all element 
        q.add(100);
        q.add(10);
        q.add(1020);
        // System.out.println(q.size());
        // System.out.println(q.remove());
        // System.out.println(q.poll());
        System.out.println(q);

        q1.add(100);
        q1.add(10);
        q1.add(1020);
        System.out.println(q1);


        
       
    }
}
