package ua.intita.qa;

public class BiggestOrSmallestNumber {
    public static void biggestOrSmallest (int[] arr, int n) {
        int max=0;
        for(int i=0; i<n; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The biggest number of the array : "+max);

        int min=arr[0];
        for(int i=0; i<n; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The smallest number of the array : "+min);
    }
}
