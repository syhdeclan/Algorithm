package Year2019.Year2019_March;

import java.util.Scanner;

//基础练习 数列特征
public class Main1 {

    public static void main(String[] args) {
//        long start=System.currentTimeMillis();   //获取开始时间
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.nextLine();
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE,sum = 0;
        String nums = reader.nextLine();
        String[] numArray = nums.split(" ");
        for (int i = 0; i < num; i++) {
            int now = Integer.parseInt(numArray[i]);
            if(now > max){
                max = now;
            }
            if (now < min){
                min = now;
            }
            sum += now;
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);


//        long end=System.currentTimeMillis(); //获取结束时间
//        System.out.println("程序运行时间： "+(end-start)+"ms");
    }

}
