package test;

import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();

            int i = s.indexOf('.');

            char c = s.charAt(i + 1);
            if(Integer.parseInt(c+"")>=5){
                System.out.println(Integer.parseInt(s.substring(0,i))+1);
            }else {
                System.out.println(Integer.parseInt(s.substring(0,i)));
            }

        }
    }
}
