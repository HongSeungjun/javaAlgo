import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {

        boolean check[] = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = selfNumber(i);

            // 10000보다 큰 숫자는 필요없다
             if(n < 10001){
                 check[n] = true;
             }
        }

        for (int j=1; j < 10001; j++){
            if(!check[j]){
            System.out.println(j);
            }
        }
    }

    public static int selfNumber(int number) {
        int sum = number;

        // 원래의 숫자에서 각 자리 수를 구하는 부분
        while (number !=0){
            sum = sum +(number %10);
            number = number/10;
        }
        return sum;
    }
}

