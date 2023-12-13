import java.util.*;

public class bnrtodec  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        
        int decimal = binaryToDecimal(binary);
        
        System.out.println("Decimal equivalent: " + decimal);
        
        sc.close();
    }
    
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        
        return decimal;
    }
}
