public class nested_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // for (int i = 5; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        
        char ch = 'A';
        for(int line = 1; line <= 12; line++) {
            for(int star = 1; star <= line; star++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}