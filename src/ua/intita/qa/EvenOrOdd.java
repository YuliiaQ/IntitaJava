package ua.intita.qa;

public class EvenOrOdd {
    public static void evenOrOdd (int[] arr,int n) {
        for (int i=0; i<n; i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]+" Odd item");
            } else{
                System.out.println(arr[i]+" Even item");
            }
        }
    }
}
