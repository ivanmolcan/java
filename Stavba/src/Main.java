public class Main {
  static  int pomocnaPremenna = 0;
    public static void main(String[] args) {
        int pomocnaPremenna = 0;
        vypisSuradnic(vykresliMapu());
    }

    static char [] [] vykresliMapu() {
        char[][] map = new char[5][5];
        map[0] = new char[]{'O', 'X', 'X', 'O', 'O'};
        map[1] = new char[]{'X', 'X', 'X', 'O', 'O'};
        map[2] = new char[]{'X', 'X', 'X', 'X', 'X'};
        map[3] = new char[]{'O', 'O', 'O', 'X', 'X'};
        map[4] = new char[]{'O', 'O', 'O', 'O', 'O'};
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();

        }
        return map;
    }
    static void vypisSuradnic(char [][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if ((i < map.length - 1) && (j < map.length - 1)) {
                    if ((map[i][j] == 'X') && (map[i][j + 1] == 'X') && (map[i + 1][j] == 'X') && (map[i + 1][j + 1] == 'X')) {
                        System.out.println("suradnice su :" + i + " " + " " + j);
                    }
                    if ((map[i][j] == 'O') && (map[i][j + 1] == 'X') && (map[i + 1][j] == 'X') && (map[i + 1][j + 1] == 'X')) {
                        System.out.println("suradnice su :" + i + " " + " " + j);
                    }
                    if ((map[i][j] == 'X') && (map[i][j + 1] == 'O') && (map[i + 1][j] == 'X') && (map[i + 1][j + 1] == 'X')) {
                        System.out.println("suradnice su :" + i + " " + " " + j);
                    }
                    if ((map[i][j] == 'X') && (map[i][j + 1] == 'X') && (map[i + 1][j] == 'O') && (map[i + 1][j + 1] == 'X')) {
                        System.out.println("suradnice su :" + i + " " + " " + j);
                    }
                    if ((map[i][j] == 'X') && (map[i][j + 1] == 'X') && (map[i + 1][j] == 'X') && (map[i + 1][j + 1] == 'O')) {
                        System.out.println("suradnice su :" + i + " " + " " + j);
                    }
                    else continue;
                }
            }
        }
    }
}
