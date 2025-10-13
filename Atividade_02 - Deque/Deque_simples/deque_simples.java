package Deque_simples;

public class deque_simples {
    No head;
    No tail;
    int capacidade;
    public deque_simples(){
        head = null;
        tail = null;
    }
    public int get_size(){
        return capacidade;
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
    public void inserir_inicio(int dado){ // 0(1) - > Pois cada "ação" só ocorre uma vez
        No novo = new No(dado);
        if (head == null){
            head = novo;
            tail = novo;
        }else{
            novo.set_Next(head);
            head = novo;
        }          
    }
    public Object remover_inicio(){ // 0(1) - > Pois cada "ação" só ocorre uma vez
        if (head == null){
            return isEmpty();
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
        return aux;
    }
    public void inserir_fim(int dado){ // 0(1) - > Pois cada "ação" só ocorre uma vez
        No novo = new No(dado);
        if (head == null){
            head = novo;
            tail = novo;
        }
        tail.set_Next(novo);
        novo.set_Next(null);
        tail = novo;
    }
    public Object remover_fim(){ // O(n) - > Por causa do while que itera sobre n números(No pior caso),
        if (head == null){ //               se a lista estiver só com um elemento é O(1), pois não entra no laço
            throw new DequeVaziaExcecao("O deque está vazio, insira um elemento");
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
        return aux;
    }
}
