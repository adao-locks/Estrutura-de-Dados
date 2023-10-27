public class Main {
    public static void main(String[] args) {

        var lista = new ListaComArray();

        System.out.println("A lista está vazia? " + lista.isEmpty());

        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10); //Esse não adiciona pq estrapola o tamanho da coleção.

        lista.clear();

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println(lista.toString());

        lista.remove(3);
        System.out.println(lista.toString());

        System.out.println("A lista está vazia? " + lista.isEmpty());

    }
}