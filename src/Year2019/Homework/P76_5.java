package Year2019.Homework;

public class P76_5 {

    public static void main(String[] args) {

        String arr = "012345";

        for (int count = 50; count < 500 / 2; count++) {
            String rabbitFeet = count * 4 + "";
            String chickenFeet = count * 2 + "";
            boolean can = true;
            for (int i = 0; i < 3; i++) {
                if (arr.indexOf(rabbitFeet.charAt(i)) == -1 || arr.indexOf(chickenFeet.charAt(i)) == -1) {
                    can = false;
                }
            }
            if (can) {
                boolean can2 = true;
                String res = rabbitFeet + chickenFeet;
                int newarr[] = new int[6];
                if (res.length() < 7) {
                    for (int i = 0; i < res.length(); i++) {
                        newarr[Integer.parseInt(res.charAt(i) + "")] = 1;
                    }
                    for (int i = 0; i < newarr.length; i++) {
                        if (newarr[i] == 0) {
                            can2 = false;
                        }
                    }
                    if (can2) {
                        System.out.println(rabbitFeet + "  " + chickenFeet);
                    }
                }
            }

        }

    }

}
