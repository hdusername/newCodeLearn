import java.io.IOException;
import java.io.InputStream;

/**
 * 描述
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 *
 * 数据范围：
 * 0≤n≤2^30−1
 *
 * 输入描述：
 * 输入一个int整数
 *
 * 输出描述：
 * 将这个整数以字符串的形式逆序输出
 *
 * 示例1
 * 输入：
 * 1516000
 * 输出：
 * 0006151
 */
public class HJ11数字颠倒 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        //去除行尾的换行
        int available = is.available() - 1;
        char[] arr = new char[available];
        while (available-- > 0) {
            arr[available] = (char)is.read();
        }

        String result = String.valueOf(arr);
        System.out.println(result);
    }
}
