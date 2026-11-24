package Backtracking;

import java.util.Scanner;

public class backtracking {
    public static void changeArr(int arr[],int i,int val ){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);  // Function call step and backtracking comes after the function call step always
        arr[i]=arr[i]-2;  // Backtracking Step
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    // Find Subsets
     public static void findsubsets(String str, String ans , int i){ // i is the index
        //base case
         if(i==str.length()){
             System.out.println(ans);
             return;
         }
         findsubsets(str,ans+str.charAt(i),i+1);
         findsubsets(str,ans,i+1);
    }


    // Find Permutations
    public static void permutations(String str , String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            String NewStr=str.substring(0,i)+str.substring(i+1);
            permutations(NewStr,ans+temp);
        }
    }


    // n-Queens

    public static boolean isSafe(char board[][], int row, int col) {

        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);
            count++;
            return ;
        }
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                nQueens(board, row + 1);

                // Backtracking
                board[row][j] = 'x';
            }
        }
    }

    public static void printBoard(char board[][]) {

        System.out.println("_____ chess board _____");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();     //Complexity is the O(n!)
        }
    }
    //Count total number of ways in which we can solve N queens problem.
    static int count=0;


    // Grid Problem(not moves in top and left directions)
    public static int gridWays(int i,int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }
        int ways1=gridWays(i+1,j,n,m);   // Right terms=no. of columns =m , Down terms= No. of Rows =n
        int ways2=gridWays(i,j+1,n,m);   // Time Complexity is the exponential
        return ways1+ways2;
    }


    //Grid Ways Problem(Math trick for linear Time)
    // Sudoku
    void main(){
        int arr[]=new int[5];
        changeArr(arr,0,1);
//        String str="abcd";
//        findsubsets(str,"",0); // Passes as the blank string
        String str="abc";
        permutations(str,"");
        int n=3;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='O';
            }
        }
        nQueens(board,0);
        System.out.println("Total ways to find Queens : "+count);
        int m=3;
        System.out.println(gridWays(0,0,n,m));
    }

}