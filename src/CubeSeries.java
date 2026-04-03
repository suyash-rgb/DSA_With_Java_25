// Cube axaxa
// 1, 2, 3, 4, .....

int Cube(int n) {
    int result = n * n * n;
    return result;
}

void main() {

    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));
    for (int i = 1; i <= n; i++) {
        IO.print(Cube(i) + " ");
    }
}