import java.util.Scanner;

class OverBooking extends Exception {
    OverBooking(String msg) {
        super(msg);
    }
}

public class overexcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;
        int numofres;
        int[] maxtable = {10, 10, 10, 10, 10, 10, 10};
        try {
            while (true) {
                System.out.println("***************Hotel Booking************");
                System.out.println("We have max 10 Tables each day");
                System.out.print("Enter day on which you want your booking (type 'exit' to stop): ");
                day = sc.next().toLowerCase();  
                if (day.equals("exit")) {
                    break;
                }

                System.out.print("Enter the number of tables you want to book: ");
                numofres = sc.nextInt();


                switch (day) {
                    case "monday":
                        if (maxtable[0] - numofres < 0) {
                            throw new OverBooking("No enough tables available on Monday");
                        } else {
                            maxtable[0] -= numofres;
                            System.out.println(numofres + " table(s) booked for Monday.");
                        }
                        break;
                    case "tuesday":
                        if (maxtable[1] - numofres < 0) {
                            throw new OverBooking("No enough tables available on Tuesday");
                        } else {
                            maxtable[1] -= numofres;
                            System.out.println(numofres + " table(s) booked for Tuesday.");
                        }
                        break;
                    case "wednesday":
                        if (maxtable[2] - numofres < 0) {
                            throw new OverBooking("No enough tables available on Wednesday");
                        } else {
                            maxtable[2] -= numofres;
                            System.out.println(numofres + " table(s) booked for Wednesday.");
                        }
                        break;
                    case "thursday":  // Fixed spelling here
                        if (maxtable[3] - numofres < 0) {
                            throw new OverBooking("No enough tables available on Thursday");
                        } else {
                            maxtable[3] -= numofres;
                            System.out.println(numofres + " table(s) booked for Thursday.");
                        }
                        break;
                    case "friday":
                        if (maxtable[4] - numofres < 0) {
                            throw new OverBooking("No enough tables available on Friday");
                        } else {
                            maxtable[4] -= numofres;
                            System.out.println(numofres + " table(s) booked for Friday.");
                        }
                        break;
                    case "saturday":
                        if (maxtable[5] - numofres < 0) {
                            throw new OverBooking("No enough tables available on Saturday");
                        } else {
                            maxtable[5] -= numofres;
                            System.out.println(numofres + " table(s) booked for Saturday.");
                        }
                        break;
                    case "sunday":
                        if (maxtable[6] - numofres < 0) {
                            throw new OverBooking("No enough tables available on Sunday");
                        } else {
                            maxtable[6] -= numofres;
                            System.out.println(numofres + " table(s) booked for Sunday.");
                        }
                        break;
                    default:
                        System.out.println("Please enter a valid day (e.g., monday, tuesday, etc.)");
                }
                System.out.println("");
            }
        } catch (OverBooking b) {
            System.out.println(b.getMessage());
        } finally {
            System.out.println("Thanks for visiting.");
            sc.close();
        }
    }
}
