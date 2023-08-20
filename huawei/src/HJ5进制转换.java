import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 *
 * 数据范围：保证结果在
 * 1≤n≤2^31−1
 * 输入描述：
 * 输入一个十六进制的数值字符串。
 *
 * 输出描述：
 * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
 *
 * 示例1
 * 输入：
 * 0xAA
 * 输出：
 * 170
 */
public class HJ5进制转换 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(Long.parseLong(line.substring(2) , 16));
        }
    }
    public static void main1(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = bf.readLine())!=null){
            String temp = input.substring(2,input.length());
            int sum = 0;
            int length = temp.length();
            for(int i= length-1;i>=0;i--){
                char c = temp.charAt(i);
                int tempNum = (int)c;
                if(tempNum>=65){
                    //如果 tempNum 大于等于 65，那么它可能对应于字母 'A' 到 'F'。在这种情况下，代码会将 tempNum 减去 65，然后加上 10，以将 'A' 到 'F' 转换为 10 到 15 的十进制值
                    tempNum = tempNum - 65 + 10;
                }else{
                    //果 tempNum 小于 65，那么它可能对应于数字 '0' 到 '9'。在这种情况下，代码会将 tempNum 减去 48，以将 '0' 到 '9' 转换为 0 到 9 的十进制值
                    tempNum = tempNum - 48;
                }
                sum = sum + (int) Math.pow(16, length-i-1)*tempNum;
            }
            System.out.println(sum);
        }
    }


}
