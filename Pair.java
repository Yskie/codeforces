public class Pair {
    Integer head;
    Integer tail;

    public Pair(int head, int tail) {  
        this.head = head;
        this.tail = tail;  
    }  

    public int getHead() {
        return this.head;
    }

    public int getTail() {
        return this.tail;
    }
    
    @Override
    public String toString() {
        return head.toString() + " " + tail.toString();
    }

    //lst.sort(Comparator.comparing(Pair::getHead));

}