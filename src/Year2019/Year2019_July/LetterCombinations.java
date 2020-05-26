package Year2019.Year2019_July;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {


    public static void main(String[] args) {
        System.out.println(new LetterCombinations().letterCombinations(""));
    }

    static List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        char[] two = {'a', 'b', 'c'}, three = {'d', 'e', 'f'}, four = {'g', 'h', 'i'}, five = {'j', 'k', 'l'}, six = {'m', 'n', 'o'}, seven = {'p', 'q', 'r', 's'}, eight = {'t', 'u', 'v'}, nine = {'w', 'x', 'y', 'z'};

        char[][] numList = {two, three, four, five, six, seven, eight, nine};

        if (digits.equals("")){

            return result;

        }else{

            nextNum(numList, digits, 0, "");

            return result;
        }

    }

    public static void nextNum(char[][] numList, String input, int index, String beforeString) {

        int num = Integer.parseInt(input.charAt(index++)+"") - 2;

        if (num >= 0 && num < 8) {

            char[] nowChar = numList[num];

            StringBuilder[] builders = new StringBuilder[nowChar.length];

            for (int i = 0; i < nowChar.length; i++) {

                builders[i] = new StringBuilder();

                builders[i].append(beforeString);

                builders[i].append(nowChar[i]);

                if (index == input.length()) {

                    result.add(builders[i].toString());

                } else {

                    nextNum(numList, input, index, builders[i].toString());

                }


            }


        }

    }
}
