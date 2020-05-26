package Single;

import java.util.*;

public class August6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] inputList = input.toCharArray();
        List<Character> list = new ArrayList<Character>();
        inputList = sortChars(inputList,true);
        for (int i = 0; i < inputList.length; i++) {
            list.add(inputList[i]);
        }
        List<String> result = new ArrayList<String>();
        compute("",list,result);

        int[] resultInt = new int[result.size()];
        for (int i = 0; i < resultInt.length; i++) {
            resultInt[i] = Integer.parseInt(result.get(i));

        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }


    static void compute(String nowStr,List<Character> list,List<String> result){
        String useStr;
        List<Character> useList;


        if(list.size() == 1){
            nowStr = nowStr+list.get(0);
            if (!result.contains(nowStr)){
                result.add(nowStr);
            }

        }

        for (int i = 0; i < list.size(); i++) {
            useList = new ArrayList<>(list);
            useStr = nowStr;
            useStr += useList.get(i);
            useList.remove(i);
            compute(useStr, useList,result);
        }

    }


    public static char[] sortChars(char[] chs, final boolean upperFisrt) {

        Character[] srcArray = new Character[chs.length];

        char[] retArray = new char[chs.length];

        int index = 0;



        for (char ch : chs) {

            srcArray[index++] = ch;

        }



        Arrays.sort(srcArray, new Comparator<Character>() {

            public int compare(Character c1, Character c2) {

                char ch1 = Character.toUpperCase(c1);

                char ch2 = Character.toUpperCase(c2);

                if (ch1 == ch2) {

                    int tempRet = c1.charValue() - c2.charValue();

                    return upperFisrt ? tempRet : -tempRet;

                } else {

                    return ch1 - ch2;

                }

            }

        });

        index = 0;

        for (char ch : srcArray) {

            retArray[index++] = ch;

        }

        return retArray;

    }

}
