public class ListaComArray {
    private Integer[] array;
    private boolean resizable;
    private int initialCapacity;
    private int counter;
    private final static int X = 10;

    public ListaComArray(){
        this.initialCapacity = this.X;
        this.counter = 0;
        this.array = new Integer[this.X];
        this.resizable = false;
    }

    /**
     * Adiciona o elemento passado por parâmetro ao final da lista. Caso
     * a lista seja redimensionável faz a chamada para o método responsável
     * por redimensionar o array.
     * Retorna verdadeiro se foi possível e falso se não foi possível
     * adicioná-lo.
     *
     */
    public boolean add(Integer value){
        if(resizable){
            resizeArrayList();
        }
        else if(this.counter == array.length){
            return false;
        }

        array[this.counter] = value;

        this.counter++;

        return true;
    }

    public boolean add(int index, Integer value){
        return true;
    }
    private void resizeArrayList(){
        int tam = array.length + X;
        Integer novo[] = new Integer[tam];
        for (int i = 0; i < array.length; i++) {
            novo[i] = array[i];
        }
        array = novo;
    }
    public Integer remove(int indice){
        if(indice < 0 || indice >= counter){
            return null;
        }
        var valorRemovido = array[indice];

        for(; indice < counter -1; indice++){
            array[indice] = array[indice + 1];
        }

        counter--;

        return valorRemovido;
    }
    public boolean removeFirst(Integer valor){
        for (int i = 0; i < counter; i++) {
            if (array[i].equals(valor)) {
                remove(i);
                return true;
            }
        }
        return false;
    }
    public Integer get(int indice){
        if(indice >= 0 && indice < this.counter){
            return this.array[indice];
        }

        return null;
    }
    public void clear(){
        this.counter = 0;
        // if (resizable) {
        this.array = new Integer[initialCapacity];
        // }
    }
    public Integer set(int index, Integer obj){
        if (index > 0 || index >= counter) {
            return null;
        }
        Integer tmp = array[index];
        array[index] = obj;
        return tmp;
    }
    public int size(){
        return this.counter;
    }
    public boolean isEmpty(){
        return this.counter == 0;
    }
    public boolean isFull(){
        if (resizable) {
            return counter == array.length;
        }
        return false;
    }
    public boolean contains(){
        return false;
    }
    public int indexOf(Integer object){
        return 0;
    }
    public int lastIndexOf(Integer object){
        return 0;
    }
    public Integer[] toArray(){
        Integer novoArray[] = new Integer[10];
        return novoArray;
    }
    @Override
    public String toString(){
        var saida = "";
        for(int i = 0; i < counter; i++){
            saida += array[i] + " ";
        }
        return saida;
    }
}
