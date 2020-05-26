package Year2019.Year2019_March;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class QueueOpe {

    public static void main(String[] args) {

        Queue<Integer> a = new LinkedList<>();
        Scanner reader = new Scanner(System.in);
        int now = 0, num = reader.nextInt();
        reader.nextLine();
        aaa:while (now < num) {
            int ope = reader.nextInt();
            switch (ope){
                case 1:
                    int target = reader.nextInt();
                    a.add(target);
                    break;

                case 2:
                    try {
                        int pop = a.remove();
                        System.out.println(pop);
                    }catch (NoSuchElementException e){
                        System.out.println("no");
                        break aaa;
                    }
                    break;

                case 3:
                    int size = a.size();
                    System.out.println(size);
                    break;

                    default:
                        break;
            }

            ++now;
        }


    }

}
