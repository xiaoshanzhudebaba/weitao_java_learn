package doWork5;

public class BasketbllAthletes extends Athletes  {
    public BasketbllAthletes() {
    }

    public BasketbllAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void playTable() {
        System.out.println("打篮球");
    }
}
