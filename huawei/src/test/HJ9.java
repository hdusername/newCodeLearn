package test;

import java.util.Scanner;

public class HJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        //这个解法不对
//        while (scanner.hasNext()){
//            String s = scanner.nextLine();
//            int length = s.length();
//            stringBuilder.append(Integer.parseInt(s) % 10);
//            for(int j = length-1;j>0;j--){
//                int i = Integer.parseInt(s.substring(0,j));
//                String tm = i%10+"";
//                if(stringBuilder.toString().indexOf(tm)<=0) {
//                    stringBuilder.append(i % 10);
//                }
//            }
//        }
    }
}
