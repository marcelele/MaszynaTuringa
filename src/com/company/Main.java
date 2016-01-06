package com.company;

/**
 * Created by Marceli Baczewski on 2016-01-06.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int currentState= 0;
    static int currentPosition= 0;
    public static void main(String[] args) {

        Transformer[] transformers=new Transformer[]{
                //q0
                new Transformer(new Triple(1, 'B', 'P'), new Triple(5, 'B', 'P'), new Triple()),
                //q1
                new Transformer(new Triple(1, '0', 'P'), new Triple(2, '1', 'P'), new Triple()),
                //q2
                new Transformer(new Triple(3, '1', 'L'), new Triple(2, '1', 'P'), new Triple(4, 'B', 'L')),
                //q3
                new Transformer(new Triple(3, '0', 'L'), new Triple(3, '1', 'L'), new Triple(0, 'B', 'P')),
                //q4
                new Transformer(new Triple(4, '0', 'L'), new Triple(4, 'B', 'L'), new Triple(6, '0', 'P')),
                //q5
                new Transformer(new Triple(5, 'B', 'P'), new Triple(5, 'B', 'P'), new Triple(6, 'B', 'P')),
                //q6
                new Transformer(new Triple(), new Triple(), new Triple())
        };
        //7 elements- 7 states

        BitParser bits= new BitParser();
        System.out.println("Marceli Baczewski- Maszyna Turinga");
        System.out.println("Opis maszyny:");
        //*pink panther*
        //TODO
        //TODO
        //TODO TODO TODO TODO
        //TODOOOOO
        System.out.println("Prosze podac m i n- liczby wejsciowe");
        int m = new Scanner(System.in).nextInt();
        int n = new Scanner(System.in).nextInt();


        ArrayList<Sign> signs = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            signs.add(new Sign('0'));
        }
        signs.add(new Sign('1'));
        for (int i = 0; i < n; i++) {
            signs.add(new Sign('0'));
        }
        signs.get(0).flipCurrent();//initiating
        boolean end=false;
        while(!end){

            transformers[currentState].transform(signs, currentPosition, currentState,bits);
            if(currentState==100){
                end=true;
            }

        }







    }
}
