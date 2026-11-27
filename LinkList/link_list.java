package LinkList;

public class link_list {

    // --- 1. NODE DEFINITION ---
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail pointers for the LinkedList
    public static Node head;
    public static Node tail;
    public static int size = 0;

    // --- 2. INSERTION OPERATIONS ---

    // Add at the beginning: O(1)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        // Base case: list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link new node to current head, then shift head
        newNode.next = head;
        head = newNode;
    }

    // Add at the end: O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        // Base case: list is empty
        if (tail == null) {
            head = tail = newNode;
            return;
        }

        // Link current tail to new node, then shift tail
        tail.next = newNode;
        tail = newNode;
    }

    // Add at a specific index (0-based): O(n)
    public void addMiddle(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index: " + index);
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

        // Link newNode to next node first, then link previous node to newNode
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // --- 3. DISPLAY / TRAVERSAL ---

    // Print entire list: O(n)
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // --- 4. DELETION OPERATIONS ---

    // Remove first element: O(1)
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

    // Remove last element: O(n)
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

        // Traverse to second-to-last node (index size - 2)
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

    // --- 5. SEARCH OPERATIONS ---

    // Iterative Search: O(n)
    public int iterationSearch(int key) {
        Node temp = head;
        int i = 0;
        // Check until temp is null (checks all nodes including last)
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search: O(n)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recurssiveSearch(int key) {
        return helper(head, key);
    }

    // --- 6. ADVANCED MANIPULATIONS ---

    // Reverse LinkedList (3-Pointer Approach: prev, curr, next): O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next; // 1. Save next node
            curr.next = prev; // 2. Reverse pointer direction
            prev = curr;      // 3. Move prev forward
            curr = next;      // 4. Move curr forward
        }
        head = prev;          // Update head to last non-null node
    }

    // Delete Nth node from end: O(n)
    public void delete_Nth_Node_from_end(int n) {
        if (n <= 0 || n > size) {
            System.out.println("Invalid n: " + n);
            return;
        }

        // If deleting the head node
        if (n == size) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }

        // Find (size - n)th node from start (1-based index)
        int i = 1;
        int targetIdx = size - n;
        Node prev = head;
        while (i < targetIdx) {
            prev = prev.next;
            i++;
        }

        // If deleting tail, update tail pointer
        if (prev.next == tail) {
            tail = prev;
        }
        prev.next = prev.next.next;
        size--;
    }

    // Find Middle using Slow-Fast Approach (Tortoise and Hare): O(n)
    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       // +1 step
            fast = fast.next.next;  // +2 steps
        }
        return slow; // Points to middle node
    }

    // Check if LinkedList is Palindrome: O(n) Time, O(1) Space
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle node
        Node midNode = findMiddle(head);

        // Step 2: Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare left half and right half
        Node right = prev; // Head of reversed right half
        Node left = head;  // Head of left half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // --- 7. MAIN METHOD ---
    public static void main(String[] args) {
        link_list list = new link_list();

        System.out.println("=== 1. Basic Insertions ===");
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        list.addLast(50);
        list.print(); // 30 -> 20 -> 10 -> 40 -> 50 -> null
        System.out.println("Current Size: " + size);

        System.out.println("\n=== 2. Add in Middle (index 2) ===");
        list.addMiddle(200, 2);
        list.print(); // 30 -> 20 -> 200 -> 10 -> 40 -> 50 -> null
        System.out.println("Current Size: " + size);

        System.out.println("\n=== 3. Deletions ===");
        System.out.println("Removed First: " + list.removefirst()); // 30
        System.out.println("Removed Last: " + list.removeLast());   // 50
        list.print(); // 20 -> 200 -> 10 -> 40 -> null
        System.out.println("Current Size: " + size);

        System.out.println("\n=== 4. Searching ===");
        System.out.println("Iterative search for 10: Index " + list.iterationSearch(10));
        System.out.println("Iterative search for 99 (not present): " + list.iterationSearch(99));
        System.out.println("Recursive search for 200: Index " + list.recurssiveSearch(200));

        System.out.println("\n=== 5. Reverse LinkedList ===");
        list.reverse();
        list.print(); // 40 -> 10 -> 200 -> 20 -> null

        System.out.println("\n=== 6. Delete Nth From End (n = 2) ===");
        list.delete_Nth_Node_from_end(2); // deletes 200
        list.print(); // 40 -> 10 -> 20 -> null
        System.out.println("Current Size: " + size);

        System.out.println("\n=== 7. Palindrome Check ===");
        System.out.println("Is list palindrome? " + list.checkPalindrome());

        // Test with palindrome list
        link_list palinList = new link_list();
        head = null; tail = null; size = 0; // reset static state
        palinList.addLast(1);
        palinList.addLast(2);
        palinList.addLast(2);
        palinList.addLast(1);
        palinList.print();
        System.out.println("Is palinList palindrome? " + palinList.checkPalindrome());
    }
}
