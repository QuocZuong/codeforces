# Number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    ex = input()

    num1, num2 = map(int, ex.split("+"))

    result = num1 + num2
    print(result)
