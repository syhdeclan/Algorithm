package Year2020.March.DesignPattern;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description 饿汉式
 * @create 2020-03-28 10
 **/


public class Singleton1 {

    private Singleton1(){}

    private static final Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getInstance(){
        return singleton1;
    }

}
