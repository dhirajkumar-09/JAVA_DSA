package LinkList;

public class link_list {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // Add at First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    // Print Linked List
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add at Middle / Given Index (0-based)
    public void addMiddle(int data, int index) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // Remove First
    public int removefirst() {

        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return val;
    }

    // Remove Last
    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //Search(Iterative) Search a key in a linked list.Return the position where it is found , if not found return -1:
    public int iterationSearch(int key){
        Node temp = head;
        int i=0;
        while (temp.next != null) {
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    //Search(Recursive) Search for a key in a linked list. Return the position where it is found. if not found, return -1.
    public int helper(Node head,int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx=helper(head.next,key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recurssiveSearch(int key){
        return helper(head,key);
    }


    // Reverse a link list
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    // Delete nth node from end
    public void delete_Nth_Node_from_end(int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==n){
            head=head.next;
            return;
        }
        int i=1;
        int j=size-n;
        Node prev=head;
        while (i<j){
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return;
    }


    // Check if link list is a Palindrome through slow-fast approach
    public Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;
    }


    public boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        Node midNode=findMiddle(head);
        Node prev=null;
        Node curr=midNode;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; //right half head
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    void main() {

        link_list linklist = new link_list();

        linklist.addFirst(10);
        linklist.addFirst(20);
        linklist.addFirst(30);
        linklist.addLast(40);
        linklist.addLast(50);
        System.out.println(linklist.head.next.data);
        System.out.println(linklist.tail.data);
        linklist.addMiddle(200, 2);
        linklist.print();
        System.out.println("Size: " + size);
        linklist.removefirst();
        linklist.removeLast();
        linklist.print();
        System.out.println("index of element if whose present in linklist : "+linklist.iterationSearch(100));
        System.out.println("Size: " + size);
        System.out.println(linklist.helper(linklist.head,10));
//        linklist.reverse();
//        linklist.print();
//        linklist.delete_Nth_Node_from_end(10);
//        linklist.print();
        System.out.println(linklist.checkPalindrome());
    }
}