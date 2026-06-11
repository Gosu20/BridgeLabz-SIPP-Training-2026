import java.util.Scanner;

public class CalendarGenerator {

    public static String getMonthName(int m) {

        String[] months = {
            "", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        return months[m];
    }

    public static int getDays(int m, int y) {

        int[] days = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (m == 2 && isLeapYear(y)) return 29;

        return days[m];
    }

    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getFirstDay(int m, int y) {

        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        return (h + 6) % 7; // convert to 0=Sun
    }

    public static void printCalendar(int m, int y) {

        System.out.println("Calendar: " + getMonthName(m) + " " + y);

        int days = getDays(m, y);
        int start = getFirstDay(m, y);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < start; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);

            if ((i + start) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}