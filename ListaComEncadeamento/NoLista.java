public class NoLista {
    private int info;
    private NoLista next;

    public NoLista() {}
    public NoLista(int info, NoLista next) {
        this.info = info;
        this.next = next;
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public NoLista getNext() {
        return next;
    }
    public void setNext(NoLista next) {
        this.next = next;
    }
}
