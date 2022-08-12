package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek1110 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String init = br.readLine();
        String strNum = init;
        int cnt = 0;

        do {
            int n = Integer.parseInt(strNum);
            if (n < 10) {
                strNum = "0"+String.valueOf(n);
            }

            int first = Integer.parseInt(String.valueOf(strNum.charAt(0)));
            int second = Integer.parseInt(String.valueOf(strNum.charAt(1)));
            int result = first+second;

            cnt++;
            String strResult = String.valueOf(result);
            strNum = String.valueOf(second);
            if (strResult.length() > 1) {
                strNum = strNum + strResult.charAt(1);
            } else {
                strNum = strNum + strResult;
            }
        } while (!init.equals(String.valueOf(strNum)));

        System.out.println(cnt);
    }
}
