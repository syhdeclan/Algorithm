package Year2020.March;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-23 18
 **/


public class HammingDistance extends Object{

    public int hammingDistance(int x, int y) {

        int dis = x ^ y;
        int sum = 0;
        while (dis != 0){
            sum += dis & 1;
            dis = dis >> 1;
        }
        return sum;
    }

    public boolean hammingDistance(){
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(new HammingDistance().hammingDistance(1,4));
        String a = "abc";
        String b = new String("abc");
        System.out.println(a.equals(b));
    }

}
