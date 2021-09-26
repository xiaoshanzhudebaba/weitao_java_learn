package doWork11;

import java.util.ArrayList;

public class foradd {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        for(int i : arr){
            System.out.println(i);
        }
        String[] s = {"坚持","努力","加油"};
        for(String s2 : s){
            System.out.println(s2);
        }
        ArrayList<String> ss =new ArrayList<>();
        ss.add("坚持");
        ss.add("努力");
        ss.add("加油");
        for (String sss:ss)
        {
            System.out.println(sss);
        }
    }
}
