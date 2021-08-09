package ua.intita.qa;
import java.util.Arrays;

public class IncreaseLength {
    public static void increaseLength (int[] arr, int n){
        int[] length = new int[n];
        for (int i=0; i<n; i++){
            length[i] = String.valueOf(Math.abs(arr[i])).length();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0; j<i; j++){
                if(length[j]>=length[j+1]){
                    int tmp = length[j];
                    length[j]=length[j+1];
                    length[j+1]=tmp;
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("Length: "+Arrays.toString(length));
        System.out.println("Array: "+ Arrays.toString(arr));
    }
}
