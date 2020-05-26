package Year2020.March.Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-25 16
 **/



public class Test1 implements Runnable{

    class Share {
        int num = 0;
    }

//    Share share;

//    public Test1(Share share) {
//        this.share = share;
//    }

    Integer num = 0;
    ReentrantLock lock = new ReentrantLock();
    Object o = new Object();
    @Override
    public void run() {
        lock.lock();
            for (int i = 0; i < 10000; i++) {
                num++;
            }
        lock.unlock();
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        for (int i = 0; i < 10; i++) {
            new Thread(test1).start();
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(test1.num);
    }

}
