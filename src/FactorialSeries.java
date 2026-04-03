// Facotrial of a number, n = n(n-1)(n-2)......
// ex - 5! = 5x4x3x2x1

int factorial(int num) {
    int result = 1;
    while (num > 1) {
        result = result * num;
        num--;
    }
    return result;
}

void main() {
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));
    for (int i = 1; i <= n; i++) {
        IO.print(factorial(i) + " ");
    }
}
