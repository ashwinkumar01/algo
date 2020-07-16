class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

 public class ReverseLinkedList {
    ListNode temp, prev, head;
    public ListNode reverseList(ListNode A) {
        if (A.next == null) {
            head = A;
            return A;
        }

        reverseList(A.next);
        temp = A;
        prev = A.next;
        prev.next = temp;
        temp.next = null;

        return head;

    }

     public static void main(String [] args) {
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);

         ReverseLinkedList reverse = new ReverseLinkedList();
         head = reverse.reverseList(head);
         System.out.println(head.val);
     }
}

