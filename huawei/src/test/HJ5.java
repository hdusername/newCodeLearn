package test;

import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String str = scanner.nextLine();

            String substring = str.substring(2);

            int length = substring.length();
            int sum = 0;
            for(int i = length-1; i>=0;i--){
                char c = substring.charAt(i);
                int tempNum = (int)c;
                if(c>=65){
                    tempNum = c-65+10;
                }else {
                    tempNum = c-48;
                }
                sum = sum+(int)Math.pow(16,length-i-1)*tempNum;
            }
            System.out.println(sum);
        }
    }
}
