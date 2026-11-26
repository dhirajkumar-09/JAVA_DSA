package ArrayList;  // Dynamic Size
//import java.util.ArrayList;
import java.util.*;
public class Array_list { // Premitive data types can not be stored directly
    public static void  swap(ArrayList<Integer>list,int a,int b){
        int temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
    //Container with most water(Brute Force)
    public static int StoreWater(ArrayList<Integer>list_water){
        int maxWater=0;
        for(int i=0;i<list_water.size();i++){
            for(int j=i+1;j<list_water.size();j++){
                int height=Math.min(list_water.get(i),list_water.get(j));
                int width=j-i;
                maxWater=Math.max(maxWater,height*width);
            }
        }
        return maxWater;
    }


    //Container with most water(2 Pointer Approach)
    public static int StoreWater2(ArrayList<Integer>list_water){
        int maxWater=0;
        int left_pointer=0;
        int right_pointer=list_water.size()-1;
        while(left_pointer<right_pointer){
            int height=Math.min(list_water.get(left_pointer),list_water.get(right_pointer));
            int width=right_pointer-left_pointer;
            int current=height*width;
            maxWater=Math.max(maxWater,current);

            //Update Pointer
            if(list_water.get(left_pointer)<list_water.get(right_pointer)){
                left_pointer++;
            }else{
                right_pointer--;
            }
        }
        return maxWater;
    }


    //Pair Sum and list is sorted
    public static boolean Pairsum(ArrayList<Integer>list,int target) {
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }


    //Pair sum by the Pointer approch
    public static boolean check_target_sum(ArrayList<Integer>list,int target) {
        int left_pointer=0;
        int right_pointer=list.size()-1;
        while(left_pointer<right_pointer){
            int current_sum=list.get(left_pointer)+list.get(right_pointer);
            if(current_sum==target){
                return true;
            }
            else if(current_sum>target){
                right_pointer--;
            }else{
                left_pointer++;
            }
        }
        return false;
    }


    // Pair Sum 2 by the Pointer Method
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int pivot = -1;
        // Finding the pivot (largest element)
        for(int i = 0; i < list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                pivot = i;
                break;
            }
        }
        int left_pointer = pivot + 1;  // Smallest element
        int right_pointer = pivot;     // Largest element
        while(left_pointer != right_pointer) {
            // Pair found
            if(list.get(left_pointer) + list.get(right_pointer) == target) {
                return true;
            }
            // Sum is smaller than target
            if(list.get(left_pointer) + list.get(right_pointer) < target) {
                left_pointer = (left_pointer + 1) % list.size();
            }
            // Sum is greater than target
            else {
                right_pointer = (list.size() + right_pointer - 1) % list.size();
            }
        }
        return false;
    }
    void main(){
        ArrayList<Integer> list=new ArrayList<>();   //Syntax
//        list.add(1);   // Complexity is the O(1)
//        list.add(2);
//        list.add(3);
//        System.out.println(list.get(0)); // get individual element from list by passing argument as index for that element
//        list.remove(1);  // removes element at index 1
        // Set
//        list.set(2,10); // a new element 10 is replaced with element at index 2
        // Contains

//        System.out.println(list.contains(1)); // To return True or False if element occurs in given list
//        System.out.println(list);
//        System.out.println(list.size());
//        for(int i=list.size()-1;i>=0;i--){
//            System.out.println(list.get(i)+" ");
//        }
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<list.size();i++){
////            if(list.get(i)>max){
////                max=list.get(i);
//            }
//            max=Math.max(max,list.get(i));
//        }
//
//        System.out.println("Max element of this list is "+max);
//        System.out.println();
//        swap(list,1,2);
//        System.out.println(list);
//        Collections.sort(list);      // Collections is the class and Collection is the interface
//        System.out.println(list);
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println(list);
//        //Multi Dimensional ArrayList
        ArrayList<Integer> list2=new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
        ArrayList<Integer> list3=new ArrayList<>();
//        list3.add(1);
//        list3.add(2);
//        list3.add(3);
//        list3.add(4);
        for(int i=1;i<5;i++){
            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        mainlist.add(list2);
        mainlist.add(list);
        mainlist.add(list3);
        System.out.println(mainlist);
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> temp=mainlist.get(i);
            for(int j=0;j<temp.size();j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
        ArrayList<Integer> List_water=new ArrayList<>();
        List_water.add(1);
        List_water.add(8);
        List_water.add(6);
        List_water.add(2);
        List_water.add(5);
        List_water.add(4);
        List_water.add(8);
        List_water.add(3);
        List_water.add(7);

        System.out.println("Maximum Contain Water in Container is "+StoreWater(List_water));
        System.out.println("Maximum Contain Water in Container is "+StoreWater2(List_water));
        int target=6777;
        Collections.sort(List_water);
        System.out.println("Target present : "+Pairsum(List_water,target));
        System.out.println("Target present : "+check_target_sum(List_water,target));
        System.out.println("Target present : "+pairsum2(List_water,target));
    }
}