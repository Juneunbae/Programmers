/**
    문제 : 명함 지갑

    문제 설명
    명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
    다양한 크기의 명함들이 있고, 명함 지갑은 가로, 세로 크기가 주어지는데, 이를 만족하는 가장 작은 지갑을 만들려고 합니다.
    
    예를 들어, 명함의 가로 길이가 60, 세로 길이가 50인 명함이 있다면, 지갑의 크기는 가로 길이가 60, 세로 길이가 50이어야 합니다.
    이때, 명함 지갑의 크기는 60 x 50 = 3000입니다.

    명함들의 가로, 세로 길이가 담긴 2차원 배열 sizes가 매개변수로 주어집니다.
    sizes에 있는 명함들 중에서, 명함 지갑을 만들 때 지갑의 크기가 최소가 되도록 지갑을 만들 때,

    지갑의 가로 길이와 세로 길이를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    sizes의 길이는 1 이상 10^5 이하입니다.
    sizes의 원소는 [w, h] 형식입니다.
    w는 명함의 가로 길이를 나타냅니다.
    h는 명함의 세로 길이를 나타냅니다.
    w와 h는 1 이상 1,000 이하인 자연수입니다.

    입출력 예
    sizes	                                        result
    [[60, 50], [30, 70], [60, 30], [80, 40]]	    4000
    [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
    [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
**/

package 최소직사각형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sol86491 {
    public int solution(int[][] sizes) {
        int answer = 0;

        ArrayList<Integer> maxList = new ArrayList<>();
        ArrayList<Integer> minList = new ArrayList<>();
        
        for (int[] size : sizes) {
            maxList.add(Arrays.stream(size).max().getAsInt());
            minList.add(Arrays.stream(size).min().getAsInt());
        }
        
        answer = Collections.max(maxList) * Collections.max(minList);

        return answer;
    }

    public static void main(String[] args) {
        Sol86491 sol86491 = new Sol86491();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(sol86491.solution(sizes));
    }
}
