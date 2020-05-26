package Year2019.Year2019_April;

public class DivisorGame {
    public boolean divisorGame(int N){

        for (int i = 1; i < N; i++) {
            if (tryOne(N,i,true)){
                return true;
            }
        }

        return false;
    }

    public boolean tryOne(int N, int x, boolean isAlice){
        if (N == 2){
            if (isAlice){
                return true;
            }else {
                return false;
            }
        }
        for (int i = 1; i < N; i++) {
            return tryOne(N-x,i,!isAlice);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new DivisorGame().divisorGame(2));
    }
}
