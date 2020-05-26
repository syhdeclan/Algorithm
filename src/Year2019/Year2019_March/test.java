package Year2019.Year2019_March;

public class test {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 1;
        int temp = 0;

        for (int i = 3; i < 20190324; i++) {
            temp = a + b + c;
            if (temp > 99999){
                temp %= 100000;
            }
            a = b;
            b = c;
            c = temp;
//            System.out.println(a + " " + b + " " + c + " "+ temp);
        }
        System.out.println(temp);

    }

}
