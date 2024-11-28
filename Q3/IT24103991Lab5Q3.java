import java.util.Scanner;

public class IT24103991lab5Q3 {
    
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final int MIN_DAY = 1;
    private static final int MAX_DAY = 31;
    private static final int DISCOUNT_3_TO_4_DAYS = 10;   
    private static final int DISCOUNT_5_OR_MORE_DAYS = 20; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the start day of reservation (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter the end day of reservation (1-31): ");
        int endDate = input.nextInt();

        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int daysReserved = endDate - startDate;
        double totalCharge = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountRate = 0;

        
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        
        double discountAmount = (totalCharge * discountRate) / 100;
        double finalAmount = totalCharge - discountAmount;

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Room charged per day: Rs " + ROOM_CHARGE_PER_DAY);
        System.out.println("Total amount to be paid after discount: Rs " + finalAmount);

    }
}
