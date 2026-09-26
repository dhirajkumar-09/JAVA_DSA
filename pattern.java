public class pattern {
    // public static void printPattern(int Rows, int Columns) {     //hollow rectangle pattern
    //      //outer loop
    //     for(int i=1; i<=Rows; i++) {
    //         //inner loop
    //         for(int j=1; j<=Columns; j++) {
    //             if(i==1 || i==Rows || j==1 || j==Columns) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     printPattern(5, 5);
    // }



    // public static void invertedpattern(int rows,int columns) {     //inverted half pyramid pattern
    //     for(int i=1; i<=rows; i++){
    //         for(int j=1; j<=columns;j++){
    //             if(j>=rows-i+1){
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }

    // }
    // public static void main(String[] args) {
    //     invertedpattern(80, 80);
    // }
      
    
    // public static void floydsTriangle(int rows) {     //floyds triangle pattern
    //     int number=1;
    //     for(int i=1; i<=rows; i++){
    //         for(int j=1; j<=i;j++){
    //             System.out.print(number+" ");
    //             number++;
    //         }
    //         System.out.println();
    //     }

    // }
    // public static void main(String[] args) {
    //     floydsTriangle(5);
    // }


//     public static void triangle(int rows) { 
//         for(int i=1; i<=rows; i++){
//                 for(int j=1; j<=i;j++){
//                     if ((i+j)%2==0){
//                         System.out.print("1");
//                     }else{
//                         System.out.print("0");
//                     }
//                 }
//                 System.out.println();
//             } 
//     }
//      public static void main(String[] args) {     //triangle pattern  
//          triangle(8);
   
//     }


// public static void butterfully(int n) {

//     // Upper half
//     for(int i=1; i<=n; i++){

//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }

//         for(int j=1; j<=2*(n-i); j++){
//             System.out.print(" ");
//         }

//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }

//         System.out.println();
//     }

//     // Lower half
//     for(int i=n; i>=1; i--){

//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }

//         for(int j=1; j<=2*(n-i); j++){
//             System.out.print(" ");
//         }

//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }

//         System.out.println();
//     }
// }

// public static void main(String[] args) {
//     butterfully(5);
// }



// public static void solidrhombus(int n){
//      for(int i=1; i<n; i++){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=(n-1); j++){
//             System.out.print("*");
//         }
//         System.out.println();
//      }
// }
// public static void main(String[] args){
//     int n=5;
//     solidrhombus(n);
// }


// public static void hollow_rohmbus(int n){
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//         }

//         for(int j=1; j<=n; j++){
//             if(i==1 || i==n || j==1 || j==n){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }}
//     public static void main(String[] args){
//         hollow_rohmbus(5);
    // }


    

}
