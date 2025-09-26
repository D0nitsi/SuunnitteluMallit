import java.util.Calendar;

public class CalendarToNewDateAdapter implements NewDateInterface {
    private Calendar calendar;

    public CalendarToNewDateAdapter() {
        calendar = Calendar.getInstance();
        calendar.setLenient(true);
    }

    public void setDay(int day) {
        calendar.set(Calendar.DAY_OF_MONTH, day);
    }

    public void setMonth(int month) {
        calendar.set(Calendar.MONTH, month - 1); // Calendar.MONTH is 0-based
    }

    public void setYear(int year) {
        calendar.set(Calendar.YEAR, year);
    }

    public int getDay() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getMonth() {
        return calendar.get(Calendar.MONTH) + 1; // Convert to 1-based
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public void advanceDays(int days) {
        calendar.add(Calendar.DAY_OF_MONTH, days);
    }
}
