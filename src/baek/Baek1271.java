package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/1271
 */
public class Baek1271 {
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            BigInteger a = new BigInteger(s.split(" ")[0]);
            BigInteger b = new BigInteger(s.split(" ")[1]);

            StringBuilder sb = new StringBuilder();
            sb.append(a.divide(b));
            sb.append("\n");
            sb.append(a.mod(b));
            System.out.println(sb.toString());
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
