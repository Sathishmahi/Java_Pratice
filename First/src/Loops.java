import java.util.*;

public class Loops {
    public static void main(String[] args) {
        int i=0;
        while(true){
            System.out.println(i);
            i++;
            if(i==10){
                break;
            }
        
        }

        for(int j=0;j<10;j++){
            System.out.println(j);
        }

        int k=0;
        do{
            System.out.println(k);
        }while(i<10);


        int arr[]={10,20,30,490,940};
        int sum=0;
        for(int x:arr){//for each loop
            System.out.println(sum=sum+x);

        }
    }
}