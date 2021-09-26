package doWork18;

import java.util.Random;
import java.util.TreeSet;

public class Random2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Random r = new Random();
        while (ts.size()<10){
            int nextInt = r.nextInt(20)+1;
            ts.add(nextInt);
        }
        for (int i : ts){
            System.out.println(i);
        }
    }
}
