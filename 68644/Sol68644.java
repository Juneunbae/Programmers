/**
    문제 - 두 개 뽑아서 더하기

    문제설명
    정수 배열 numbers가 주어집니다. 
    numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

    제한사항
    numbers의 길이는 2 이상 100 이하입니다.
    numbers의 모든 수는 0 이상 100 이하입니다.

    입출력 예
    numbers	        result
    [2,1,3,4,1]	    [2,3,4,5,6,7]
    [5,0,2,7]	    [2,5,7,9,12]
**/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Sol68644 {
    public ArrayList<Integer> solution(int[] numbers) {
        HashSet<Integer> answerSet = new HashSet<>();
    
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) { // j < numbers.length 로 수정
                if (i != j) {
                    answerSet.add(numbers[i] + numbers[j]); // numbers 배열의 요소 합 추가   
                }
            }
        }

        ArrayList<Integer> answer = new ArrayList<>(answerSet);
        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Sol68644 sol = new Sol68644();
        int[] numbers = {2, 1, 3, 4 ,1};
        System.out.println(sol.solution(numbers));
    }
}
