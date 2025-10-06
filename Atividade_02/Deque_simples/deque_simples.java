package Deque_simples;

public class deque_simples {
    No head;
    No tail;
    public deque_simples(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void inserir_inicio(int dado){
        No novo = new No(dado);
        if (head == null){
            head = novo;
            tail = novo;
        }else{
            novo.set_Next(head);
            head = novo;
        }            
    }
    public void remover_inicio(){
        head = head.get_Next();
        if (head == null){
            tail = null;
        }
    }
    public void inserir_fim(int dado){
        No novo = new No(dado);
        
    }
}
