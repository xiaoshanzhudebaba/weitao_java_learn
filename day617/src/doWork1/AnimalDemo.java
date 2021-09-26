package doWork1;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.setAge(5);
        a.setName("中华帝王犬");
        System.out.println(a.getName()+","+a.getAge());
        a.eat();


        a = new Dog("中华帝王犬",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a = (Dog) a;
        ((Dog) a).lookDoor();


    }
}
