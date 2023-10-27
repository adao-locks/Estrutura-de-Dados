public class PilhaComArray{
    private int n;
    private int tam = 10;
    int count = 0;
    int vet[] = new int[tam];

    public PilhaComArray() {
        n = -1;
    }

    public boolean push(int valor) {
        if (n >= (tam-1)) {
            System.out.println("Estourou a pilha!");
            return false;
        } else {
            System.out.println("Valor Adicionado!");
            vet[++n] = valor;
            count++;
            return true;
        }
    }

    public Integer pop() {
        Integer tmp = vet[n];
        n--;
        count--;
        return tmp;
    }

    public boolean vazia() {
        if (n == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        n = 0;
        tam = 10;
    }

    @Override
    public String toString() {
        var saida = "";
        for(int i = 0; i < count; i++){
            saida += vet[i] + "\n";
        }
        return saida;
    }
}
