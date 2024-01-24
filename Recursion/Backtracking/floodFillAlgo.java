package Backtracking;

public class floodFillAlgo {

    //Method 1

//  public static void floodFillAlgo(int [][] maze, int sr, int sc, String ans, boolean[][]vis){
//     if(sr>=maze.length || sc>= maze[0].length || sr<0 || sc<0 || 
//             maze[sr][sc]==1 || vis[sr][sc]==true){
//         return;
//     }
//     if(sr==maze.length-1 && sc== maze[0].length-1){
//         System.out.println(ans);
//         return;
//     }
//     vis[sr][sc]=true;
//     floodFillAlgo(maze, sr-1, sc, ans+"t", vis);
//     floodFillAlgo(maze, sr, sc-1, ans+"l", vis);
//     floodFillAlgo(maze, sr+1, sc, ans+"d", vis);
//     floodFillAlgo(maze, sr, sc+1, ans+"r", vis);
//     vis[sr][sc]=false;
//  }   
        //Method 2
//  public static void floodFillAlgo2(int [][] maze, int sr, int sc, String ans){
//     if(sr>=maze.length || sc>= maze[0].length || sr<0 || sc<0 || 
//             maze[sr][sc]==1 ){
//         return;
//     }
//     if(sr==maze.length-1 && sc== maze[0].length-1){
//         System.out.println(ans);
//         return;
//     }
//     maze[sr][sc]=1;
//     floodFillAlgo2(maze, sr-1, sc, ans+"t");
//     floodFillAlgo2(maze, sr, sc-1, ans+"l");
//     floodFillAlgo2(maze, sr+1, sc, ans+"d");
//     floodFillAlgo2(maze, sr, sc+1, ans+"r");
//     maze[sr][sc]=0;
//  }   

    //      Method 3
    static int [][] dir={{-1,0},{0,-1},{1,0},{0,1}};
    static String[] dirN= {"t","l","d","r"};

 public static void floodFillAlgo3(int [][] maze, int sr, int sc, String ans){
    if(sr>=maze.length || sc>= maze[0].length || sr<0 || sc<0 || 
            maze[sr][sc]==1 ){
        return;
   }
    if(sr==maze.length-1 && sc== maze[0].length-1){
        System.out.println(ans);
        return;
    }
    maze[sr][sc]=1;
    for(int d=0; d< dir.length; d++){
        int r= sr+ dir[d][0];
        int c= sc+ dir[d][1];
      //Method 4 --> additional checkpoint we don't enter in invalid location
        floodFillAlgo3(maze, r, c, ans+ dirN[d]);
    }
    maze[sr][sc]=0;
 }   

 public static void main(String[] args) {
    int [][]maze= new int[4][5];
    maze[0][1]=1;
    maze[1][1]=1;
    maze[1][3]=1;
    maze[1][4]=1;
    maze[3][0]=1;
    boolean [][]vis= new boolean[4][5];

    //floodFillAlgo(maze, 0, 0, "", vis);
    //floodFillAlgo2(maze, 0, 0, "");
    floodFillAlgo3(maze, 0, 0, "");
 }
}
