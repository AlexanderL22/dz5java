public class dz4 {
    public static void main(String[] args) {
        String[][] boards = new String[8][8];
        boards[3][0] = "Z";
        boards[5][1] = "Z";
        boards[7][2] = "Z";
        boards[1][3] = "Z";
        boards[6][4] = "Z";
        boards[0][5] = "Z";
        boards[2][6] = "Z";
        boards[4][7] = "Z";

        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[i].length; j++) {
                if (boards[i][j] == null) {
                    boards[i][j] = "X";
                }
                System.out.print(boards[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

