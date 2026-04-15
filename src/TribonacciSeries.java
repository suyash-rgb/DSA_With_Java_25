// Tribonacci -3 term sum

void main() {
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));

    int a = 0;
    int b = 0;
    int c = 1;
    for (int i = 1; i < n; i++) {
        IO.print(a + " ");
        int next = a + b + c;
        a = b;
        b = c;
        c = next;
    }

}