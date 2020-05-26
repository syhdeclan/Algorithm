package Year2019.Year2019_April;


import java.util.LinkedList;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        int len = 1,count;
        LinkedList<Character> list = new LinkedList<>();
        if(!s.equals("")) {
            for (int i = 0; i < s.length() - len; i++) {
                list.clear();
                count = 0;
                while ((i + count) < s.length() && !list.contains(s.charAt(i + count))) {
                    list.add(s.charAt(i + count));
                    ++count;
                    if (count > len) {
                        len = count;
                    }
                }
            }
            return len;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("bbb"));
    }
}
