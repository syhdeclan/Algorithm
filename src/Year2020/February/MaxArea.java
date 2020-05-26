package Year2020.February;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-02-16 09
 **/


public class MaxArea {

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        int area;
        while(left < right) {
            area = Math.min(height[left], height[right]) * (right - left);
            max = area > max ? area : max;
            if (height[left] < height[right]){
                left ++;
            }else{
                right --;
            }
        }
        return max;

    }


}
