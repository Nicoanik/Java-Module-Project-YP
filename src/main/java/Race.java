public class Race {
    static String raceLeader = "";
    static int distance = 0;

    public static void newRaceLeader(String name, int speed) {
        if (distance < speed * 24) {
            distance = speed * 24;
            raceLeader = name;
        }
    }
}
