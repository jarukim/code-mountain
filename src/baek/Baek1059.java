package baek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Baek1059 {
    public static void solution() throws Exception {
        System.setIn(new FileInputStream("src/baek/testcase/Baek1059.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        if (s.length == 1) {
            System.out.println("0");
            return;
        }

        // 오름차순 정렬
        String tmp;
        for (int i=0; i<cnt-1; i++) {
            // 정렬 도중 같은 숫자가 있다면 0 출력
            if (n == Integer.parseInt(s[i])) {
                System.out.println("0");
                return;
            }

            for (int j=i+1; j<cnt; j++) {
                if (Integer.parseInt(s[i]) > Integer.parseInt(s[j])) {
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }

        int start = 0;
        int end = 0;
        for (int i=0; i<cnt-1; i++) {
            if (n < Integer.parseInt(s[i])) {
                if (i == 0) {
                    System.out.println("0");
                    return;
                }
                start = Integer.parseInt(s[i-1])+1;
                end = Integer.parseInt(s[i])-1;
                break;
            }
        }

//        for (int i=start; i<=end; i++) {
//            for (int j=i+1; j<=end; j++) {
//                if (i <= n && n <= j) {
//                    answer++;
//                }
//            }
//        }

        System.out.println(answer);
    }
}
