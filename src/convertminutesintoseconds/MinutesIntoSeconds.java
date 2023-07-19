package convertminutesintoseconds;

public class MinutesIntoSeconds {

    public static void main(String[] args) {
        MinutesIntoSeconds minutesIntoSeconds = new MinutesIntoSeconds();
        System.out.println(minutesIntoSeconds.convertMinutesIntoSeconds(-50));
    }

    public int convertMinutesIntoSeconds(int minutes) {
        int minsIntoSeconds = 0;
        if (minutes != 0) {
            if (minutes > 0 || minutes < 0) {
                return minsIntoSeconds = minutes * 60;
            }
        }
        return minsIntoSeconds;
    }
}
