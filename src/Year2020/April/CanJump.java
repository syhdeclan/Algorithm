package Year2020.April;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-17 18
 **/


public class CanJump {

    public boolean canJump(int[] nums) {
        int far = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > far) {
                return false;
            }
            far = Math.max(far + nums[i], i);
        }
        return true;
    }

}
