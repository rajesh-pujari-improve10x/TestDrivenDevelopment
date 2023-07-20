package hoursandminutesintiseconds;

public class HoursAndMinutesIntoSeconds {
    public int convertHrsAndMinsIntoSeconds(int hours, int minutes) {
        int hrsSeconds = 0;
        int minsSeconds = 0;
        if (hours > 0 || minutes > 0) {
            if (hours > 0) {
                hrsSeconds = hours * 60 * 60;
            }
            if (minutes > 0) {
                minsSeconds = minutes * 60;
            }
        }
        return hrsSeconds + minsSeconds;
    }
}
