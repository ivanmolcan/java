package sk.ivan.learn2code;

public class Main {

    static int number = 10;

    void pozNeg(int i){
        if(i >=0){
            System.out.println("Pozitivne");
        } else {
            System.out.println("Negativne");
        }
    }

    void vajicka(boolean vajicka, boolean muka, boolean drozdie){
        if(vajicka){
            System.out.println("Ideme dalej");
            if(muka && drozdie){
                System.out.println("super mame muku aj drozdie");
            } else{
                System.out.println("nemame nic :*(");
            }
        } else {
            System.out.println("Bez vajicok to nejde");
        }
    }

    void dni(int i){
        if( i == 1){
            System.out.println("Pondelok");
        } else if ( i == 2) {
            System.out.println("Utorok");
        } else {
            System.out.println("iny den");
        }
    }

    void najvacsieCislo(int a, int b, int c){
        if( a > b && a> c){
            System.out.println("Toto je najvacsie cislo: " + a);
        } else if (b>a && b>c){
            System.out.println("Toto je najvacsie cislo: " + b);
        } else {
            System.out.println("Toto je najvacsie cislo: " + c);
        }
    }

    static void odNajmensiePoNajvacsie(int a, int b, int c){
        int[] poleInst = new int[3];
        if(a > b && a>c){
            poleInst[2] = a;
            if(b>c){
                poleInst[1] = b;
                poleInst[0] = c;
            } else {
                poleInst[1] = c;
                poleInst[0] = b;
            }
        } else if(b>a && b>c) {
            poleInst[2] = b;
            if(a>c){
                poleInst[1] = a;
                poleInst[0] = c;
            } else {
                poleInst[1] = c;
                poleInst[0] = a;
            }
        } else {
            poleInst[2] = c;
            if(a>b){
                poleInst[1] = a;
                poleInst[0] = b;
            } else {
                poleInst[1] = b;
                poleInst[0] = a;
            }
        }
        for(int i : poleInst){
            System.out.println(i);
        }
    }

    static void delitel(int cislo){
        if(cislo%3 == 0 && cislo%5 == 0){
            System.out.println("Delitelne oboma");
        }else if(cislo%3 == 0){
            System.out.println("delitelne 3kou");
        } else if(cislo%5 == 0){
            System.out.println("delitelne patkou");
        } else {
            System.out.println("ani jednym");
        }
    }

    static void cyklusWhile(int counter){
        while(counter <11){
            System.out.println(counter);
            counter++;
        }
    }

    static void parneCisla(int counter){
        while(counter <101){
            if(counter%2 == 0){
                System.out.println(counter);
            }
            counter++;
        }
    }

    static void delPat(int counter){
        while(counter <101){
            if(counter%5 == 0){
                System.out.println(counter);
            }
            counter++;
        }
    }

    static void sucetParNepar(int counter){
        parNepar(counter);
    }

    private static void parNepar(int counter) {
        int parne = 0;
        int neparne = 0;
        while(counter >0){
                if(counter %2 == 0){
                    parne += counter;
                } else {
                    neparne += counter;
                }
            counter--;
        }
        System.out.println("parne: "+parne+ "// neparne: "+neparne);
    }

    private static void cyklus1(int cislo){
        for(int i = 0; i<cislo; i++){
            for(int j=1; j<cislo-i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void cyklus2(int cislo){
        for(int i = 0; i<cislo; i++){
            for(int j=0; j<i;j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    private static void cyklus3(int cislo){
        for(int i = 0; i<cislo; i++){
            for(int j=0; j<cislo; j++){
                if(j==i){
                    System.out.print("_" + " ");
                } else{
                    System.out.print(j+1 + " ");
                }
            }
            System.out.println();
        }
    }

    private static void ternarny1(int cislo){
        System.out.println(cislo%2 == 0 ? "je delitelne dvoma" : "nie je delitelne dvoma");
    }

    private static void ternarny2(int cislo){
        System.out.println(cislo > 10 ? cislo + " je vacsie ako desat" : (cislo ==10 ? cislo + " je rovne 10" : cislo + " je mensie ako 10"));
    }

    private static void hviezdickaCyklus1(int cislo){
        for(int i=0; i<cislo; i++){
            for(int j=0; j<cislo-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void hviezdickaCyklus2(int cislo){
        for(int i=0; i<cislo; i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int sucet(int cislo1, int cislo2){
        return cislo1 + cislo2;
    }

    private static int sucet(int cislo1, int cislo2, int cislo3){
        return cislo1 + cislo2 + cislo3;
    }

    private static int suma(int cislo){
        if(cislo > 0){
            return cislo + suma(cislo-1);
        } else {
            return cislo;
        }
    }

    private static int metoda(int number){
        return Main.number + number;
    }



    public static void main(String[] args) {

//        Main main = new Main();
//        main.pozNeg(-4);
//        main.vajicka(true, true, true);
//        main.dni(1);
//        main.najvacsieCislo(10,9,9);
//        odNajmensiePoNajvacsie(10,7,1);
//        delitel(6);
//        cyklusWhile(1);
//        parneCisla(1);
//        delPat(1);
//        sucetParNepar(10);
//        cyklus1(5);
//        System.out.println("-------------");
//        cyklus2(5);
//        System.out.println("-------------");
//        cyklus3(4);

//        ternarny1(5);
//        ternarny2(10);

//        hviezdickaCyklus1(5);
//        hviezdickaCyklus2(4);

//        System.out.println(sucet(15,4));
//        System.out.println(sucet(3,4,5));
//        System.out.println(suma(4));
//        System.out.println(metoda(15));

//        Uloha2 hs = new Uloha2();
//        hs.lookForWord("Joe");

        DomMore dom = new DomMore();
        dom.placeHouse();
    }

}
