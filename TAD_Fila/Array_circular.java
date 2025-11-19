public class Array_circular {
    private Object[] array;
    private int i;
    private int f;
    private int tamanho;
    private int capacidade = 5;
    public Array_circular(){
        array = new Object[capacidade];
        tamanho = 0;
        i = 0;
        f = 0;
    }

    // Variavel Universal
    Object aux;
    public void redimensionar(){
        int nova_capacidade = capacidade * 2;
        Object[] novo_array = new Object[nova_capacidade];
        for (int n = 0; n < tamanho; n++){
            int indice = (i + n) % capacidade;
            novo_array[n] = array[indice];
        }
        capacidade = nova_capacidade;
        array = novo_array;
        i = 0;
        f = tamanho;
    }
    public int size(){
        return (capacidade - i + f) / capacidade;
    }
    public boolean isEmpty(){
        if (tamanho == 0){
            return true;
        }else{
            return false;
        }
    }

    public void enqueue(Object o){
        if (capacidade == tamanho){
            redimensionar();
        }
        array[f] = o;
        f = (f + 1) % capacidade;
        tamanho++;
    }

    public Object dequeue(){
        if (isEmpty()){
            throw new RuntimeException("A fila está vazia!");
        }
        aux = array[i];
        i = (i + 1) % capacidade;
        tamanho--;
        return aux;
    }
    public Object First(){
        if (isEmpty()){
            throw new RuntimeException("A fila está vazia!");
        }
        return array[i];
    }




}
