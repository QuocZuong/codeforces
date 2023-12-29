t = int(input())

for _ in range(t):
    ex = input()

    first, second = map(int, ex.split("+"))

    result = first + second
    print(result)
