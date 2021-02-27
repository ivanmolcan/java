package sk.ivanmolcan.model.enums;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum Pohlavie {
    MUZ('M'),
    ZENA('Z');

    private char kod;

    Pohlavie(char kod){
        this.kod = kod;
    }

    public static Pohlavie getEnumFromKod(Character kod) {
        if(kod.equals('M') || kod.equals('m')){
            return MUZ;
        }

        if(kod.equals('Z') || kod.equals('z')){
            return ZENA;
        }

        throw new UnsupportedOperationException("Zly kod");
    }

    public char getKod() {
        return kod;
    }
}


