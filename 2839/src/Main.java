import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // 3의 개수 x와 5의 개수 5
        int x, y;
        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        // x+y의 핪
        int sum=0;
        // sum과 비교할 값 check
        int check = 10000;

        for ( x = 0; x < 1667; x++){
            for (y = 0; y < 1001; y++) {
                // 두수를 더한것이 n과 같을때만 sum에 넣어준다
                if ((3 * x) + (5 * y) == n) {
                    sum = x + y;
                }
            }
            // sum이 check보다 작고 0이 아닐때 check에 값을 넣어준다.
            if(sum < check && sum != 0) {check = sum;}
        }
        if( check == 10000) System.out.println("-1");
        else System.out.println(check);
    }
}
