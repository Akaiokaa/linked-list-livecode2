public class myLL<T> {
    private class Node<E> {
        public E value;
        public Node<E> next;
        public Node<E> prev;

        public Node (Node<E> prev, E value, Node<E> next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
    private Node<T> head;

    public myLL(){
        head = null;
    }
    public void printList(){
        Node<T> current = head;
        
        while(current != null){
            System.out.println(current.value);;
            current = current.next;
        }
    }
    public void printBackwards(){
        Node<T> current = head;
        
        while(current.next != null){
            current = current.next;
        }
        
        while(current != null){
            System.out.println(current.value);
            current = current.prev;
        }
    }
    public void addToBack(T toAdd){
        Node<T> newNode = new Node<T>(null, toAdd, null);

        if(head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        
    }

    public boolean contains( T toFind){
        Node<T> current = head;
        while ( current != null ) {
            if(current.value.equals(toFind)){ return true; }
            current = current.next;
        }

        return false;
    };

    // Remove the first node that has toRemove
    public T remove(T toRemove){
        if (head.equals(null)) {
            return null;
        }
        if (head.value.equals(toRemove)) {
            head = head.next;
        }
        Node<T> current = head;

        while (current.next  != null) {
            if (current.next.value.equals(toRemove)) {
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }
        return null;
    }
}
