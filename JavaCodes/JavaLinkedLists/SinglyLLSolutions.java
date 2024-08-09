public class SinglyLLSolutions {
    public SinglyLLNode insetAtHead(SinglyLLNode head, int data) {
        SinglyLLNode newNode = new SinglyLLNode(data);
        newNode.next = head;
        return newNode;
    }

    public SinglyLLNode insertAtTail(SinglyLLNode head, int data) {
        SinglyLLNode newNode = new SinglyLLNode(data);
        if (head == null) {
            return newNode;
        }
        SinglyLLNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public void traverse(SinglyLLNode head) {
        SinglyLLNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLLNode head = null;
        SinglyLLSolutions slls = new SinglyLLSolutions();
        head = slls.insetAtHead(head, 1);
        head = slls.insetAtHead(head, 2);
        head = slls.insetAtHead(head, 3);

        head = slls.insertAtTail(head, 4);
        head = slls.insertAtTail(head, 5);
        head = slls.insertAtTail(head, 6);

        slls.traverse(head);
    }
}