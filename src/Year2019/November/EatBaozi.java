package Year2019.November;

public class EatBaozi {

    static int count = 0;
    public static void main(String[] args) {

        eat(10);
        System.out.println(count);
    }

    public static void eat(int n){
        if (n - 1 == 0){
            count ++;
            return;
        }
        if (n - 2 == 0){
            count += 2;
            return;
        }
        eat(n - 1);
        eat(n - 2);
    }

}
