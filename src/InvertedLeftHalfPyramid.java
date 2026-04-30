void main() {
    int n = Integer.parseInt(IO.readln("Enter the size of the matrix: "));

    for (int i = 0; i < n; i++) {
        for (int j = n - i; j > 0; j--) { // j will decrease
            IO.print("* ");
        }
        IO.println();
    }

}