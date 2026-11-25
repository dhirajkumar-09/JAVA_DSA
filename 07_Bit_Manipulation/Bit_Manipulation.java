public class Bit_Manipulation{
    public static int getIthBit(int n, int i){
        int bitMask= 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    
    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n|bitMask;
    }


    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n &bitMask;
    }


    public static int updateIthBit(int n, int i, int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }
    public static int clearIbits(int n, int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }

    public static int clearIbitrange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }


    public static boolean is_power_of_two(int n){
        return (n&(n-1))==0;
    }


    public static int countSetbits(int n){
        int count=0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }


    public static int fastExpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1) !=0){   // check lsb
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println(5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(5<<6);
        // System.out.println(6>>1);
        // System.out.println(getIthBit(10,3));
        // System.out.println(setIthBit(10,2));
        // System.out.println(clearIthBit(10,1));
        // System.out.println(updateIthBit(10,2,1));
        // System.out.println(clearIbits(15, 2));
        // System.out.println(clearIbitrange(10,2,4));
        // System.out.println(clearIbitrange(10,2,4));
        // System.out.println(countSetbits(4));
        System.out.println(fastExpo(3,2));

    }
} 