package test;

import java.io.IOException;
import java.io.InputStream;

public class HJ1 {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int length = 0;
        char c;
        while('\n' != (c=(char)in.read())){
            length++;
            if(' ' == c){
                length=0;
            }
        }
        System.out.println(length);
    }
}
