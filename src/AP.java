// Arithmetic Progression
// a+(n-1)d 
// a =starting term
// d =common difference
// n =number of terms
// example - 1, 3, 5, 7, 9 here a=1, d=2, n=5
// change d = 3 then the series will be 1, 4, 7, 10, 13

void main() {

    int a = Integer.parseInt(IO.readln("Enter the starting term: "));
    int d = Integer.parseInt(IO.readln("Enter common difference: "));
    int n = Integer.parseInt(IO.readln("Enter number of terms: "));

    for (int i = 1; i <= n; i++) {
        int term = a + (i - 1) * d;
        IO.print(term + " ");
    }

}