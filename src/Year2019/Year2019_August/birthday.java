package Year2019.Year2019_August;

import java.util.HashSet;
import java.util.Set;

public class birthday {

    public static void main(String[] args) {

        int count = 0;
        int time = 50;

        for (int j = 0; j < 1000000; j++) {

            Set<Double> set = new HashSet<>();

            for (int i = 0; i < time; i++) {

                set.add(Math.floor(Math.random()*365+ 1));

            }

            if (set.size() == time)
                ++count;

        }

        System.out.println(count);

    }

}
