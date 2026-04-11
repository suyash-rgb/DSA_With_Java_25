// Alternate Sign Series
// 1, -2, 3, -4, 5, -6 ..... odd numbers are positive and even number are negative

void main() {

    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));

    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            int temp = 0 - i;
            IO.print(temp + " ");
        } else {
            IO.print(i + " ");
        }
    }

}