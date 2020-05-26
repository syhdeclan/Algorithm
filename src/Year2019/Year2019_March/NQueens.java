package Year2019.Year2019_March;

public class NQueens {

    static int result[] = new int[8];

    public static void main(String[] args) {

        setQueen(0,8);
    }

    public static void setQueen(int row, int len){

        if (row == len){
            print(len);
            return;
        }

        for (int i = 0; i < len; i++) {
            if (isOk(row,i)){
                result[row] = i;
                setQueen(row + 1,len);
            }
        }


    }


    public static boolean isOk(int row, int col){
        int leftup = col - 1;
        int rightup = col + 1;
        for (int i = row -1 ; i >= 0; i--) {
            if (result[i] == col){
                return false;
            }
            if (leftup >= 0){
                if (result[i] == leftup){
                    return false;
                }
            }
            if (rightup<8){
                if (result[i] == rightup){
                    return false;
                }
            }
            leftup --;
            rightup ++;
        }

        return true;
    }

    public static void print(int len){
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (result[i] != j){
                    System.out.print("* ");
                }else {
                    System.out.print("Q ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
