package Year2019.October;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author syh
 */
public class FindMinArrowShots {


    public static void main(String[] args) {

        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};

        System.out.println(findMinArrowShots(arr));
    }

    public static int findMinArrowShots(int[][] points) {

        int max = 0;
        int count = 0;
        Set<Integer> set = new TreeSet();
        List<int[]> list = new LinkedList<>();
        for (int i = 0; i < points.length; i++) {
            list.add(points[i]);
            set.add(points[i][1]);
            if (max < points[i][1]) {
                max = points[i][1];
            }
        }

        Integer[] array = set.toArray(new Integer[0]);
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j)[1] == array[i]) {
                    list.remove(list.get(j--));
                    for (int k = 0; k < list.size(); k++) {
                        if (list.get(k)[0] < array[i] + 1 && list.get(k)[1] > array[i] - 1) {
                            list.remove(k--);
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }


    public int findMinArrowShots1(int[][] points) {
        int plen = points.length;
        if (plen < 2) {
            return plen;
        }

        // 按照起点进行排序
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        // 最少的数量
        int minCount = 1;
        // 第 1 个区间的末尾，目前线段能够达到的最远位置
        int end = points[0][1];
        // 贪心法，基于上一个箭，记录当前能够射穿的所有的区间
        for (int i = 1; i < plen; i++) {
            if (points[i][0] <= end) {
                end = Math.min(end, points[i][1]);
            } else {
                minCount++;
                end = points[i][1];
            }
        }
        return minCount;
    }


}
