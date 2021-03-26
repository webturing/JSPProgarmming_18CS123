package lec04ds1;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> S=new HashSet<Integer>();
        for(int i=0;i<100;i++){
            S.add(i*i%1000);
            System.out.println(S);
        }

    }
}
