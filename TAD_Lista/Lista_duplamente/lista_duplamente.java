import java.util.Arrays;
public class lista_duplamente {
    No head;
    No tail;
    int tamanho ;
    public lista_duplamente(){
        tamanho = -1;
        head = new No();
        tail = new No();
        head.set_Next(tail);
        tail.set_prev(head);
    }
    // Variaveis universais
    Object aux;

    public Object mostrar_lista(){
        Object[] elementos = new Object[5];
        No atual = head.get_Next();
        for (int i = 0; i <= tamanho; i++){
            elementos[i] = atual.get_elemento();
            atual = atual.get_Next();
        }
        return Arrays.toString(elementos);
    }
    public int size(){
        return tamanho + 1;
    }
    public boolean isEmpty(){
        if (tamanho == -1){
            return true;
        }{
            return false;
        }
    }
    public boolean isFirst(No n){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }else{
            if (head.get_Next() == n){
                return true;
            }else{
                return false;
            } 
        }
    }
    public boolean isLast(No n){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }else{
            if (tail.get_prev() == n){
                return true;
            }else{
                return false;
            }
        }
    }
    public Object First(){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        return head.get_Next().get_elemento();
    }
    public Object Last(){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        return tail.get_prev().get_elemento();
    }
    public Object before(No n){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        if (n == head.get_Next()){
            throw new RuntimeException(n + "é o primeiro da lista");
        }
        aux = n.get_prev().get_elemento();
        return aux;       
    }
    public Object after(No n){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        if (n == tail.get_prev()){
            throw new RuntimeException(n + "é o último da lista");
        }       
        aux = n.get_Next().get_elemento();
        return aux;

    }
    public Object replaceElement(No n,Object o){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        aux = n.get_elemento();
        n.set_elemento(o);
        return aux;      
    }
    public void swapElements(No n, No m){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        aux = n.get_elemento();
        n.set_elemento(m.get_elemento());
        m.set_elemento(aux);       
    }
    public void insertBefore(No n,Object o){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        No novo = new No();
        novo.set_elemento(o);

        novo.set_prev(n.get_prev());
        novo.set_Next(n);
        n.get_prev().set_Next(novo);
        n.set_prev(novo);
        tamanho++;
    }
    public void insertAfter(No n, Object o){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        No novo = new No();
        novo.set_elemento(o);

        novo.set_Next(n.get_Next());
        novo.set_prev(n);
        n.get_Next().set_prev(novo);
        n.set_Next(novo); 
        tamanho++;       
    }
    public void insertFirst(Object o){
        No novo = new No();
        novo.set_elemento(o);

        head.get_Next().set_prev(novo);
        novo.set_Next(head.get_Next());
        head.set_Next(novo);
        novo.set_prev(head);

        tamanho++;
    }     
    public void insertLast(Object o){
        No novo = new No();
        novo.set_elemento(o);
        
        tail.get_prev().set_Next(novo);
        novo.set_prev(tail.get_prev());
        tail.set_prev(novo);
        novo.set_Next(tail);
    
        tamanho++;
    }
    public Object remove(No n){
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        if (n == head || n == tail){
            throw new RuntimeException("Sentinelas não podem ser removidos");
        }
        aux = n.get_elemento();
        n.get_Next().set_prev(n.get_prev());
        n.get_prev().set_Next(n.get_Next());
        n.set_Next(null);
        n.set_prev(null);  
        tamanho--;      
        return aux;
    }
}
