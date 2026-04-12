// Prime Number - divisible by 1 or itself only
// Ex - 2, 3, 5, 7, ....

// 1. Mid-point Theorem
// 2. Squre Root 

boolean midPointTheorem(int n) {
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

boolean squareRoot(int n) {
    for (int i = 2; (i * i) <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

void main() {
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));
    int count = 0, i = 2;
    while (count < n) {
        // if (midPointTheorem(i)) {
        // IO.print(i + " ");
        // count++;
        // i++;
        // }
        if (squareRoot(i)) {
            IO.print(i + " ");
            count++;
            i++;
        } else {
            i++;
        }
    }
}