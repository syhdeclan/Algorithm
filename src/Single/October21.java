package Single;

import java.util.Scanner;

public class October21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
//        System.out.println(goOn("",num,0));
        String str = "A";
        char m = (char)(65);
        for (int i = 2; i <= num; i++) {
            str = str + (++m)+ str;

        }
        System.out.println(str);
    }

//    static String goOn(String str, int num, int now){
//        String temp = str;
//        if (now == num){
//            return str;
//        }else{
//            char c = (char) ('A'+now);
//            temp += c;
//            temp += str;
//            now+=1;
//            return goOn(temp, num, now);
//        }
//    }
}
