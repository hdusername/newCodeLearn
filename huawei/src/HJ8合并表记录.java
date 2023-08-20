import java.io.*;

/**
 * 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
 *
 *
 * 提示:
 * 0 <= index <= 11111111
 * 1 <= value <= 100000
 *
 * 输入描述：
 * 先输入键值对的个数n（1 <= n <= 500）
 * 接下来n行每行输入成对的index和value值，以空格隔开
 *
 * 输出描述：
 * 输出合并后的键值对（多行）
 *
 * 示例1
 * 输入：
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4

 * 输出：
 * 0 3
 * 1 2
 * 3 4
 */
public class HJ8合并表记录 {


    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();      // 分隔符
        int n = (int) st.nval;   // 强转
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            st.nextToken();
            int key = (int) st.nval;
            st.nextToken();
            int value = (int) st.nval;
            arr[key] = arr[key] + value;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != 0){
                sb.append(i).append(" ").append(arr[i]).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
    /**
     * 输出
     * Word: Hello
     * Number: 123.0
     * Word: World
     * Number: 456.0
     * @param args
     */
    public static void test(String[] args) {
        String input = "Hello 123 World 456";
        StringReader reader = new StringReader(input);
        StreamTokenizer st = new StreamTokenizer(reader);

        try {
            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                if (st.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println("Word: " + st.sval);
                } else if (st.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println("Number: " + st.nval);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
