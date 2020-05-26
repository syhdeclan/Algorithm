package Year2019.Year2019_April;

import java.util.LinkedList;

public class Convert {
    public String convert(String s, int numRows) {
        LinkedList<Character>[] lists = new LinkedList[numRows];
        for (int i = 0; i < numRows; i++) {
            lists[i] = new LinkedList<>();
        }
        boolean flag = true;
        int count = 0,len = s.length();
        for (int i = 0; i < len; i++) {
            if (flag){
                if (count >= numRows - 1) {
                    flag = false;
                    lists[numRows-1].add(s.charAt(i));
                    count--;
                    continue;
                }
                lists[count++].add(s.charAt(i));
            }else {
                if (count <= 0){
                    flag = true;
                    lists[0].add(s.charAt(i));
                    count ++;
                    continue;
                }
                lists[count--].add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int leng = lists[i].size();
            for (int j = 0; j < leng; j++) {
                sb.append(lists[i].get(j));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(new Convert().convert("AB",1));
    }
}
