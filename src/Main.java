import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 2;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int source = nums[i];
            int abs = target - source;

            if(map.get(abs)!=null){
                System.out.println(new int[]{i,map.get(abs)});
            }else {
                map.put(source, i);
            }

        }
    }

    public static void leetCode3(String str){

        Set<Character> table = new HashSet();

        int len = str.length();

        int rk = -1, ans = 0;

        for(int i = 0; i<len; i++){
            if(i != 0){
                table.remove(str.charAt(i));
            }
            while(rk+1<len && !table.contains(str.charAt(rk+1))){
                rk++;
                table.add(str.charAt(rk+1 ));
            }
            ans = Math.max(ans, rk-i+1);
        }
    }
}