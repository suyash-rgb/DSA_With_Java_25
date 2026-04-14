// Perfect Number - a number that is equal to the sum of proper divisors/factor
// 6 - 1, 2, 3 

void main() {
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));

    int count = 0;
    int num = 1;

    while (count < n) {
        int sum = 0;
        for (int j = 1; j <= num / 2; j++) { // mid-point theorem
            if (num % j == 0) {
                sum += j;
            }
        }
        if (sum == num && num != 0) {
            IO.print(num + " ");
            count++;
        }
        num++;
    }

}
