package Year2019.November;

public class SuShu {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(findSuShu(arr,4));
    }

    public static int findSuShu(int[] arr, int n){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkIsSuShu(arr[i])){
                num ++;
            }
            if (num == n){
                return arr[i];
            }
        }
        return num;

    }

    public static boolean checkIsSuShu(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


}
