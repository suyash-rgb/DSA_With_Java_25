// Armstrong Number

boolean isArmstrong(int n) {
    int sum = 0;
    int temp = n;
    
    while (temp > 0) {
        int digit = temp % 10;
        sum += (digit * digit * digit);
        temp /= 10;
    }
    
    return sum == n;
}

void main() {
    int n = Integer.parseInt(IO.readln("Enter the number of terms: "));
    int count = 0, i = 1;
    while (count < n) {
        if (isArmstrong(i)) {
            IO.print(i + " ");
            count++;
        }
        i++;
    }
}