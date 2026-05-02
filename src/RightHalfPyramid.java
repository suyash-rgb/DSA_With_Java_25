void main() {
    int n = Integer.parseInt(IO.readln("Enter the size of the matrix: "));
    for (int i = 0; i < n; i++) {
        for (int space = 0; space < n - i - 1; space++) {
            IO.print("  ");
        }
        for (int j = 0; j <= i; j++) {
            IO.print("* ");
        }
        IO.println();
    }
}