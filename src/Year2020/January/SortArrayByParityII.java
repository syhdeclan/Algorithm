package Year2020.January;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-01-18 20
 **/


public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] A) {

        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0){
                //两个都是偶数
                if (A[i] % 2 == 0){
                    continue;
                }else {
                    //一个不是偶数
                    int p = 1;
                    while (A[i] % 2 != 0){
                        swap(i,i+p,A);
                        p++;
                    }
                }
            }else {
                if (A[i] % 2 != 0){
                    continue;
                }else {
                    //一个不是偶数
                    int p = 1;
                    while (A[i] % 2 == 0){
                        swap(i,i+p,A);
                        p++;
                    }
                }
            }
        }
        return A;
    }

    public void swap(int a, int b, int[] A){
        int i = A[a];
        A[a] = A[b];
        A[b] = i;
    }

}
