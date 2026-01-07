package lang.immutable.test;

public class ImmutableMyData {
    private int year;
    private int month;
    private int day;

    public ImmutableMyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmutableMyData setDay(int day) {
        return new ImmutableMyData(this.year, this.month, day);
    }
    public ImmutableMyData setMonth(int month) {
        return new ImmutableMyData(this.year, month, this.day);
    }
    public ImmutableMyData setYear(int newYear) {
        return new ImmutableMyData(newYear, this.month, this.day);
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

}
