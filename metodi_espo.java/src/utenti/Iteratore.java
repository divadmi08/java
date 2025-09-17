package utenti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iteratore {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList(

                Arrays.asList(
                        100, 45, 54, 32, 10
                )
        );

        Iterator<Integer> it = grades.iterator();
        while (it.hasNext()) {
            int var = it.next();

            if ( var < 50){
                it.remove();
            }


        }
        System.out.println(grades);
}
}