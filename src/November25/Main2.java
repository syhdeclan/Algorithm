package November25;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            String data1 = reader.nextLine();
            int data = Integer.parseInt(data1);
            //            reader.nextLine();
            int input = 1;
            int days = input;
            int sum = 0;
            for (int i = 1; i <= data; i++) {
                sum += input;
                days -= 1;
                if(days == 0){
                    input += 1;
                    days = input;
                }
            }
            System.out.println(sum);

        }


    }
}
