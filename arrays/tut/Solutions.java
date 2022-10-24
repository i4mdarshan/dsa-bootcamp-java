
import java.util.*;
public class Solutions {
    public static void main(String[] args) {
        int k =34;
        int[] num = {9,9,9,9};

        int N = num.length-1;
        int cur = k;
        ArrayList<Integer> ans = new ArrayList<>();

        int i = N;
        while (i >= 0 || cur > 0) {
          if (i >= 0)cur += num[i];
          ans.add(cur % 10);
          cur /= 10;
          i--;
        }

        Collections.reverse(ans);

        System.out.println(ans);
    }

}
