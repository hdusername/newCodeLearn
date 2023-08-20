import java.io.IOException;
import java.io.InputStream;

/**
 * 描述
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
 * 输入描述：
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 *
 * 输出描述：
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 *
 * 示例1
 * 输入：
 * hello nowcoder
 * 输出：
 * 8
 * 说明：
 * 最后一个单词为nowcoder，长度为8
 */
public class HJ1字符串最后一个单词的长度 {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        int length = 0;
        char c;
        //inputStream.read()含义为读取一个字节在许多字符编码方案中，如ASCII、UTF-8等，标准的英文字母和数字字符都是使用一个字节来表示的
        //用c变量去接收读取到的字节是因为下面会用到
        while ('\n' != (c = (char)inputStream.read())) {
            length++;
            if (c == ' ') {
                length = 0;
            }

        }
        System.out.println(length);
    }
}
