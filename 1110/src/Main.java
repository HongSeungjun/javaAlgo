import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int N;
        int check = 0;
        int count = 0;

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        N = Integer.parseInt(br.readLine());

        check = N;
        while(((check%10)*10+((check+check/10)%10))!=N) {

            count++;

        }
        System.out.println(count);
    }
}
