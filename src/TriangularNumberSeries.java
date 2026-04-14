// 1, 3, 6 ...
// n*(n+1)/2

void main() {
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));
    int term = 1;
    for (int i = 1; i <= n; i++) {
        term = (i * (i + 1)) / 2;
        IO.print(term + " ");
    }
}