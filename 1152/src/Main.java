import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        int count = 0;
        // 문자열 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();

        // 공백단위로 문자열을 반환한다.
        String[] t = sentence.split(" ");

        // 문장 처음부분에 공백이 들어간만큼 count 해준다.
       for (int i = 0; i < t.length; i++){
           //System.out.println(t[i]);
           if(t[i] == ""){
               count++;
           }
       }
        System.out.println((t.length-count));

    }
}
