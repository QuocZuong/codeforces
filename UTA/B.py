t = int(input())

for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))

    arr.sort()

    temp = arr[0]
    result = 0
    for i in range(n):
        result = result + abs(arr[i] - temp)
    print(result)
