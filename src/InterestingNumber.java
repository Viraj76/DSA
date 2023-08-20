public class InterestingNumber {

    public static boolean isAlternatingSequence(String digits) {
        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            if (i % 2 == 0 && digit % 2 == 0) {
                return false;
            }
            if (i % 2 == 1 && digit % 2 == 1) {
                return false;
            }
        }
        return true;
    }

    public static int kthInterestingNumber(int K) {
        int count = 0;
        int num = 1;

        while (count < K) {
            String digits = Integer.toString(num);
            if (digits.length() % 2 == 1 && isAlternatingSequence(digits)) {
                count++;
                if (count == K) {
                    return num;
                }
            }
            num++;
        }

        return -1; // Kth interesting number not found (should not happen in practice)
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();
        int result = kthInterestingNumber(K);
        System.out.println("The " + K + "th smallest interesting number is: " + result);
    }
}
