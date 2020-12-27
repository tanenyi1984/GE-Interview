import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter an number: ");
        String numberStr = input.next();
        System.out.println("Number entered " + numberStr);

        try {
            int number = Integer.parseInt(numberStr);
            System.out.println("Result " + intShuffle(number));
        } catch (Exception e) {
            System.out.println("Error in convert value into integer!!" + e.getMessage());
        }
    }

    private static int intShuffle(int value) {
        if(value < 0) {
            System.out.println("Only positive number allowed!!");
            return value;
        }
        String valueStr = String.valueOf(value);
        String tempValue = "";
        int i = 0;
        int lastIdx;
        //return value if length less than or equal to 2, no shuffle require
        if(valueStr.length() <= 2) {
            return value;
        } else {
            lastIdx = valueStr.length() - 1;
        }

        char[] valueInArray = valueStr.toCharArray();
        while(lastIdx >= i) {
            tempValue = tempValue.concat(String.valueOf(valueInArray[i]));
            ++i;

            if(lastIdx >= i) {
                tempValue = tempValue.concat(String.valueOf(valueInArray[lastIdx]));
                --lastIdx;
            }
        }

        return Integer.parseInt(tempValue);
    }
}
