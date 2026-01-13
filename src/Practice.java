import java.text.NumberFormat.Style;

public class Practice {
    public static void main(String[] args) {
        // System.out.println(head.value);
        // System.out.println(head.next);
        Node head = new Node('z', null);
        Node ryan = new Node('s', null);

        head.next = ryan;

        ryan.next = new Node('t', null);

        ryan.next.next = new Node('x', null);
        head.next.next.next.next = new Node('d', null);
        // System.out.println(head.next.next.value);

        printList(head);
    }
    public static void printList(Node start){
        Node current = start;

        while(current != null){
            System.out.println(current.value);;
            current = current.next;
        }
    }
}
