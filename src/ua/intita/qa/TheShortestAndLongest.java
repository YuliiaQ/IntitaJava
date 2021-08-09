package ua.intita.qa;

public class TheShortestAndLongest {
    public static void longAndShort(int arr[], int n){
        int maxLength = String.valueOf(Math.abs(arr[0])).length();
        int minLength = String.valueOf(Math.abs(arr[0])).length();
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<(n-1); i++){
            int length = String.valueOf(Math.abs(arr[i])).length();
            if(length>=maxLength){
                maxLength=length;
                max=arr[i];
            }
            else{
                if(length<=minLength){
                    minLength=length;
                    min=arr[i];
                }
            }
        }
        System.out.println("The longest item : "+max+", length : "+maxLength);
        System.out.println("The shortest item : "+min+", length : "+minLength);
    }
}
