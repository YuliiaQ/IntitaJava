package ua.intita.qa;

public class FindPrimitive {
    public static void primitive(int[] arr,int n) {
        int[] primitNum = new int[n];
        int k=0;
        for(int i=0; i<n; i++){
            int flag=0;
            for(int j=2; j<arr[i]; j++){
                if(arr[i]%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                primitNum[k] = arr[i];
                k++;
            }
        }
        System.out.print("Primitive number : ");
        for (int prime: primitNum) {
            if(prime!=0)
                System.out.print(prime+" ");
        }
        System.out.print("\n");
    }
}