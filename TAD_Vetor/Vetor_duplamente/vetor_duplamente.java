public class vetor_duplamente {
        No head; // No sentinela 
        No tail;
        int tamanho;
    public vetor_duplamente(){
        head = null;
        tail = null;
    }
    // Variaveis universais
    int contador; 
    Object aux;
    public int size(){
        return tamanho;
    }
    public boolean isEmpty(){
        if (head.get_Next() == null){
            return true;
        }else{
            return false;
        }
    }
    public Object elemAtRank(int n){
        if (n < 0 || n >= tamanho){
            throw new RuntimeException("O tamanho do Vetor está fora dos limites");
        }
        if (isEmpty() == true){
            throw new RuntimeException("O Vetor está vazio");       
        }

        No atual = head.get_Next();
        if (n < tamanho / 2){
            while (contador != n){
                atual = atual.get_Next();
                contador += 1;
            }
            aux = atual.get_elemento();
        }else{
            atual = tail.get_prev();
            contador = tamanho - 1;
            while (contador > n){
                atual = atual.get_prev();
                contador -= 1;
            }
            aux = atual.get_elemento();
        }
        contador = 0;      
        return aux;
    }

    public Object replaceAtRank(int n, Object o){
        if (n < 0 || n >= tamanho){
            throw new RuntimeException("O tamanho do Vetor está fora dos limites");
        }
        No atual = head.get_Next();
        if (n < tamanho / 2){
            while (contador != n){
                atual = atual.get_Next();
                contador += 1;
            }
            aux = atual.get_elemento();
            atual.set_elemento(o);
        }else{
            atual = tail.get_prev();
            contador = tamanho - 1;
            while (contador > n){
                atual = atual.get_prev();
                contador -= 1;
            }
            aux = atual.get_elemento();
            atual.set_elemento(o);
        }
        contador = 0; 
        return aux;
    }
    public void insertAtRank(int n, Object o){
        if (n < 0 || n >= tamanho){
            throw new RuntimeException("O tamanho do Vetor está fora dos limites");
        }
        if (isEmpty() == true){
            throw new RuntimeException("O Vetor está vazio"); // caso vazio
        }else{
            if (head.get_Next() == tail.get_prev()){  // caso um elemento
                No novo_elemento = new No(o);
                novo_elemento.set_prev(head);
                novo_elemento.set_Next(tail);
                head.set_Next(novo_elemento);
                tail.set_prev(novo_elemento);
            }else{
                No novo_elemento = new No(o);
                No atual = head.get_Next();
                if (n < tamanho / 2){
                    while (contador != n){
                        atual = atual.get_Next();
                        contador += 1;
                    }
                    novo_elemento.set_Next(atual);
                    novo_elemento.set_prev(atual.get_prev());
                    atual.get_prev().set_next(novo_elemento);
                    atual.set_prev(novo_elemento);
                                        
                }else{
                    atual = tail.get_prev();
                    contador = tamanho - 1;
                    while (contador > n){
                        atual = atual.get_prev();
                        contador -= 1;
                    }
                    novo_elemento.set_Next(atual);
                    novo_elemento.set_prev(atual.get_prev());
                    atual.get_prev().set_next(novo_elemento);
                    atual.set_prev(novo_elemento);

                }
                contador = 0;
                tamanho++;
            }
        }
    }
    public Object removeAtRank(int n){
        if (n < 0 || n >= tamanho){
            throw new RuntimeException("O tamanho do Vetor está fora dos limites");
        }
        if (isEmpty() ==  true){
            throw new RuntimeException("O Vetor está vazio"); 
        }
        if (head.get_Next() == tail.get_prev()){  // caso um elemento
                aux = head.get_Next().get_elemento();
                head.set_Next(null);
                tail.set_prev(null);
                return aux;
        }else{
                No atual = head.get_Next();
                if (n < tamanho / 2){
                    while (contador != n){
                        atual = atual.get_Next();
                        contador += 1;
                    }
                    aux = atual.get_elemento();
                    atual.get_prev().set_Next(atual.get_Next());
                    atual.get_next().set_prev(atual.get_prev());
                                        
                }else{
                    atual = tail.get_prev();
                    contador = tamanho - 1;
                    while (contador > n){
                        atual = atual.get_prev();
                        contador -= 1;
                    }
                    aux = atual.get_elemento();
                    atual.get_prev().set_Next(atual.get_Next());
                    atual.get_next().set_prev(atual.get_prev());
                }
                contador = 0;
                tamanho--;
                return aux;
        }
    }
}