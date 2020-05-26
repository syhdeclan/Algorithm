package Year2019.Year2019_April;

import java.util.Scanner;

public class CaseChange {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        System.out.println(makeAnother(str));

    }

    public static String makeAnother(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c>=65 && c<91){
                res+=(char)(c+ 32);
            }else if (c >=97 && c<123){
                res+=(char)(c- 32);
            }
        }
        return res;
        
    }

}
