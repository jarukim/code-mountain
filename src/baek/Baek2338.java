package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baek2338 {
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BigInteger a = new BigInteger(br.readLine());
            BigInteger b = new BigInteger(br.readLine());

            StringBuilder sb = new StringBuilder();
            sb.append(a.add(b));
            sb.append("\n");
            sb.append(a.subtract(b));
            sb.append("\n");
            sb.append(a.multiply(b));

            System.out.println(sb.toString());
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
