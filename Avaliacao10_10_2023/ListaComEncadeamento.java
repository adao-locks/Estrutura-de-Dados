public class ListaComEncadeamento {
    private NoLista first;
    private NoLista last;
    private int counter;

    public ListaComEncadeamento() {
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    public boolean addFirst(Integer obj) {
        NoLista tmp = new NoLista(obj, first);

        if (first == null) {
            first = tmp;
            last = tmp;
        } else {
            tmp.setNext(first);
            first = tmp;
        }

        counter++;
        return true;
    }

    public boolean addLast(Integer obj) {
        NoLista no = new NoLista(obj, null);
        if (first == null) {
            this.first = no;
        } else {
            last.setNext(no);
        }
        this.last = no;
        counter++;
        return true;
    }

    public int size() {
        return this.counter;
    }

    public void clear() {
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    public Integer get(int position) {
        NoLista currentNode = first;
        int count = 0;
        while (count != position) {
            if (currentNode == null) {
                return null;
            }
            currentNode = currentNode.getNext();
            count++;
        }
        if (count == position) {
            if (currentNode == null) {
                return null;
            } else {
                return currentNode.getInfo();
            }
        }
        return null;
    }
    public boolean removeAll(int value) {
        NoLista previous = null;
        NoLista current = first;

        while (current != null) {
            if (current.getInfo() == value) {
                if (previous != null) {
                    previous.setNext(current.getNext());
                } else {
                    first = current.getNext();
                }
            } else {
                previous = current;
            }

            current = current.getNext();
        }
        return true;
    }

    public boolean print(){
        NoLista currentNode = first;

        System.out.print("[");
        while (currentNode != null) {
            System.out.print(currentNode.getInfo() + ", ");

            currentNode = currentNode.getNext();
        }
        System.out.print("]");
        return true;
    }
    public void reverse() {
        NoLista previous = null;
        NoLista current = first;
        NoLista nextNode;

        while (current != null) {
            nextNode = current.getNext();

            current.setNext(previous);

            previous = current;
            current = nextNode;
        }

        first = previous;
    }

}
