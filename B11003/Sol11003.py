'''
    문제 : 슬라이딩 윈도우

    문제 설명
    N개의 수 A1, A2, ..., AN과 L이 주어진다.

    Di = Ai-L+1 ~ Ai 중의 최솟값이라고 할 때, D에 저장된 수를 출력하는 프로그램을 작성하시오. 
    이때, i ≤ 0 인 Ai는 무시하고 D를 구해야 한다.

    입력
    첫째 줄에 N과 L이 주어진다. (1 ≤ L ≤ N ≤ 5,000,000)

    둘째 줄에는 N개의 수 Ai가 주어진다. (-109 ≤ Ai ≤ 109)

    출력
    첫째 줄에 Di를 공백으로 구분하여 순서대로 출력한다.

    TEST CASE
    12 3
    1 5 2 3 6 2 3 7 3 5 2 6
    -> 1 1 1 2 2 2 2 2 3 3 2 2
'''

import sys
from collections import deque

input = sys.stdin.readline

N, L = map(int, input().split())
my_deque = deque()

now = list(map(int, input().split()))

for i in range(N):
    # 1. 나보다 큰 데이터 삭제하기
    while my_deque and my_deque[-1][0] > now[i] :
        my_deque.pop()
    my_deque.append((now[i], i))

    # 2. 슬라이딩 윈도우 벗어난 데이터 삭제하기

    # 윈도우 범위를 벗어나면
    if my_deque[0][1] <= i - L :
        my_deque.popleft()
    
    print(my_deque[0][0], end=' ')
