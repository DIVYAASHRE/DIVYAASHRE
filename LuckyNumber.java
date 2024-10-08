import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        
        if (isLuckyNumber(number)) {
            System.out.println(number + " is a lucky number.");
        } else {
            System.out.println(number + " is not a lucky number.");
        }       
        scanner.close();
    }
    public static boolean isLuckyNumber(String number) {
        int sumOfSquares = 0;
        for (int i = 0; i < number.length(); i++) {
            if ((i + 1) % 2 == 0) {
                int digit = Character.getNumericValue(number.charAt(i));
                sumOfSquares += digit * digit; 
            }
        }
        return sumOfSquares % 9 == 0;
    }
}
