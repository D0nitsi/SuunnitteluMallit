public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        dateAdapter.setYear(2024);
        dateAdapter.setMonth(6); // June
        dateAdapter.setDay(10);

        System.out.println("Initial date: " +
                dateAdapter.getDay() + "/" +
                dateAdapter.getMonth() + "/" +
                dateAdapter.getYear());

        dateAdapter.advanceDays(5);

        System.out.println("After advancing 5 days: " +
                dateAdapter.getDay() + "/" +
                dateAdapter.getMonth() + "/" +
                dateAdapter.getYear());
    }
}
