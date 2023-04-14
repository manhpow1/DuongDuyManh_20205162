import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, month;
        int daysInMonth = 0;

        while (true) {
            System.out.print("Enter a year: ");
            year = input.nextInt();
            System.out.print("Enter a month (1-12): ");
            month = input.nextInt();
            if (year > 0 && month >= 1 && month <= 12) {
                break;
            } else {
                System.out.println("Invalid year/month entered. Please try again.");
            }
        }
        switch (month) {
            case 1:
                daysInMonth = 31;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 12:
                daysInMonth = 31;
                break;
        }
        System.out.println("Number of days in month " + month + " of year " + year + ": " + daysInMonth);
        input.close();
    }  
}
