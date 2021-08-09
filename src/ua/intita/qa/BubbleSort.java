package ua.intita.qa;

import java.util.Arrays;

public class BubbleSort {
    public static void fromMinToMax (int arr[], int n) {
        for(int i=n-1;i>0;i--){
            for(int j=0; j<i; j++){
                if(arr[j]>=arr[j+1]){
                    int max=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=max;
                }
            }
        }
        System.out.println("From minimum to maximum value : "+Arrays.toString(arr));
    }
}
