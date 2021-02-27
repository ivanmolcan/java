package sk.ivan.learn2code;

public class DomMore {

    private char[][] map = {
            {'O', 'X', 'X', 'O', 'O'},
            {'X', 'X', 'X', 'O', 'O'},
            {'O', 'O', 'X', 'X', 'X'},
            {'O', 'O', 'O', 'X', 'X'},
            {'O', 'O', 'O', 'O', 'O'},
    };

    private char[][] house = {
            {'H','H'},
            {'H','-'},
    };
    private int numb =0;
    private int count =0;


    public void placeHouse(){
        this.house = house;
        for(int i=0; i< map.length; i++){
            for(int j = 0; j< map[i].length; j++){
                if(numb != 1){
                    if(map[i][j] == 'X' && map[i+1][j] == 'X'){
                        if(j < map[i].length-1){
                            if(map[i][j+1] == 'X' && map[i+1][j+1] == 'X'){
                                numb++;
                            }
                        } else{
                            break;
                        }
                    }
                } else {
                    numb = 0;
                    count ++;
                }
            }
        }
        System.out.println("Hladany dom sa nachadza: " + count );

    }

}
