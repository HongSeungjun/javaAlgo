import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int N;
        int firisDigit, secondDigit;
        int check = -1;
        int count = 0;
        int temp = 0;
        int t= 0;

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        N = Integer.parseInt(br.readLine());
        temp = N;
        while(N != check) {
            if (temp < 10) {
                firisDigit = 0;
                secondDigit = temp;
            } else {
                firisDigit = temp / 10;
                secondDigit = temp % 10;
            }
            if (firisDigit+secondDigit >= 10){
                t = (firisDigit+secondDigit)%10;
                temp= (secondDigit*10) + t;
            }else temp= (secondDigit*10) + (firisDigit+secondDigit);

            check = temp;
            count ++;
        }
        System.out.println(count);
    }
}
