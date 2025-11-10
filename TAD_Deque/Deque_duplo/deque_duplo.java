public class deque_duplo {
    No head;
    No tail;
    int capacidade;

    public deque_duplo(){
        head = null;
        tail = null;
    }

    Object aux;

    public boolean isEmpty(){
        return head == null;
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
    public void inserir_inicio( Object dado){
        No novo = new No(dado);
        if (head == null){
            head = novo;
            tail = novo;
        }else{
            head.set_prev(novo);
            novo.set_Next(head);
            head = novo;
        }
        soma_capacidade();
    }
    public Object remover_inicio(){
        if (head == null){
            throw new RuntimeException("O Deque está vazio!");
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
                tail.set_prev(head);
            }else{
                tail.set_Next(novo);
                novo.set_prev(tail);
                tail = novo;
            }
        }
        soma_capacidade();
        }
    public Object remover_fim(){
        if (head == null){
            throw new RuntimeException("O Deque está vazio!");
        }else{
            if (head == tail){
                aux = head.get_elemento();
                head = null;
                tail = null;
            }else{
                if (head.get_elemento() == tail.get_prev()){
                    aux = tail.get_elemento();
                    tail = head;
                    head.set_Next(null);
                }else{
                    aux = tail.get_elemento();
                    tail = tail.get_prev();
                    tail.set_Next(null);
                }
        }
    }
        diminui_capacidade();
        return aux;
    }
}