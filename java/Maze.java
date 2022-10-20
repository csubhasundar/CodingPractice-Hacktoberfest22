import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3,3));
        // path("",3,3);
        // System.out.println(pathDiag("", 3, 3));
         boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
         };

         pathRestrict("", board, 0, 0);
    }

    // This returns number of ways moving from point a to point b in a matrix of 3 by 3
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left+right;
    }

    // This will be printing the path from one point to another
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+ 'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    // Same path function with return type ArrayList
    static ArrayList<String> pathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(pathRet(p+ 'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+'R',r,c-1));
        }

        return list;
    }

    // if we can travel through diagonals also then
    static ArrayList<String> pathDiag(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(pathDiag(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(pathDiag(p+ 'H',r-1,c));
        }
        if(c>1){
            list.addAll(pathDiag(p+'V',r,c-1));
        }

        return list;
    }

    // Maze with restriction
    static void pathRestrict(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            pathRestrict(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathRestrict(p+'R',maze,r,c+1);
        }
    }

}
