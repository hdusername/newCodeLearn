import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 描述
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 *
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 * 数据范围：输入的字符串长度满足
 * 1≤n≤1000
 *
 * 注意本题有多组输入
 * 输入描述：
 * 输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。
 *
 * 输出描述：
 * 得到逆序的句子
 */
public class HJ13句子逆序 {

    public static void main(String[] args) throws IOException {

        /**
         * 这种方式运行时间长，占用空间大
         */
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        String s = in.nextLine();
//
//        String[] ss = s.split(" ");
//
//        int len =ss.length;
//
//        for(int i = len-1;i>=0;i--){
//            System.out.print(ss[i]+" ");
//        }
//        System.out.println();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            char[] chars = (str + " ").toCharArray();
            int len = str.length();

            int first = 0;
            int last = len;
            char[] newchar = new char[len];
            for (int j = 0; j <= str.length(); j++) {
                char c = chars[j];
                if (c == ' ') {
                    // 需要copy的长度
                    int _len = j  - first;
                    // 开始位置
                    int despos = last - _len;
                    //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
                    //src：源数组，从这个数组复制元素。
                    //srcPos：源数组中复制的起始位置。
                    //dest：目标数组，元素将复制到这个数组。
                    //destPos：目标数组中放置复制元素的起始位置。
                    //length：要复制的元素数量。
                    System.arraycopy(chars, first, newchar, despos, _len);
                    //进入这个分支 j位置肯定是空格，+1就是从空格后的下一个字母开始截
                    first = j + 1;
                    len = len - _len - 1;//-1是把空格减去
                    last = len;
                    // copy完成后，指针变动后，赋值空
                    if (last > 0) {
                        newchar[last] = ' ';
                    }
                }
            }
            System.out.println(new String(newchar));
        }

    }
}
