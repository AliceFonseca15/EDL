public class deque_simples {
    No head;
    No tail;
    int capacidade;
    public deque_simples(){
        head = null;
        tail = null;
    }
    public int get_capacidade(){
        return capacidade;
    }
    public void soma_capacidade(){
        capacidade += 1;
    }
    public void diminui_capacidade(){
        capacidade -= 1;
    }
    public Object get_primeiro(){
        return head.get_elemento();
    }
    public Object get_ultimo(){
        return tail.get_elemento();
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void inserir_inicio(Object dado){ 
        No novo = new No(dado);
        if (head == null){
            head = novo;
            tail = novo;
        }else{
            novo.set_Next(head);
            head = novo;
        } 
        soma_capacidade();        
    }
    public Object remover_inicio(){ 
        if (head == null){
            throw new RuntimeException("O deque está vazio, insira um elemento");
        }
        Object aux;
        if (head == tail){
            aux = head.get_elemento();
            head = null;
            tail = null;    
        }else{
            aux = head.get_elemento();
            head = head.get_Next();
        }
        diminui_capacidade();
        return aux;
    }
    public void inserir_fim(Object dado){ 
        No novo = new No(dado);
        if (head == null){
            head = novo;
            tail = novo;
        }else{
            if (head == tail){
                tail = novo;
                head.set_Next(novo);
            }else{
                tail.set_Next(novo);
                tail = novo;
            }
        }
        soma_capacidade();
    }
    public Object remover_fim(){ 
        if (head == null){ //               
            throw new RuntimeException("O deque está vazio, insira um elemento");
        }
        Object aux;
        if (head == tail){
            aux = head.get_elemento();
            head = null;
            tail = null;   
        }else{
            No anterior = head;
            No atual = head.get_Next();

            while (atual != tail){ 
                anterior = atual;
                atual = atual.get_Next();

            }
            aux = atual.get_elemento();
            anterior.set_Next(null);
            tail = anterior;
        }
        diminui_capacidade();
        return aux;
    }
}
