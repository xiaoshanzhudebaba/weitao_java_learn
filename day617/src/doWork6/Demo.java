package doWork6;

public class Demo {
    public static void main(String[] args) {
        int  q = 0;
        long s = System.currentTimeMillis();
       for (int i = 0;i<100000;i++){

              q += i;
       }
        long x = System.currentTimeMillis();
       long num = x-s;
        System.out.println(s+"    "+x+"     "+num+"   "+q);
    }

}
