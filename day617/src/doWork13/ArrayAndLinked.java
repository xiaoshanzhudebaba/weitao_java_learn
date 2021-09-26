package doWork13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayAndLinked {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("加油");
        A.add("坚持");
        A.add("努力");
        Iterator<String> iterator = A.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);

        }
        System.out.println("--------------------------");
        LinkedList <String> L = new LinkedList<>();
        L.add("努力");
        L.add("坚持");
        L.add("加油");
        L.addFirst("加强努力");
        L.addLast("不忘初心");
        L.removeFirst();
        L.removeLast();
        Iterator<String> iterator1 = L.iterator();
        while (iterator1.hasNext()){
            String SS  = iterator1.next();
            System.out.println(SS);
        }
        System.out.println(L.getFirst());
        System.out.println(L.getLast());
    }
}
