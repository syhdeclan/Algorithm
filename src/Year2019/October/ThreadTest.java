package Year2019.October;

public class ThreadTest implements Runnable {

    static Boolean isNum = true;
    static int a = 0;

    public static void main(String[] args) {

        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();

    }


    @Override
    public void run() {

        while (a < 52) {
            if (isNum) {
                synchronized (isNum) {
                    isNum = false;
                    System.out.println(1 + a / 2);
                }

            } else {
                synchronized (isNum){
                    isNum = true;
                    System.out.println((char) ('a' + a / 2));
                }
            }
            a++;
        }
    }


}
