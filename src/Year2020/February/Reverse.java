package Year2020.February;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-02-12 09
 **/


public class Reverse {

    public int reverse(int x) {
        String xx = x + "";
        boolean isZheng = x >= 0 ? true : false;
        if (!isZheng) {
            xx = xx.substring(1);
        }
        StringBuilder str = new StringBuilder();
        for (int i = xx.length() - 1; i >= 0; i--) {
            str.append(xx.charAt(i));
        }
        String res = str.toString();
        int n;
        try {
            n = Integer.parseInt(res);

        }catch (NumberFormatException e){
            n = 0;
        }
        if (!isZheng) {
            n = -n;
        }
        return n;
    }

}
