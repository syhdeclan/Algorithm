package Year2020.May;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-05-03 23
 **/


public class ReplaceSpace {

    public String replaceSpace(String s) {

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                sb.append("%20");
            }else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

}
