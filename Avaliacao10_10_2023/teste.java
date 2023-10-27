public class teste {

    public static void main(String[] args) {
        ListaComEncadeamento lista = new ListaComEncadeamento();
        System.out.println(lista.print()); //fiz o método print porque apenas System.out.println(lista); estava voltando o endereço de memória.
        lista.addFirst(2);
        lista.addFirst(5);
        lista.addFirst(1);
        System.out.println(lista.print());
        lista.addLast(-4);
        lista.addLast(1);
        System.out.println(lista.print());
        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println(lista.get(7));
        lista.removeAll(1);
        System.out.println(lista.print());
        lista.reverse();
        System.out.println(lista.print());
        lista.addFirst(90);
        System.out.println(lista.print());
        System.out.println(lista.size());
        lista.clear();
        System.out.println(lista.print());
    }
}
