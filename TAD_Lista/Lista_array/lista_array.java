import java.util.Arrays;
class lista_array {
    private Object[] array;
    private int capacidade;
    private int tamanho;
    public lista_array(int n){
        capacidade = n;
        tamanho = -1;
        array = new Object[capacidade];
    }
    // Variaveis universais
    Object aux;
    public Object mostrar_array(){
       return Arrays.toString(array);
    }
    public int size(){
        return tamanho + 1;
    }

    public boolean isEmpty(){
        if (tamanho == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFirst(int n){ 
        if (n == 0){
            return true;
        }else{
            return false;
        }       
    }

    public boolean isLast(int n){
        if (n == tamanho){
            return true;
        }else{
            return false;
        }
    }
 
    public Object First(){
        return array[0];
    }

    public Object Last(){
        return array[tamanho];
    }
    public Object before(int n){
        return array[n - 1];
    }
    public Object after(int n){
        return array[n + 1];
    }
    public Object replaceElement(int n, Object o){
        if (n > capacidade){
            throw new RuntimeException("O indice é maior que a capacidade da lista");
        }else{
            if (isEmpty()){
                throw new RuntimeException("A lista está vazia");
            }else{
                aux = array[n];
                array[n] = o;
            }
            return aux;

        }
    }
    public void swapElements(int n, int m){
        if (n > tamanho || m > tamanho || n < 0 || m < 0){
            throw new RuntimeException("O indice está fora dos limites da lista");
        }else{
            if (isEmpty()){
                throw new RuntimeException("A lista está vazia");
            }else{
                aux = array[n];
                array[n] = array[m];
                array[m] = aux;
                }
            }
    }
    public void insertBefore(int n, Object o){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }else{
            if (n < 0 || n > tamanho){
                throw new RuntimeException("O indice é maior que a capacidade da lista");
            }else{  
                if (tamanho + 1 == capacidade){
                    throw new RuntimeException("A lista está cheia");    
                }else{
                    Object[] novo_array = new Object[capacidade];
                    for (int i = 0; i < n; i++){
                        novo_array[i] = array[i];
                    }
                    novo_array[n] = o;

                    for (int i = n; i < size();i++){
                        novo_array[i + 1] = array[i];
                    }
                    array = novo_array;
                    tamanho++; 
                }     
            }
        }
    }
    public void insertAfter(int n, Object o){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }else{
            if (n < 0 || n > tamanho){
                throw new RuntimeException("O indice é maior que a capacidade da lista");
            }else{
                if (tamanho + 1 == capacidade){
                    throw new RuntimeException("A lista está cheia");
                }else{
                    Object[] novo_array = new Object[capacidade];
                    for (int i = 0; i <= n; i++){
                        novo_array[i] = array[i];
                    }

                    novo_array[n+1] = o;

                    for (int i = n+1; i < size(); i ++){
                        novo_array[i + 1] =  array[i];
                    }
                    array = novo_array;
                    tamanho++;
                }
            }
        }
    }
    public void insertFirst(Object o){
        if (isEmpty()){
            array[0] = o;
            tamanho++;
        }else{
            if (tamanho + 1 == capacidade){
                throw new RuntimeException("A lista está cheia");
            }else{
                Object[] novo_array = new Object[capacidade];
                novo_array[0] = o;
                for (int i = 0; i <= tamanho;i++){
                    novo_array[i+1] = array[i];
                }
                array = novo_array;

            }
            tamanho++;
        }
    }
    public void insertLast(Object o){
        if (isEmpty()){
            array[0] = o;
        }else{
            if (tamanho + 1 == capacidade){
                throw new RuntimeException("A lista está cheia");
            }else{
                array[tamanho + 1] = o;
            }
        }
        tamanho++;
    }
    public Object remove(int n){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }else{
            if (n < 0 || n > tamanho){
                throw new RuntimeException("O indice é maior que a capacidade da lista");
            }else{
                if (n == tamanho){
                    Object[] novo_array = new Object[capacidade];
                    aux = array[n];
                    for (int i = 0; i < n;i ++){
                        novo_array[i] = array[i];
                    }
                    array = novo_array;                  
                }else{
                    Object[] novo_array = new Object[capacidade];
                    aux = array[n];
                    for (int i = 0; i < n;i ++){
                        novo_array[i] = array[i];
                    }
                    for (int i = n; i < tamanho;i ++){
                        novo_array[i] = array[i + 1];
                    }
                    array = novo_array;
                    
                }
            tamanho--;
            return aux;
            }
        }
    }
}
