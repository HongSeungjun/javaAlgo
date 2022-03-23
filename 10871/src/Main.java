import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // N : 수열의 크기, X : 비교 대상
        int N, X;

        // 공백을 입력받기 위해 StringTokenizer를 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        // N크기의 배열 선언
        int[] A = new int[N];

        // 입력을 새로 받기위해 정의
        st = new StringTokenizer(br.readLine());

        // A에 수열값을 넣어주고 X보다 착다면 출력
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
