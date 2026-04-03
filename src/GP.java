// Logic Building: Geometric Progression (GP)
// a =starting term
// r =common ratio
// n =number of terms
// formula = a*r^(n-1) // a, a*r, a*r^2, a*r^3, ... 2*3, 2*3*3,....
// example - 2, 6, 18, 54, 162 here a=2, r=3, n=5
// change r = 2 then the series will be 2, 4, 8, 16, 32

void main() {
    int a = Integer.parseInt(IO.readln("Enter starting term: "));
    int r = Integer.parseInt(IO.readln("Enter the common ratio: "));
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));

    int currentTerm = a;
    for (int i = 0; i < n; i++) {
        IO.print(currentTerm + " ");
        currentTerm = currentTerm * r;
    }

}
