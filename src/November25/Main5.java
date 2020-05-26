package November25;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String numStr = reader.nextLine();
        int num = Integer.parseInt(numStr);
        for (int i = 0; i < num; i++) {
            int a = reader.nextInt();
            isRev(toBin(a));
        }
    }

    static String toBin(int i) {
        StringBuilder binary = new StringBuilder();
        if(i / 2 != 0){
            binary.append(i%2);
            i = i/2;
        }
        if(i == 1){
            binary.append(1);
        }

        return binary.reverse().toString();
    }

    static void isRev(String str) {
//        boolean is = true;
        StringBuilder strRev = new StringBuilder(str);
        if(str.equals(strRev.reverse().toString())){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

//        for (int i = 0; i < str.length() / 2.; i++) {
//            if(str.charAt(0) != str.charAt(str.length()-i-1)){
//                System.out.println("no");
//                is = false;
//                break;
//            }
//        }
//        if(is)
//            System.out.println("yes");
    }
}
