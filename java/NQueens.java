public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int r){
        if(r==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row
        for(int c = 0;c<board.length;c++){
            // place the queen if  it is safe
            if(isSafe(board,r,c)){
                board[r][c] = true;
                count += queens(board, r+1);
                board[r][c] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        // Check vertical row
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }
        }

        // left diagonal
        int maxleft = Math.min(r,c);
        for(int i=0;i<=maxleft;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }

        // right diagonal
        int maxright = Math.min(r,board.length-c-1);
        for(int i=0;i<=maxright;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] r:board){
            for(boolean e:r){
                if(e){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
