package baek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Baek25206 {
    public static void solution() throws Exception {
        System.setIn(new FileInputStream("src/baek/testcase/Baek25206.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float total = 0;
        float creditTotal = 0;
        for (int i=0; i<20;i++) {
            String s = br.readLine();
            String[] data = s.split(" ");
            //String subj = data[0];
            String credit = data[1];
            String grade = data[2];

            if ("P".equals(grade)) {
                continue;
            }

            float gradeScore = 0;
            switch (grade) {
                case "A+": gradeScore = 4.5f; break;
                case "A0": gradeScore = 4.0f; break;
                case "B+": gradeScore = 3.5f; break;
                case "B0": gradeScore = 3.0f; break;
                case "C+": gradeScore = 2.5f; break;
                case "C0": gradeScore = 2.0f; break;
                case "D+": gradeScore = 1.5f; break;
                case "D0": gradeScore = 1.0f; break;
                default: gradeScore = 0;
            }
            creditTotal += Float.parseFloat(credit);
            total += Float.parseFloat(credit) * gradeScore;
        }

        System.out.println(String.format("%.6f", total / creditTotal));
    }
}
