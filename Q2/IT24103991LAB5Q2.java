import java.util.Scanner;

public class IT2410399Lab5Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members:");
        int newMembers = input.nextInt();

     if(newMembers < 0) {
        System.out.println("Invalid Input.Input must be a number 0 or greater than 0.");
     } else {
        String Prize;

        switch (newMembers) {
            case 0:
                Prize = "No Prize";
                break;
            case 1:
                Prize = "Pen";
                break;
            case 2:
                Prize = "Umbrella";
                break;
            case 3:
                Prize = "Bag";
                break;
            case 4:
                Prize = "Travelling Bag";
                break;
            default:
                Prize = "Headphone";
                break;

        }
        System.out.println("Prize is a:" + Prize);
     }

    }
    
}
