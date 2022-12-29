import java.security.AccessControlException;

// package OOps;

public class Stack {
    public static void main(String[] args) {

        Stack_imple s = new Stack_imple();
        // s.push(1);
        // s.push(10);
        // s.pop();
         s.pop();
        s.push(10);
        s.push(101);
        s.pop();
        s.push(1012);
        s.pop();
        s.pop();
        Access_modifier a=new Access_modifier();
        a.demofun();
        // System.out.println("arr length "+s.arr.length);
        //
        // System.out.println("arr length "+s.arr.length);

        // s.push(104);

        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();

    }

}

class Stack_imple {
    int arr[] = new int[2];
    int counter = 0;

    void define_ar(int[] a) {
        arr = a;

    }

    boolean isEmpty(int[] arr2) {
        boolean isE = false;

        if (arr2[arr2.length - 1] == 0) {
            isE = true;
            return isE;
        } else {
            isE = false;
            return isE;
        }
    }

    void push(int a) {
        counter++;
        boolean toF = isEmpty(arr);

        if (toF) {

            arr[counter] = a;

        }

        else {

            int new_arr[] = arr;
            int arr1[] = new int[arr.length * 2];

            arr = arr1;

            for (int i = 0; i < new_arr.length; i++) {
                arr[i] = new_arr[i];
            }
            arr[counter] = a;

        }
    }

    void pop() {
        if (arr[0] == 0) {
            System.out.println("no element for pop");
        }
        System.out.println("pop val is " + arr[counter]);
        counter--;

    }

    void print_all() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}