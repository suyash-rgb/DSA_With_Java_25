void main() {
    int n = Integer.parseInt(IO.readln("Enter the size of the matrix: "));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                IO.print("* ");
            } else {
                IO.print("  ");
            }
        }
        IO.println();
    }

}