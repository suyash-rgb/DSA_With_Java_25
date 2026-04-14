// Difference of Difference (Double Difference)
// 1 2 4 7 11 16 22 29 37 46
//  1 2 3 4 5 6 7 8 9         -> Difference
//   1 1 1 1 1 1 1 1           -> Difference of Difference

void main() {
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));
    int currentTerm = Integer.parseInt(IO.readln("Enter the starting term: ")); // starting term
    int gap = Integer.parseInt(IO.readln("Enter the intial diff: ")); // initial difference
    int diffOfDiff = 1;

    for (int i = 1; i <= n; i++) {
        IO.print(currentTerm + " ");
        currentTerm += gap;
        gap += diffOfDiff;
    }
}