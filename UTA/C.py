password = input()
arr = []

for _ in range(0, 10):
    arr.append(input())

result = ""
for i in range(0, len(password), 10):
    result = result + str(arr.index(password[i : i + 10]))

print(result)
