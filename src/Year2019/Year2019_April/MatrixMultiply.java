package Year2019.Year2019_April;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class MatrixMultiply {

    public static void main(String[] args) {

        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        int m = 0, n = 0, s = 0;
        int[][] a = null, b = null;
        try {
            st.nextToken();
            m = (int) st.nval;
            st.nextToken();
            s = (int) st.nval;
            st.nextToken();
            n = (int) st.nval;

            a = new int[m][s];
            b = new int[s][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < s; j++) {
                    st.nextToken();
                    a[i][j] = (int) st.nval;
                }
            }

            for (int i = 0; i < s; i++) {
                for (int j = 0; j < n; j++) {
                    st.nextToken();
                    b[i][j] = (int) st.nval;
                }
            }
        } catch (Exception e) {

        }

        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int now = 0;
                for (int k = 0; k < s; k++) {
                    now += (a[i][k] * b[k][j]);
                }
                res[i][j] = now;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }

}
