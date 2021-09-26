package doWork7;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String s = "91 27 26 38 50";
        String[] array = s.split(" ");
        int[] i = new int[array.length];
        for (int x = 0; x < array.length; x++) {
              i[x] = Integer.parseInt(array[x]);
        }
        Arrays.sort(i);

        StringBuilder sb = new StringBuilder();
        for(int x= 0 ; x< i.length; x++ ){
            if(x == i.length-1){
                sb.append(i[x]);
            }else{
                sb.append(i[x]).append(" ");
            }

        }
        System.out.println(sb);
    }
}
