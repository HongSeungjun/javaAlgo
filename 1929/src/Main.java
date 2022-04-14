import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // 입력받을 정수의 범위
        int start, end;

        // 범위 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        // ture 면 합성수, false 면 소수
        boolean[] prime = new boolean[end+1];

        // 0 과 1은 소수가 아니다.
        prime[0] = true;
        prime[1] = true;

        // 제곱근을 사용하는 이유는  p * q = N 이 주어졌을때
        // p,q 둘중하나는 제곱근 N보다 작기 때문이다.
        for(int i = 2; i < Math.sqrt(prime.length); i++){


            // 중복을 제거한다.
            if (prime[i] == true) continue;;

            // i의 배수를 구한다.
            for(int j = i*i; j < prime.length; j = j+i){
                prime[j] = true;
            }
        }

        for (int i = start; i <= end; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }
}

