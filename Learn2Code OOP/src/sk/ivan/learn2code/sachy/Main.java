package sk.ivan.learn2code.sachy;

import sk.ivan.learn2code.sachy.enums.Color;
import sk.ivan.learn2code.sachy.figurines.*;

public class Main {

    public static void main(String[] args) {
        StaticData data = new StaticData();
        Assembly chess1 = new Assembly(data.chessboard, data.veza, data.dama, data.kral, data.pesiak, data.strelec, data.kon);
        Assembly chess2 = new Assembly(data.chessboard2, data.veza2, data.dama2, data.kral2, data.pesiak2, data.strelec2, data.kon2);

        if(chess1.chessboard.getState()){
            System.out.println(chess1);
        } else {
            System.out.println("Chessboard is not open");
        }

        System.out.println();

        if(chess2.chessboard.getState()){
            System.out.println(chess1);
        } else {
            System.out.println("Chessboard is not open");
        }
    }

}
