public interface NewDateInterface {
    void setDay(int day);
    void setMonth(int month); // 1-based (January = 1)
    void setYear(int year);
    int getDay();
    int getMonth(); // 1-based (January = 1)
    int getYear();
    void advanceDays(int days);
}
