package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/25304
 */
public class Baek25304 {
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int total = Integer.parseInt(br.readLine());
            int cnt = Integer.parseInt(br.readLine());

            int cost = 0;
            for (int i = 0; i < cnt; i++) {
                String item = br.readLine();
                int price = Integer.parseInt(item.split(" ")[0]);
                int itemCnt = Integer.parseInt(item.split(" ")[1]);
                cost += price * itemCnt;
            }

            if (total == cost) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
