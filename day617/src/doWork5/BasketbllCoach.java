package doWork5;

public class BasketbllCoach extends Coach{
    public BasketbllCoach() {
    }

    public BasketbllCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
