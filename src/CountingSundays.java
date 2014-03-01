/**
 * User: jatin
 */
public class CountingSundays {
    static int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        int sundays = 0;
        int currentDayOfWeek = 1; // monday
        for(int year=1900; year < 2001; year++ ) {
            for(int month=0; month < 12; month++) {
                int daysInMonth = calcDaysInMonth(year, month);
                for(int day=1; day <=daysInMonth; day++) {
                    currentDayOfWeek = ++currentDayOfWeek % 7;

                    if( year > 1900 && day == 1 && currentDayOfWeek == 0) {
                        sundays++;
                    }
                }
            }
        }
        System.out.println("number of sundays: " + sundays);
    }

    private static int calcDaysInMonth(int year, int month) {
        if( month == 1) {
            return leapYearCalc(year);
        }
        return daysInMonths[month];
    }

    private static int leapYearCalc(int year) {
        if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) return 29;
        return 28;
    }

}
