package FilaComEncadeamento;

public class NoLista {
    private Integer info;
    private NoLista prox;

    public NoLista(){
        this.info = null;
        this.prox = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoLista getProx() {
        return prox;
    }

    public void setProx(NoLista prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
