package ua.intita.qa;

import java.util.Arrays;

public class BubbleSort2 {
    public static void fromMaxToMin (int[] arr, int n) {
        for(int i=n-1;i>0;i--){
            for(int j=0; j<i; j++){
                if(arr[j]<=arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("From maximum to minimum value : "+ Arrays.toString(arr));
    }
}
