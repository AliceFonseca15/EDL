import java.util.Arrays;

public class vetor_array {
    private Object[] array;
    private int capacidade;
    private int tamanho;
    
    Object aux;
    public Object mostrar_vetor(){
        return Arrays.toString(array);
    }
    public vetor_array(int n){
        capacidade = n;
        array = new Object[capacidade];
        tamanho = -1;
    }
    public int size(){
        return tamanho;
    }
    public boolean isEmpty(){
        if (tamanho == -1){
            return true;
        }else{
            return false;
        }
    }
    public Object elemAtRank(int n){
        if (n < 0 || n > tamanho - 1){
            throw new RuntimeException("O tamanho está fora dos limites do array!");
        }else{
            return array[n]; 
        }
    }
    public Object replaceAtRank(int n, Object o){
        if (n < 0 || n > tamanho - 1){
            throw new RuntimeException("O tamanho está fora dos limites do array!");

        }else{
            aux = array[n];
            array[n] = o;
            return aux;
        }
    }
    public void insertAtRank(int n, Object o){
        if (tamanho == capacidade){
            throw new RuntimeException("O array está cheio!");
        }else{
            if (n < 0 || n > tamanho - 1){
                throw new RuntimeException("O tamanho está fora dos limites do array!");
        }else{
                Object[] novo_array = new Object[capacidade];
                for (int i = 0; i < n;i++){
                    novo_array[i] = array[i];
                }

                novo_array[n] = o;

                for (int i = n; i < tamanho; i ++){
                    novo_array[i + 1] =  array[i];
                }
                array = novo_array;

                tamanho++;
            }
        }
    }
    public Object removeAtRank(int n){
        if (isEmpty() == true ){
            throw new RuntimeException("O array está vazio, insira um elemento!");
        }else{
            if (n < 0 || n > tamanho - 1){
                throw new RuntimeException("O tamanho está fora dos limites do array!");
            }else{
                aux = array[n];
                Object[] novo_array = new Object[capacidade];
                for (int i = 0; i < n;i++){
                    novo_array[i] = array[i];
                }

                for (int i = n; i < tamanho; i ++){
                    novo_array[i] =  array[i + 1];
                }
                
                array = novo_array;

                tamanho--;

                return aux;
            }

        }
    }
}
