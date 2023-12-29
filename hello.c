#include <stdio.h>

int gcd(int a, int b)
{
    if (b == 0)
    {
        return a;
    }
    return gcd(b, a % b);
}
int main()
{
    int a = 2;
    // 4(5)    x(4)     4(3)     3(4)      x(3)
    printf("%d %d %d %d %d\n", a++, ++a, a--, a++, ++a);
    // return 0;                   4   5   3    4     5
}
