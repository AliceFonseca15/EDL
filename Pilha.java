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
    public int size(){
        return t + 1;
    }
    public boolean isEmpty(){

    };
    public Object top() throws PilhaVaziaExcecao;
    public void push(Object o);
    public Object pop() throws PilhaVaziaExcecao;

}

