// Twin Prime - Pairs
// n1 n2  n2-n1=2
// 3, 5

boolean isPrime(int n) {
    if (n <= 1)
        return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}

void main() {
    int limit = Integer.parseInt(IO.readln("Enter the no of pairs that you want: "));

    int count = 0;
    int num = 3;

    while (count < limit) {
        if (isPrime(num) && isPrime(num + 2)) {
            count++;
            IO.print("(" + num + ", " + (num + 2) + "), ");
        }
        num++; // you can use num+=2 here to save half iteration O(n/2) instead of O(n)
               // which is not much but it is still an optimized version
    }
}