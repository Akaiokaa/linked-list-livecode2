import java.text.NumberFormat.Style;

public class Practice {
    public static void main(String[] args) {
        // // System.out.println(head.value);
        // // System.out.println(head.next);
        // Node head = new Node('z', null);
        // Node ryan = new Node('s', null);
        // head.next = ryan;

        // ryan.next = new Node('t', null);

        // ryan.next.next = new Node('x', null);
        // //true
        // System.out.println(contains(head, 's'));
        // //false
        // System.out.println(contains(head, 'a'));
        // // System.out.println(head.next.next.value);
        // remove(head, 't');

        // printList(head);
        myLL<Character> list = new myLL<>();

        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('a');

        list.printList();
        System.out.println();
        list.printBackwards();
        
        myLL<Integer> intList = new myLL<>();
        intList.addToBack(1);
        intList.addToBack(99);
        intList.addToBack(2);
        intList.addToBack(-33333);
        intList.addToBack(67);

    }
    public static void printList(Node start){
        Node current = start;

        while(current != null){
            System.out.println(current.value);;
            current = current.next;
        }
    }

    public static boolean contains( Node start, char toFind){
        Node current = start; 
        while ( current != null ) {
            if(current.value == toFind){ return true; }
            current = current.next;
        };
        return false;
    };

    // Remove the first node that has toRemove
    public static char remove(Node head, char toRemove){
        Node current = head;
        while (current.next  != null) {
            if (current.next.value == toRemove) {
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }
        return '\0';
    }
}
