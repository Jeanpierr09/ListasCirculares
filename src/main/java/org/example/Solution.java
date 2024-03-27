package org.example;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare = head.next;

        while (hare != null && hare.next != null) {
            if (tortoise == hare) {
                return true;
            }
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplo 1
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creando el ciclo
        System.out.println(solution.hasCycle(head));  // true

        // Ejemplo 2
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = head1; // Creando el ciclo
        System.out.println(solution.hasCycle(head1));  // true

        // Ejemplo 3
        ListNode head2 = new ListNode(1);
        System.out.println(solution.hasCycle(head2));  // false
    }
}
