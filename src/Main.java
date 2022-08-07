/**
 * 초대 이벤트를 기획함.
 * long[][]인 invitationPairs가 주어지고 0번지는 초대자, 1번지는 초대된 사람의 리스트이며 초대 이벤트가 발생한 순서대로 들어가 있음.
 * 초대자 마다 점수를 계산하여 가장 점수가 높은 세 사람을 배열로 표시.
 * 점수 = 초대한 사람 수 * 10 + 초대된 사람이 초대한 사람 수 * 3 + 초대된 사람이 초대한 사람의 초대한 수 * 1
 * */

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Integer> invited = new ArrayList<Integer>();

    public static void main(String[] args) {
        //long[][] invitationPairs = {{1,2}, {2,3}, {2,4}, {2,5}, {5,6}, {5,7}, {6,8}, {2,9}};
        //long[][] invitationPairs = {{1,2}, {3,4}};
        long[][] invitationPairs = {{1,2}, {1,3}, {3,4}, {4,5}, {4,6}, {4,7}};
        solution(invitationPairs);
    }

    public static void solution(long[][] invitationPairs) {
        long[] answer = {};

        List<long[]> scoreList = new ArrayList<long[]>();

        for (int i=0; i<invitationPairs.length; i++) {
            long target = invitationPairs[i][0];
            int score = calc(invitationPairs, target, 0, 0);
            long[] scoreSet = {target, score};

            boolean flag = true;
            for (long[] l : scoreList) {
                if (l[0] == target) {
                    flag = false;
                }
            }

            if (flag) {
                scoreList.add(scoreSet);
            }
        }

        long[] tmp;
        for (int i=0; i<scoreList.size(); i++) {
            for (int j=i+1; j<scoreList.size(); j++) {

            }
        }

        System.out.println(scoreList);
    }

    public static int calc(long[][] invitationPairs, long target, int score, int depth) {
        int baseScore = 0;
        if (depth == 0) {
            baseScore = 10;
        } else if (depth == 1) {
            baseScore = 3;
        } else if (depth == 2) {
            baseScore = 1;
        } else {
            return score;
        }

        int inviteCnt = 0;
        for (int i=0; i<invitationPairs.length; i++) {
            if (invitationPairs[i][0] == target) {
                inviteCnt++;
            }
        }

        if (inviteCnt > 0) {
            score += inviteCnt*baseScore;
        }

        return calc(invitationPairs, ++target, score, ++depth);
    }
}