package Java_homework.homework_5;

public class app {
    public static void main(String[] args) {
        int[][] map = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                       {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                       {1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1},
                       {1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                       {1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1},
                       {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                       {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        printMap(map);
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 0) {
                    System.out.print(" ");
                } else if (map[i][j] == 1) {
                    System.out.print("#"); 
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
            
        }
    }
    
}
