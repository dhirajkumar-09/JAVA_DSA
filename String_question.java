import java.util.*;
//Reverse a String
public class String_question {
    public static String reverse_string(String s){
        char[] c=s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++; j--;
        }
        return new String(c);
    }

    //Check Palindrome Numbers
    public static boolean palindrome_number(String s){
        char[] c=s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++; j--;
        }
        String str= new String(c);
        return str==s;

    }


    // Count Vowels and Consonants
    public static int[] check_vowels_consonants(String s) {
        String str = s.toLowerCase();
        int count = 0;
        int count_consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    count++;
                } else {
                    count_consonants += 1;
                }
            }
        }
        return new int[]{count, count_consonants};
    }

    // Check anagrams
    public static boolean check_anagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] c = a.toLowerCase().toCharArray();
        char[] characters = b.toLowerCase().toCharArray();

        Arrays.sort(c);
        Arrays.sort(characters);

        return Arrays.equals(c, characters);
    }

    //Count characters
    public static int count_character(String str,char a){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==a){
                count+=1;
            }
        }
        return count;
    }

    //Check frequency of character
    // Count how many times each lowercase letter appears in the string
    public static void check_frequency(String s) {
        int[] freq = new int[26];   // 26 boxes: index 0 = 'a', 1 = 'b', ..., 25 = 'z'

        for (int i = 0; i < s.length(); i++) {
            // 'c' - 'a' gives the box number of letter c, then add 1 to that box
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {   // print only letters that appeared
                // (char)('a' + i) converts box number back to the letter
                System.out.println((char) ('a' + i) + " = " + freq[i]);
            }
        }
    }

    //First_Non_Repeating character
    public static char firstNonRepeating(String s) {
        s = s.toLowerCase();
        int[] freq = new int[26];
        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return '_';
    }


    public static int count_words(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++; // a new word start here and counting increase with 1
            }
        }
        return count;
    }


    public static void main(String[] args) {
            String s = "Ram";

            int[] result = check_vowels_consonants(s);
//            System.out.println(palindrome_number(s));
//            System.out.println("Vowels: " + result[0]);
//            System.out.println("Consonants: " + result[1]);
//            String a="Mohan";
            String b="ohanM";
            String str="banana";
            char a='x';
//            System.out.println(check_anagrams(a,b));
//            System.out.print(count_character(str,a));
            check_frequency("mango");
            System.out.println("first non- repeating character is :"+firstNonRepeating(s));
            System.out.println("No. of words presents in given sentences is : "+count_words(s));
        }
    }
