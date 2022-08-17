package baek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Baek1431 {
    public static void solution() throws Exception {
        System.setIn((new FileInputStream("src/baek/testcase/Baek1431.txt")));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());


        for (int i=0; i<cnt-1; i++) {
            for (int j=i+1; j<cnt; j++) {
                String guitar = br.readLine();


            }
        }

    }
}
