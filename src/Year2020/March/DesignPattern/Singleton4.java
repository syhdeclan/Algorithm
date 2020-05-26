package Year2020.March.DesignPattern;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description 静态内部类
 * @create 2020-03-28 10
 **/


public class Singleton4 {

    private static class Holder{
        private static Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4(){}

    public static Singleton4 getInstance(){
        return Holder.singleton4;
    }

}
