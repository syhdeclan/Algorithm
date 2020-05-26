package Year2019.Sept22;

public class MinDeletionSize {

    public static void main(String[] args) {

        String[] a = {"zyx", "wvu", "tsr"};
//        System.out.println(minDeletionSize(a));
        System.out.println(java.util.UUID.randomUUID().toString());
    }

    static int minDeletionSize(String[] A) {
        int depth = A.length;
        int width = A[0].length();
        int res = 0;
        for (int i = 0 ;i < width; i++) {
            boolean is = false;
            for (int j = 1 ;j < depth; j++) {
                if (A[j].charAt(i) < A[j-1].charAt(i)) {
                    is = true;
                }
            }
            if(is){
                res += 1;
            }

        }

        return res;
    }

}
