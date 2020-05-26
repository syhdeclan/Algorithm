package Year2019.October;

public class CarPooling {

    public static void main(String[] args) {

        int[][] arr = {{4,5,6},{6,4,7},{4,3,5},{2,3,5}};
        System.out.println(carPooling(arr,13));

    }

    public static boolean carPooling(int[][] trips, int capacity) {
        int distance = 0;
        boolean can = true;
        int cap = capacity;
        for (int i = 0; i < trips.length; i++) {
            if (trips[i][2] > distance){
                distance = trips[i][2];
            }
        }
        for (int i = 0; i < distance; i++) {
            for (int j = 0; j < trips.length; j++) {
                int peopleCount = trips[j][0];
                int startPos = trips[j][1];
                int endPos = trips[j][2];

                //先下车
                if (endPos == i){
                    cap += peopleCount;
                }

                //后上车
                if (startPos == i){
                    cap -= peopleCount;

                }
            }
            if (cap < 0){
                return false;
            }
        }

        return true;
    }

}
