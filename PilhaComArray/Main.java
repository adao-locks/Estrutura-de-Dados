public class Main{
    public static void main(String[] args) {
        PilhaComArray pilha = new PilhaComArray();

        pilha.push(5);
        pilha.push(4);
        pilha.push(8);

        pilha.vazia();

        pilha.pop();
        pilha.pop();
        pilha.pop();

        pilha.push(5);
        pilha.push(2);
        pilha.push(6);
        pilha.push(8);

        System.out.println(pilha.toString());
    }
}
