package November4;

import java.util.Scanner;

public class Main1345 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.nextLine();
        String[] strings = new String[num];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.nextLine();
            char[] string = strings[i].toCharArray();
            check(string,0,1);
            System.out.println(count);
            count = 0;
        }

    }



    static void check(char[] string,int nowPos,int charPos){
        if (charPos == 3){
            for (int i = nowPos; i < string.length; i++) {
                if(string[i] == 'Q'){
                    count++;
                }
            }
        }
        if (charPos == 2){
            for (int i = nowPos; i < string.length; i++) {
                if(string[i] == 'A'){
                    check(string,i,charPos+1);
                }
            }
        }
        if(charPos == 1){
            for (int i = nowPos; i < string.length; i++) {
                if (string[i] == 'Q'){
                    check(string,i,charPos+1);
                }
            }
        }


    }
}
