t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    if k >= n:
        print(1)
    else:
        min_hours = (n + k - 1) // k
        print(min_hours)
