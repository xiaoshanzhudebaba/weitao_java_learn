package doWork3;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.setName("中华田园犬");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();


         a =new Dog("中华田园犬",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
