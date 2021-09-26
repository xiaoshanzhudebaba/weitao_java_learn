package doWork4;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j =new Dog();
        j.jump();

        Animal a = new Dog();
        a.setName("中华田园犬");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();


        a = new Dog("中华田园犬",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Dog d = new Dog();
        d.setName("中华田园犬");
        d.setAge(5);
        d.jump();
        d.eat();
        System.out.println(d.getName()+","+d.getAge());


        d = new Dog("中华田园犬",5);
        d.jump();
        d.eat();
        System.out.println(d.getName()+","+d.getAge());

    }


}
