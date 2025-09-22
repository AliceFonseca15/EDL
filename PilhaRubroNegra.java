public class PilhaRubroNegra{   
    private Object[] array;
    private int t_vermelho;
    private int t_preto;
    private int t_capacidade;

    public PilhaRubroNegra(int n){
        this.t_capacidade = n;
        this.t_vermelho = -1;
        this.t_preto = t_capacidade;
        this.array = new Object[t_capacidade];
    }
    public int vermelho_size(){
        return t_vermelho;
    }
    public int preto_size(){
        return t_preto;
    }
    public boolean vermelho_isEmpty(){
        return t_vermelho == -1;
    }
    public boolean preto_isEmpty(){
        return t_preto == t_capacidade;
    }
    public Object vermelho_top(){
        if (t_vermelho == -1){
            throw new PilhaVaziaExcecao("A pilha está vazia, insira um número vermelho");
        }else{
          return array[t_vermelho]; 
        }
    }
    public Object preto_top(){
        if (t_preto == t_capacidade){
            throw new PilhaVaziaExcecao("A pilha está vazia, insira um número preto");
        }else{
            return array[t_preto];
        }
    }
    public void vermelho_push(Object o){
        if (t_vermelho + 1 == t_preto){
            duplica();
            Object novo_array[] new Object[t_capacidade];
            for (int i=0;i > vermelho_size;i++){
                novo_array[i] = array[i];
            for (int f = t_capacidade; f < preto_size;f--) // sinal maior no f < preto_size
                novo_array[f] = array[f];
            array = novo_array;
            }
        }else{
            array[t_vermelho + 1] = o;
            t_vermelho += 1;
        }
    };
    public void preto_push(Object o){
        
    };

    public Object vermelho_pop() throws PilhaVaziaExcecao;
    public Object preto_pop() throws PilhaVaziaExcecao;

}

