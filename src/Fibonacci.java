
// Fibonacci series
// a=0, b=1, c=a+b

void printFibonacci(int n) {
    int a = 0, b = 1;
    for (int i = 0; i < n; i++) {
        IO.print(a + " ");
        int sum = a + b;
        a = b;
        b = sum;
    }
}

void main() {
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));
    printFibonacci(n);
}