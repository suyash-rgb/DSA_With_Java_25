// Boston Numbers
// 1. Composite Number
// 2. sum of digits = sum of digits of prime factors
// EX 22 2+2 =4 || 2 + 11=> 2+1+1 =4
int sumofDigits(int n) {
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

boolean isPrime(int n) {
    if (n <= 1)
        return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}

boolean isBoston(int n) {
    if (isPrime(n))
        return false;
    int originalSum = sumofDigits(n);
    int factorSum = 0;
    int temp = n;
    for (int i = 2; i <= temp; i++) {
        while (temp % i == 0) {
            factorSum += sumofDigits(i);
            temp /= i;
        }
    }
    return (factorSum == originalSum);
}

void main() {
    int limit = Integer.parseInt(IO.readln("Enter the number of terms: "));
    int count = 0;
    int num = 4; // smallest composite number
    while (count < limit) {
        if (isBoston(num)) {
            count++;
            IO.print(num + " ");
        }
        num++;
    }
}