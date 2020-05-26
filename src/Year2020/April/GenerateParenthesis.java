package Year2020.April;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-03 00
 **/


public class GenerateParenthesis {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(n,"",0,0,0);
        return res;
    }

    private void generate(int n, String str, int left, int right, int now) {
        if ((n * 2) == now) {
            return;
        }
        if (left >= right && left < n){
            generate(n,str + "(",left + 1, right, now + 1);
            generate(n,str + ")",left, right + 1, now + 1);
        }else if(left >= right && right <= n){
            generate(n,str + ")",left, right + 1, now + 1);
        }
    }


}
