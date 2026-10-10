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
        public static void main(String[] args) {
            String s = "Ram";

            int[] result = check_vowels_consonants(s);
//            System.out.println(palindrome_number(s));
//            System.out.println("Vowels: " + result[0]);
//            System.out.println("Consonants: " + result[1]);
            String a="Mohan";
            String b="ohanM";
            System.out.println(check_anagrams(a,b));
        }
    }
