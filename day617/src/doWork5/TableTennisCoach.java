package doWork5;

public class TableTennisCoach extends Coach implements SpeakEnglish{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("会说英语");
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }
}
