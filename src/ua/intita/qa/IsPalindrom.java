package ua.intita.qa;

public class IsPalindrom {
    public static void ispalindrom(int[] arr, int n){
        int[] pal = new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            String arrStr = String.valueOf(arr[i]);
            StringBuilder arrReverse = new StringBuilder(arrStr);
            arrReverse.reverse();
            if(arrStr.equals(arrReverse.toString())){
                pal[j]=arr[i];
                j++;
            }
        }
        System.out.println("Palindroms: ");
        for (int p: pal) {
            if(p!=0)
                System.out.print(p+" ");
        }
    }
}