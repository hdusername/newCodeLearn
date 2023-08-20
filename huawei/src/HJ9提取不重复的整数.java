import java.io.InputStream;

/**
 * 描述
 * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是 0 。
 *
 * 数据范围：

 * 1≤n≤10^8
 *
 * 输入描述：
 * 输入一个int型整数
 *
 * 输出描述：
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 *
 * 示例1
 * 输入：
 * 9876673
 * 输出：
 * 37689
 */
public class HJ9提取不重复的整数 {

    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        //取出最后一个换行符，还有几个字节
        int available = in.available()-1;
        char[] chars = new char[available];
        //反向放入字符数组中
        while (available-- > 0) {
            chars[available] = (char) in.read();
        }
        //去重
        StringBuilder resul = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (resul.lastIndexOf(String.valueOf(chars[i])) != -1){
                continue;
            }
            resul.append(chars[i]);
        }
        System.out.println(resul.toString());
    }
}
