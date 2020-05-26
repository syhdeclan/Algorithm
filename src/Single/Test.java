package Single;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean ok = false;
        int x1 = 0, y1 = 0,m=0,count=0;
        ArrayList list = new ArrayList();
//        list.remove
        while(!ok){
            if(x1==x&&y1==y){
                ok = true;
                break;
            }
            m++;
            if(m%2==1){//奇数步
                for(int i = 0; i<m; i++){
                    if(x1==x&&y1==y){
                        ok = true;
                        break;
                    }
                    x1-=1;
                    count++;
                }
                for(int i = 0;i<m;i++){
                    if(x1==x&&y1==y){
                        ok = true;
                        break;
                    }
                    y1+=1;
                    count++;
                }
            }else if(m%2==0){//偶数步
                for(int i = 0; i<m; i++){
                    if(x1==x&&y1==y){
                        ok = true;
                        break;
                    }
                    x1+=1;
                    count++;
                }
                for(int i = 0;i<m;i++){
                    if(x1==x&&y1==y){
                        ok = true;
                        break;
                    }
                    y1-=1;
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}
