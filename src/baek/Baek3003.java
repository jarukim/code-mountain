package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek3003 {
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().split(" ");
            int k = Integer.parseInt(s[0]) == 1 ? 0 : 1 - Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]) == 1 ? 0 : 1 - Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]) == 2 ? 0 : 2 - Integer.parseInt(s[2]);
            int kn = Integer.parseInt(s[3]) == 2 ? 0 : 2 - Integer.parseInt(s[3]);
            int r = Integer.parseInt(s[4]) == 2 ? 0 : 2 - Integer.parseInt(s[4]);
            int p = Integer.parseInt(s[5]) == 8 ? 0 : 8 - Integer.parseInt(s[5]);

            System.out.printf("%s %s %s %s %s %s"
                    , String.valueOf(k)
                    , String.valueOf(q)
                    , String.valueOf(b)
                    , String.valueOf(kn)
                    , String.valueOf(r)
                    , String.valueOf(p)
            );
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
