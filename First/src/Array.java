import java.util.*;
public class Array {
    public static void main(String[] args) {
        int mark[]={90,90,90,90,90,90};
        for(int i=0;i<mark.length;i++){
            System.out.println(i);
        }

        int c[][]={
            {1,2,3,3},
            {2,2,3,4,4,4}
        };
        int[][] marks=new int[3][5];
        System.out.println(marks.length);
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                marks[i][j]=i+j;
            }

        }


        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.println("index is "+i+" "+j+" "+marks[i][j]);
            }

        }
        
    }
    
}
