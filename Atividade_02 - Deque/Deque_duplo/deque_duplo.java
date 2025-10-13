public class deque_duplo {
    No head;
    No tail;
    int capacidade;
    public deque_duplo(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void inserir_inicio( Object dado){
        No novo = new No(dado);
        if (head == null){
            head = novo;
            tail = novo;
        }else{
                head.set_prev(novo.get_elemento());
                novo.set_Next(head.get_elemento());
                head = novo;
            }
        }
    public Object remover_inicio(){
        if (head == null){
            return isEmpty();
        }else{
            if(head == tail){
                aux = head.get_elemento();
                head = null;
                tail = null;
            }
            else{
            aux = head.get_elemento();
            head = head.get_Next();
            head.set_prev(null);
            }
        }
    }
    public void inserir_fim(){
        No novo = new No();
        
        
    }
}

