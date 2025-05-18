import static java.util.Calendar.MONDAY;

public class Days {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    private Day day;

    public Days(Day day){
        this.day = day;
    }

    public void seeDay() {

        switch (day) {
            case MONDAY:
                System.out.println("Mondays are good");
                break;

            case FRIDAY:
                System.out.println("Fridays are nice");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are great");
                break;

            default:
                System.out.println("Weekdays are okay");
                break;
        }
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
