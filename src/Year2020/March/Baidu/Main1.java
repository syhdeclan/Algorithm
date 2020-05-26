package Year2020.March.Baidu;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        int n = reader.nextInt();
//        System.out.println(n * ( n - 1) - 1);
        System.out.println(gcd(12,9));

    }

    static int gcd(int a , int b){
        if (a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

}
