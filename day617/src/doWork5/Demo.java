package doWork5;

public class Demo {
    public static void main(String[] args) {
        TableTennisCoach c = new TableTennisCoach();
        c.setName("乒乓球老师");
        c.setAge(33);
        System.out.println(c.getName() + "," + c.getAge() + "岁");
        c.teach();
        c.speakEnglish();
        c.eat();

        TennisAthletes t = new TennisAthletes("乒乓球运动员", 19);
        System.out.println(t.getName() + "," + t.getAge() + "岁");
        t.playTable();
        t.speakEnglish();
        t.eat();

        BasketbllCoach b = new BasketbllCoach("篮球教练",36);
        System.out.println(b.getName()+","+b.getAge()+"岁");
        b.teach();
        b.eat();

        BasketbllAthletes b1 = new BasketbllAthletes("篮球运动员",24);
        System.out.println(b1.getName()+","+b1.getAge()+"岁");
        b1.playTable();
        b1.eat();


    }
}
