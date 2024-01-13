t = int(input())

for _ in range(t):
    n = int(input())
    books = list(map(int, input().split()))

    result = 0
    for i in range(n * 2):
        if books[i] % 2 != 0:
            result += 1

    if result == n:
        print("Yes")
    else:
        print("No")
