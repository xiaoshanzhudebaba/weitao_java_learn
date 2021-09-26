package doWork10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("sss");
        c.add("ss");
        c.add("s");
        Iterator<String> i = c.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
