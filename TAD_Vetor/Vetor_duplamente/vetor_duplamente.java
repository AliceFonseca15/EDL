public class vetor_duplamente {
        No head; 
        No tail;
        int tamanho;
    public vetor_duplamente(){
        head = null;
        tail = null;
        tamanho = -1;
    }

    // Variaveis universais
    int contador = 0; 
    Object aux;


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
    
    public Object elemAtRank(int n){
        No atual = head;
        if (n < 0 || n > size()){
            throw new IndexOutOfBoundsException("O tamanho do Vetor está fora dos limites");
        }else{
           if (isEmpty() ==  true){
            throw new RuntimeException("O Vetor está vazio");
            }else{
                if (size() == 1){ // se a lista tiver so um No
                    aux = head.get_elemento();
                }else{
                    while (contador != n){ // percorre a lista em busca do rank
                        atual = atual.get_Next();
                        contador++;
                    }
                    aux =  atual.get_elemento();
                }
                contador = 0;
                return aux;
            }
        }
    }
    public Object replaceAtRank(int n, Object o){ 
        if (n < 0 || n > size()){
            throw new IndexOutOfBoundsException("O tamanho do Vetor está fora dos limites");
        }else{
           if (isEmpty() ==  true){
            throw new RuntimeException("O Vetor está vazio");
            }else{
                if (size() == 1){ // se a lista tiver um No
                    aux = head.get_elemento();
                    head.set_elemento(o);
                }else{ // Percorre a lista em busca do rank
                    No atual = head;
                    while (contador != n){
                        atual = atual.get_Next();
                        contador++;
                    }
                    aux = atual.get_elemento();
                    atual.set_elemento(o);
                }
                return aux;
            }
        }
    }
    public void insertAtRank(int n, Object o){
        No novo = new No();
        novo.set_elemento(o);
        if (n < 0 || n > size()){
            throw new IndexOutOfBoundsException("O tamanho do Vetor está fora dos limites");
        }else{
            if (isEmpty() ==  true){ // se tiver vazia
                head = novo;
                tail = novo;
            }else{
                if (n == size()){ // se o rank for o ultimo do vetor
                    novo.set_prev(tail);
                    tail.set_Next(novo);
                    tail = novo;
                }else{ // todo o resto
                    No atual = head;
                    while (contador != n){
                        atual = atual.get_Next();
                        contador++;
                    }
                    novo.set_Next(atual); 
                    novo.set_prev(atual.get_prev());
                    atual.get_prev().set_Next(novo);
                    atual.set_prev(novo);
                    contador = 0; 
                    }           
            }
            tamanho++;
        }
    }
    public Object removeAtRank(int n){
        if (n < 0 || n > size()){
            throw new IndexOutOfBoundsException("O tamanho do Vetor está fora dos limites");
        }else{
            if (isEmpty() == true){
                throw new RuntimeException("O Vetor está vazio");
            }else{
                if (size() == 1){ // se o elemento a remover for o primeiro
                    aux = head.get_elemento();
                    head = null;
                    tail = null;
                }else{ // se o elemento a remover for o ultimo
                    if (n == tamanho){
                        aux = tail.get_elemento();
                        tail.get_prev().set_Next(null);
                        tail = tail.get_prev();                       
                    }else{ // todo o resto
                        No atual = head;
                        while (contador != n){
                            atual = atual.get_Next();
                            contador++;
                        }
                        aux = atual.get_elemento();
                        atual.get_prev().set_Next(atual.get_Next());
                        atual.get_Next().set_prev(atual.get_prev());
                    }
                }
                tamanho--;
                return aux;
            }
        }
    }
}
