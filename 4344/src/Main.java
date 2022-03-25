import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    * BufferedReader를 사용할때 예외처리하는 이유는
    * inputstream = null인경우를 방지하기 위해서다.
    * 이때 null은 입력 자체를 인식 못하는것을 뜻한다.
    * */
    public static void main(String[] args) throws IOException {

        int numTestCase; // 테스트케이스의 수
        int numStudent; // 학생의 수
        int sum = 0; // 학생 점수들의 핪
        int avg = 0; // 학생 점수들의 평균
        int count; // 학생의 점수들중 평균보다 높은 값 개수
        double percent;
        double[] result;

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        numTestCase = Integer.parseInt(st.nextToken());

        result = new double[numTestCase];
        for(int i = 0; i < numTestCase; i++){
            st = new StringTokenizer(br.readLine());
            numStudent = Integer.parseInt(st.nextToken());
            int[] grade = new int[numStudent];
            for(int j = 0; j < numStudent; j++){
                grade[j] = Integer.parseInt(st.nextToken());
                sum += grade[j];// 점수의 핪
            }
//            System.out.println("sum = " + sum);
            avg = sum / numStudent; // 평균
            sum = 0;
//            System.out.println("avg = " + avg);
            count = 0;
            for(int z = 0; z < numStudent; z++){
                if(grade[z] > avg){
                    count ++;
                }
            }
//            System.out.println("count = " + count);
            percent = (double)count / (double)numStudent*100; // 소수점을 표현하기 위한 형변환
            result[i] = percent;
//            System.out.println(String.format("%.3f",percent)+"%");
        }
        for(int i = 0; i < numTestCase; i++){
            // String.format을 이용한 소수 세번째짜리 반올림
             System.out.println(String.format("%.3f",result[i])+"%");
        }
    }
}
