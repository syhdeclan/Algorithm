package Year2019.November;

public class ChangeVariable {

    public static void main(String[] args) {

        int a = 4;
        int b = 7;
        System.out.println("a : " + a + "  b : "+ b);

        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a : " + a + "  b : "+ b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a : " + a + "  b : "+ b);

        a = b - a;
        b = b - a;
        a = a + b;
        System.out.println("a : " + a + "  b : "+ b);

    }

}
