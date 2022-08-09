package baek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/1010
 */
public class Baek1010 {
    public void solution() throws Exception {
        System.setIn(new FileInputStream("src/baek/testcase/Baek1010.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            String tc = br.readLine();
            int r = Integer.parseInt(tc.split(" ")[0]);
            int n = Integer.parseInt(tc.split(" ")[1]);
            BigInteger comb = factorial(n).divide(factorial(n-r).multiply(factorial(r)));
            sb.append(comb);

            if (i != cnt-1) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    public BigInteger factorial(int i) {
        BigInteger result = new BigInteger("1");
        int n = 1;
        while (n <= i) {
            result = result.multiply(new BigInteger(String.valueOf(n)));
            n++;
        }

        return result;
    }
}
