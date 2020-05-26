package December1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String[] strs = str.split(" ");

        int[] nums = new int[strs.length];
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> list3 = new ArrayList();
        ArrayList<Integer> list4 = new ArrayList();
        ArrayList<Integer> list5 = new ArrayList();
        int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0;
        for (int i = 1; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
            if(nums[i] % 5 == 0){
                list1.add(nums[i]);
            }else if(nums[i] % 5 == 1){
                list2.add(nums[i]);
            }else if(nums[i] % 5 == 2){
                list3.add(nums[i]);
            }else if(nums[i] % 5 == 3){
                list4.add(nums[i]);
            }else if(nums[i] % 5 == 4){
                list5.add(nums[i]);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if ((int)list1.get(i) % 2 == 0){
                a1 += list1.get(i);
            }
        }
        for (int i = 0; i < list2.size(); i++) {
//            int nums2[] = (int[])list2.toArray();
        }
        for (int i = 0; i < list1.size(); i++) {
            if ((int)list1.get(i) % 2 == 0){
                a1 += list1.get(i);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if ((int)list1.get(i) % 2 == 0){
                a1 += list1.get(i);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if ((int)list1.get(i) % 2 == 0){
                a1 += list1.get(i);
            }
        }

//
//        System.out.print();
//        System.out.print();
//        System.out.print();
//        System.out.print();
//        System.out.print();


    }

}
