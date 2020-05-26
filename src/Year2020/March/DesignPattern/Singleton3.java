package Year2020.March.DesignPattern;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description DCL
 * @create 2020-03-28 10
 **/


public class Singleton3 {

    private Singleton3(){}

    private static volatile Singleton3 singleton3 = null;

    public static Singleton3 getInstance(){
        if (singleton3 == null){
            synchronized (Singleton3.class){
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }

}
