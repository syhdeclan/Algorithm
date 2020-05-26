package Year2020.March;

import java.util.*;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-27 17
 **/


public class HasGroupsSizeX {

//    public boolean hasGroupsSizeX(int[] deck) {
//        if (deck.length == 0 || deck.length == 1) {
//            return false;
//        }
//        Map<Integer, Integer> count = new HashMap<>();
//        //先全部存到Map里面
//        for (int i = 0; i < deck.length; i++) {
//            if (count.containsKey(deck[i])) {
//                count.put(deck[i], count.get(deck[i]) + 1);
//            } else {
//                count.put(deck[i], 1);
//            }
//        }
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < deck.length; i++) {
//            int now = count.get(deck[i]);
//            if (now < min) {
//                min = now;
//            }
//        }
//        Set<Integer> integers = count.keySet();
//
//        Iterator<Integer> iterator = integers.iterator();
//        int a = count.get(iterator.next());
//        if (iterator.hasNext()) {
//            int b = count.get(iterator.next());
//            int g = gcd(a, b);
//            if (g <= 1) {
//                return false;
//            }
//            while (iterator.hasNext()) {
//                int one = count.get(iterator.next());
//                g = gcd(g, one);
//                if (g <= 1) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    private int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }

    //别人的算法 真的牛批
    public boolean hasGroupsSizeX(int[] deck) {
        // 计数
        int[] counter = new int[10000];
        for (int num: deck) {
            counter[num]++;
        }
        // 求gcd
        int x = 0;
        for(int cnt: counter) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >= 2;
    }

    // 辗转相除法
    private int gcd (int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(new HasGroupsSizeX().hasGroupsSizeX(new int[]{1, 1, 1, 1, 1, 0, 0, 0}));
    }

}
