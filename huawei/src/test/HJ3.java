package test;

import java.util.Scanner;

public class HJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer N = Integer.valueOf(scanner.nextLine());
        int[] arr = new int[501];
        int j = 0;
        while (j<N){
            int randomInt = Integer.valueOf(scanner.nextLine());
            arr[randomInt] = 1;
            j++;
        }
        for(int i=0 ;i<500 ;i++){
            if(arr[i]==1){
                System.out.println(i);
            }
        }

    }
}
