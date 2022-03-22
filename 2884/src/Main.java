import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 시간과 분 0 ≤ H ≤ 23, 0 ≤ M ≤ 59
        int H, M;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 시간 계산, 경계값인 00:00 시에 대한 조건문 포함
        M -= 45;
        if (M < 0) {
            H -= 1;
            M += 60;
            if (H < 0) {
                H += 24;
            }
        }
        System.out.println(H + " " + M);
    }
}
