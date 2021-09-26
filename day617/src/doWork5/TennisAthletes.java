package doWork5;

public class TennisAthletes extends Athletes implements SpeakEnglish {
    public TennisAthletes() {
    }

    public TennisAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void playTable() {
        System.out.println("打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("会说英语");
    }
}
