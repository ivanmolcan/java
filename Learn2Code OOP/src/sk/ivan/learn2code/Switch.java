package sk.ivan.learn2code;

public class Switch {

    static String exampleOfSwitch(String day){
        String result;

        switch (day){
            case "Monday" :
                result = "Start tyzdna";
                break;
            case "Sunday" :
            case "Saturady" :
                result = "vikend";
                break;
            default:
                result = "iny den";
                break;
        }
        return result;
    }

    private static double znamky(int... znamky){
        double result = 0;

        for(int i=0; i < znamky.length; i++){
                 result += znamky[i];
        }

            return result/znamky.length;
    }

    private static void pole1(){
        int[][] pole = {{1,2,3,4,5,6},{6,5,4,3,2,1}};

        for(int i=0; i<pole.length;i++){
            for(int j = 0; j<pole[i].length;j++){
                System.out.print(pole[i][j] + " ");
                if(j>0){
                    break;
                }
            }
            System.out.println();
        }
    }

    private static void pole2(){
        int[] pole = {5,3,5};
        int nasobok = 1;
        int sucet = 0;

        for(int i=0;i<pole.length;i++){
            nasobok *= pole[i];
            sucet += pole[i];
        }

        System.out.println("nasobok " + nasobok);
        System.out.println("sucet " + sucet);
    }

    private static void pole3(){
        int[][] pole = {{5,3,5},{2,2,4}};
        int nasobok = 1;
        int sucet = 0;

        for(int i=0;i<pole.length;i++){
            for(int j =0 ; j<pole[i].length;j++){
                nasobok *= pole[i][j];
                sucet += pole[i][j];
            }
        }

        System.out.println("nasobok " + nasobok);
        System.out.println("sucet " + sucet);
    }

    private static void pole4(){
        int[][] pole = {{5,3},{-3,2,4},{3,-1},{10,159}};
        int sucet = 0;

        for(int i=0;i<pole.length;i++){
            for(int j =0 ; j<pole[i].length;j++){
                sucet += pole[i][j];
            }
            System.out.println(i + " sucet: " + sucet);
            System.out.println("-------------");
            sucet = 0;
        }
    }

    private static void poleForEach(){
        int[][] arrayko = {{2,5,6},{-10,0,10,59,41}};
        for(int[] i : arrayko){
            for(int j : i){
                System.out.println(j);
            }
        }
    }

    private static String upperCase(String text){
        return text.toUpperCase();
    }

    private static boolean porovnanieString(String text, String text2){
        return text.equalsIgnoreCase(text2);
    }

    private static void denVTyzdni(DniVTyzdni den){
        switch (den) {
            case PONDELOK:
            case UTOROK:
            case STREDA:
                System.out.println("Den v tyzdni");
                break;
            case SOBOTA:
            case NEDELA:
                System.out.println("Vikend");
                break;
            default:
                System.out.println("Iny den");
                break;
        }
    }

    private static void pouziStrany(SvetoveStrany[] strany){
        for(SvetoveStrany strana : strany ){
            goDirection(strana);
        }
    }

    private static void goDirection(SvetoveStrany strana) {
        if("SK" == SvetoveStrany.jazyk){
            System.out.println("Chod na " + strana.getSk());
        } else {
            System.out.println("Go " + strana.getEn());
        }
    }

    public static void main(String[] args) {
//        System.out.println(exampleOfSwitch("Monday"));
//        System.out.println(znamky(2,3,4));
//        System.out.println(znamky(1,2,1));
//        pole1();
//        pole4();
//        poleForEach();
//        System.out.println(upperCase("iVaN"));
//        System.out.println(porovnanieString("Ivan", "IVANko"));

//            denVTyzdni(DniVTyzdni.SOBOTA);
//        SvetoveStrany strany = SvetoveStrany.valueOf("SEVER");

        pouziStrany(new SvetoveStrany[]{SvetoveStrany.SEVER, SvetoveStrany.VYCHOD, SvetoveStrany.JUH});

    }


}
