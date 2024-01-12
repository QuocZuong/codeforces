t = int(input())

for _ in range(t):
    bad = list(map(int, input().split()))
    d, p = bad
    dWins = d - 1
    if d == 1:
        dWins = 0

    pWins = p

    print(dWins, pWins)
