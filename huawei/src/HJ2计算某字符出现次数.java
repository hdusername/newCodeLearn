import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 描述
 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）

 数据范围：
 1≤n≤1000

 输入描述：
 第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符（保证该字符不为空格）。

 输出描述：
 输出输入字符串中含有该字符的个数。（不区分大小写字母）

 示例1
 输入：
 ABCabc
 A
 输出：
 2
 */
public class HJ2计算某字符出现次数 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars1 = br.readLine().toLowerCase().toCharArray();
        char[] chars2 = br.readLine().toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < chars1.length; i++) {
            //ASCII 值大于等于 65（对应大写字母 'A'）且小于 90（对应大写字母 'Z'）
            //字符 '0' 的ASCII值是48
            //小写字母 'a' 的值是 97，而小写字母 'z' 的值是 122
            //可以不要(chars1[i] >= 65 || chars1[i] < 90)这个判断，功能也可实现加上了感觉是多余的
            if ((chars1[i] >= 65 || chars1[i] < 90) && (chars1[i] == chars2[0])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
