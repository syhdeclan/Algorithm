package Year2019.Homework;

public class P76_6 {

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if ((i % 10 > i / 100) && (i / 100 > (i / 10) % 10) && ((i % 10 + i / 100 + (i / 10) % 10) == (i % 10 * i / 100 * (i / 10) % 10))) {
                System.out.println(i);
            }

        }

    }

}
