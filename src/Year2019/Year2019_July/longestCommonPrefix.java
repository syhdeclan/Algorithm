package Year2019.Year2019_July;


public class longestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"",""};

        StringBuilder pre = new StringBuilder();

        int index = 0;

        if (strs.length > 1) {
            if (strs[0].length() != 0) {
                char a = strs[0].charAt(index);
                //遍历字母
                a:
                for (int i = 0; i < strs[0].length(); i++) {
                    //遍历字符串
                    for (int j = 1; j < strs.length; j++) {
                        if (strs[j].length() != 0) {
                            char b = strs[j].charAt(i);
                            if (a == b) {
                                //这个字符串对上了
                                if (j == strs.length - 1) {
                                    pre.append(b);
                                    a = strs[0].charAt(++index);
                                }
                                continue;

                            } else {
                                break a;
                            }
                        } else {
                            break a;
                        }

                    }

                }
            }
        }else if (strs.length == 1){
            pre.append(strs[0]);
        }
        System.out.println(pre.toString());


    }

}
