public class LoopCondition {
    public static void main(String[] args) {
        
        System.out.println("--- 1. IF-ELSE STATEMENT ---");
        int number = 15;
        
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.println("\n--- 2. SWITCH STATEMENT ---");
        int dayOfWeek = 3;
       
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); 
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        System.out.println("\n--- 3. FOR LOOP ---");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        System.out.println("\n--- 4. WHILE LOOP ---");
       
        int count = 1;
        while (count <= 3) {
            System.out.println("While Loop Count: " + count);
            count++;
        }

        System.out.println("\n--- 5. DO-WHILE LOOP ---");
        
        int status = 1;
        do {
            System.out.println("Do-While Loop Status: " + status);
            status++;
        } while (status <= 3);
    }
}

