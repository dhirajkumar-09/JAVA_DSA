import java.util.*;
public class StringDemo{
//     public static void Stringchar(String fullname){
//         for(int i=0; i<fullname.length(); i++){
//             System.out.print(fullname.charAt(i)+" ");
//         }
//         System.out.println();
//     }


    public static boolean checkpalindrome(String fullname){    // time complexity O(n)
        int n=fullname.length();
        for(int i=0; i<n/2;i++){
            if (fullname.charAt(i)==fullname.charAt(n-i-1)){
                return true;
            }
        }
        return false;
    }

    
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);
            if(dir=='S' || dir=='s'){
                y--;
            }else if (dir=='N' || dir=='n'){
                y++;
            } else if(dir=='E' || dir=='e'){
                x++;                
            }else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }


    public static String substring(String str, int si , int ei){   //str is the string , si is the starting index and ei is the ending index 
        String substr="";
         for(int i=si; i<ei; i++){
            substr += str.charAt(i);
         }
         return substr;
    }


    public static String toUppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    
    public static String compress(String str){ // solve it by stringbuilder function builder method 
        String newStr="";
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr +=count.toString();
            }
        }
        return newStr;
    }


    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);  // input/output of string 
        // String name;
        // System.out.print("Enter your name: ");
        // name = sc.nextLine();
        // System.out.print(name);

        
        // Concatenation
        String Firstname="Dhiraj";
        String Lastname="Kumar";
        String fullname= Firstname+" "+Lastname;
        // System.out.println(fullname);
        // System.out.println(fullname.charAt(1));  // find character of string at given index
        // Stringchar(fullname);
        // System.out.println(checkpalindrome(fullname));
        // String path="WnEENESENNN";
        // System.out.println(getShortestPath(path));

        // Comparison between Strings
        // String s1="car";
        // String s2="car";
        // String s3= new String("car");

        // if (s1==s2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Not equal");
        // }
        
        //  if (s1==s3){                 // wrong answer 
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Not equal");
        // }
        

        // if(s1.equals(s3)){                    // this function checks only value of s1 and s3 
        //     System.out.println("Strings are equal");     // prefer method
        // }else{
        //      System.out.println("Not equal");
        // }



        // Substring 
        // String str="helloworld";
        // System.out.println(substring(str, 2, 5));
        // System.out.println(str.substring(2,5));   // inbuild java functions


        // find largest string 
        // String fruits[]={"apple","banana","mango"};  // lexicographically 
        // String largest=fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest=fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // how to works strings in computer 


        // String builder(Most prefer , this works same like as String dataType but this this memory efficient )
        // StringBuilder sb= new StringBuilder("");
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch);  // adding char in the last of string 
        // }
        // System.out.println(sb);
        // System.out.println(sb.length());


        // Uppercase-Builder
        // String str="hello I am dhiraj";
        // System.out.println(toUppercase(str));


        // String Compression 
        String str="aaaabbb";
        System.out.println(compress(str));
    }
}