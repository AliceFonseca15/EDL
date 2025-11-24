public class vetor_duplamente {
        No head; 
        No tail;
        int tamanho;
    public vetor_duplamente(){
        head = new No();
        tail = new No();
        head.set_Next(tail);
        tail.set_prev(head);
        tamanho = -1;
    }

    // Variaveis universais
    Object aux;

    public No percorre_vetor(No atual, int n){
        for (int i = 0; i < n; i++){
            atual = atual.get_Next();
        }
        return atual;
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
    public Object elemAtRank(int n){
        No atual = head.get_Next();
        if (n < 0 || n > size()){
            throw new IndexOutOfBoundsException("O tamanho do Vetor está fora dos limites");
        }else{
           if (isEmpty()){
            throw new RuntimeException("O Vetor está vazio");
            }else{
                if (size() == 1){ // se a lista tiver so um No
                    aux = head.get_Next().get_elemento();
                }else{
                    atual = percorre_vetor(atual, n);
                    aux =  atual.get_elemento();
                }
                return aux;
            }
        }
    }
    public Object replaceAtRank(int n, Object o){ 
        if (n < 0 || n > size()){
            throw new IndexOutOfBoundsException("O tamanho do Vetor está fora dos limites");
        }else{
           if (isEmpty()){
            throw new RuntimeException("O Vetor está vazio");
            }else{
                if (size() == 1){ // se a lista tiver um No
                    aux = head.get_Next().get_elemento();
                    head.get_Next().set_elemento(o);
                }else{ // Percorre a lista em busca do rank
                    No atual = head.get_Next();
                    atual = percorre_vetor(atual, n);
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
        if (isEmpty()){ // se tiver vazia
                head.set_Next(novo);
                tail.set_prev(novo);

                novo.set_prev(head);
                novo.set_Next(tail);
                tamanho++;
        
        }else{  
            if (n < 0 || n > size() + 1){
                throw new IndexOutOfBoundsException("O tamanho do Vetor está fora dos limites");
            }else{
                No atual = head.get_Next();                 
                atual = percorre_vetor(atual, n);
                novo.set_Next(atual); 
                novo.set_prev(atual.get_prev());
                atual.get_prev().set_Next(novo);
                atual.set_prev(novo);
                
                tamanho++;
            }
            
        }
    }
    public Object removeAtRank(int n){
        if (n < 0 || n > size()){
            throw new IndexOutOfBoundsException("O tamanho do Vetor está fora dos limites");
        }else{
            if (isEmpty()){
                throw new RuntimeException("O Vetor está vazio");
            }else{
                    No atual = head.get_Next();
                    atual = percorre_vetor(atual, n);
                    aux = atual.get_elemento();
                    atual.get_prev().set_Next(atual.get_Next());
                    atual.get_Next().set_prev(atual.get_prev()); 
                    tamanho--;  
                    return aux;                
                }   
        }
    }
}
    

