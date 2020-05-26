package Year2020.March.DesignPattern;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description 懒汉式1
 * @create 2020-03-28 10
 **/


public class Singleton2 {

    private Singleton2(){}

    private static Singleton2 instance = null;

    public synchronized static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

}
