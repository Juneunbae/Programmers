'''
    문제 - 약수의 개수와 덧셈

    문제 설명
    두 정수 left와 right가 매개변수로 주어집니다. 
    left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

    제한 사항
    1 ≤ left ≤ right ≤ 1,000

    입출력 예
    left	right	result
    13	    17	    43
    24	    27	    52
'''
def solution(left, right) :
    answer = []
    for i in range(left, right + 1) :
        list = []

        for j in range(1, i + 1) :
            if i % j == 0 :
                list.append(i)
            
        if len(list) % 2 == 0 :
            answer.append(i)
        else :
            answer.append(i * -1)

    return sum(answer)

print(solution(13, 17))
