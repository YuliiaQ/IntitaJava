package ua.intita.qa;

public class ThreeDigitsWithNoRepetition {
    public static void noRepet(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            int number = arr[i];
            int count = (arr[i] == 0) ? 1 : 0;
            while (arr[i] != 0) {
                count++;
                arr[i] /= 10;
            }
            if (count == 3) {
                int[] num = new int[3];
                for (int j = 0; j < 3; j++) {
                    num[j] = number % 10;
                    number /= 10;
                }
                int flag = 0;
                for (int j = 0; j < 2; j++) {
                    for (int k = j + 1; k < 3; k++) {
                        if (num[j] == num[k]) {
                            System.out.println(" has identical numbers");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 1) {
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(" has no identical numbers");
                }
            } else {
                System.out.println(" is not a three numbers");
            }
        }
    }
}
