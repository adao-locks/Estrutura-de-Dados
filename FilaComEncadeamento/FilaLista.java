package FilaComEncadeamento;

public class FilaLista {
    private NoLista ini;
    private NoLista fim;
    private int count;

    public FilaLista(){
        this.ini = null;
        this.fim = null;
        this.count = 0;
    }
    public boolean inserir(Integer obj) {
        NoLista no = new NoLista();
        no.setInfo(obj);
        if (ini == null) {
            // Cenário 1: A fila está vazia;
            this.ini = no;
        } else {
            // Cenário 2: A fila já tem itens;
            fim.setProx(no);
        }
        this.fim = no;
        count++;
        return true;
    }
    public Integer retirar() {
        int tmp = ini.getInfo();
        ini = ini.getProx();
        count--;
        return tmp;
    }
    public boolean vazia() {
        return ini == null && fim == null;
    }
    public void libera() {}
    public int size() {
        return count;
    }
}
