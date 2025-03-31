import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Data date1 = new Data(29, 2, 2024);
        Data date2 = new Data(30, 2, 2023);
        Data date3 = new Data(31, 4, 2022);
        System.out.println(date1.isValidDate()); // true
        System.out.println(date2.isValidDate()); // false
        System.out.println(date3.isValidDate()); // false

        Data date = new Data(10, 5, 2023);
        System.out.println(date.updateDate(29, 2, 2024));
        System.out.println(date.updateDate(30, 2, 2023));

        if(date1.isValidDate()){
            date1.printDate();
        }
        if(date2.isValidDate()){
            date1.printDate();
        }

        ArrayList<Data> dates = new ArrayList<>();
        dates.add(new Data(28, 2, 2024));
        dates.add(new Data(28, 2, 2023));
        dates.add(new Data(1, 1, 2025));
        dates.add(new Data(4, 3, 2006));

        Collections.sort(dates);
        for (Data d : dates) {
            d.printDate();
        }

        System.out.println(date1.getDayOfWeek());

        Data date4 = new Data(1, 1, 2025);
        Data date5 = new Data(30, 1, 2025);
        System.out.println(date4.calculateDifference(date5));
    }
}

class Data implements Comparable<Data>{
    // atributes
    int day;
    int month;
    int year;

    // constructor
    Data(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // checks if the date is correct
    boolean isValidDate() {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 31) return false;

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear() && month == 2) {
            daysInMonth[2] = 29;
            return true;
        }

        return day <= daysInMonth[month];
    }

    // cheks if the year is leap
    boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // change old date to new
    boolean updateDate(int d, int m, int y) {
        int oldD = this.day;
        int oldM = this.month;
        int oldY = this.year;

        this.day = d;
        this.month = m;
        this.year = y;

        if (!isValidDate()) {
            this.day = oldD;
            this.month = oldM;
            this.year = oldY;
            return false;
        }
        return true;
    }

    // print date
    void printDate() {
        String[] monNames = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};
        System.out.println(monNames[month - 1] + " " + day + ", " + year);
    }

    // sort dates
    public int compareTo(Data date) {
        if (this.year != date.year) {
            return Integer.compare(this.year, date.year);
        }
        if (this.month != date.month) {
            return Integer.compare(this.month, date.month);
        }
        return Integer.compare(this.day, date.day);
    }

    // show day of week this date
    public String getDayOfWeek() {
        LocalDate localDate = LocalDate.of(this.year, this.month, this.day);
        return localDate.getDayOfWeek().toString();
    }

    // find the difference between two dates
    public long calculateDifference(Data otherDate) {
        LocalDate localDate1 = LocalDate.of(this.year, this.month, this.day);
        LocalDate localDate2 = LocalDate.of(otherDate.year, otherDate.month, otherDate.day);

        long dif = localDate2.toEpochDay() - localDate1.toEpochDay();

        return dif;
    }
}
