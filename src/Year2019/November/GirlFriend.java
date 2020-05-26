package Year2019.November;

public class GirlFriend {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = i; j <= 5-i+1; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }

    }
}
