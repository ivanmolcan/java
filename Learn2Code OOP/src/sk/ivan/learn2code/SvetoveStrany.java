package sk.ivan.learn2code;

public enum SvetoveStrany {
    SEVER("S","sever","N","north"),
    JUH("J","juh","S","south"),
    VYCHOD("V","vychod","E","east"),
    ZAPAD("Z","zapad","W","west");

    private String skShort;
    private String sk;
    private String enShort;
    private String en;

    static final String jazyk = "SK";

    public String getSkShort() {
        return skShort;
    }

    public String getSk() {
        return sk;
    }

    public String getEnShort() {
        return enShort;
    }

    public String getEn() {
        return en;
    }

    SvetoveStrany(String skShort, String sk, String enShort, String en) {
        this.skShort = skShort;
        this.sk = sk;
        this.enShort = enShort;
        this.en = en;
    }
}
