import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * 输入描述：
 * 输入一个整数
 *
 * 输出描述：
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。
 *
 * 示例1
 * 输入：
 * 180
 * 输出：
 * 2 2 3 3 5
 */
public class HJ6质数因子 {

    public static void main(String[] args) throws IOException {
        //设 n 为一个合数，而 p 是它的最小的质因子，其中 p 不等于 1。那么 n = a * p，其中 a 可能是一个质数或合数。
        //如果 p 大于 n 的平方根，因为p是最小的质因子，那么 a 也必然大于 n 的平方根，那么a*p肯定大于n所以是不对的，找质因子只从2-n的平方根之间搜索即可
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder();
            //Math.sqrt()用于计算一个数的平方根
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    sb.append(i).append(" ");
                    num = num / i;
                    //这里是为了判断相同的质因数会不会是num的质因子
                    //
                    i--;
                }
            }
            sb.append(num).append(" ");
            System.out.println(sb.toString());
        }
    }
}
