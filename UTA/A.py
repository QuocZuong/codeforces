t = int(input())

for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    result = "YES"
    for i in range(0, len(arr) - 1):
        if abs(arr[i] - arr[i + 1]) > 1:
            result = "NO"
            break
    print(result)
