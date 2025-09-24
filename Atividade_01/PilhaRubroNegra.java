import java.util.Scanner;

public class PilhaRubroNegra{   
    private Object[] array;
    private int t_vermelho;
    private int t_preto;
    private int capacidade;

    public PilhaRubroNegra(int n){
        capacidade = n;
        t_vermelho = -1;
        t_preto = capacidade;
        array = new Object[capacidade];
    }
    public int vermelho_size(){
        return t_vermelho + 1;
    }
    public int preto_size(){
        return capacidade - t_preto; 
    }
    public boolean vermelho_isEmpty(){
        return t_vermelho == -1;
    }
    public boolean preto_isEmpty(){
        return t_preto == capacidade;
    }
    public Object vermelho_top(){
        if (t_vermelho == -1){
            throw new PilhaVaziaExcecao("A pilha está vazia, insira um número vermelho");
        }else{
          return array[t_vermelho]; 
        }
    }
    public Object preto_top(){
        if (t_preto == capacidade){
            throw new PilhaVaziaExcecao("A pilha está vazia, insira um número preto");
        }else{
            return array[t_preto];
        }
    }
    public void vermelho_push(Object o){
        if (t_vermelho + 1 == t_preto){
            duplica();
        }
        t_vermelho += 1;
        array[t_vermelho] = o;
        
    }
    public void preto_push(Object o){
        if (t_preto - 1 == t_vermelho){
            duplica();
        }
        t_preto -= 1;
        array[t_preto] = o;
        
    }
    public void duplica(){
            int nova_capacidade = capacidade * 2;
            Object[] novo_array = new Object[nova_capacidade];
            for (int i=0;i <= t_vermelho;i++){
                novo_array[i] = array[i];  // copia a parte vermelhha
            }
            int qtd_pretos = capacidade - t_preto;
            int novo_tpreto = nova_capacidade - qtd_pretos;
            
            for (int f = 0; f < qtd_pretos;f++){
                novo_array[novo_tpreto + f] = array[t_preto + f]; // copia a parte preta
            }
            array = novo_array;            
            t_preto = novo_tpreto;
            capacidade = nova_capacidade;
    }
    
    public Object vermelho_pop(){
    
        
        if (vermelho_isEmpty()){
            throw new PilhaVaziaExcecao("A pilha está vazia, insira um número vermelho");
        }        
        int aux = t_vermelho;
        t_vermelho -= 1;
        int soma_pilhas = vermelho_size() + preto_size();
        if (soma_pilhas <= capacidade/3){
            redutor();
        }
        return array[aux];
    }
    
    public Object preto_pop(){
        if (preto_isEmpty()){
            throw new PilhaVaziaExcecao("A pilha está vazia, insira um número preto");
        }

        int aux = t_preto;
        t_preto += 1;
        int soma_pilhas = vermelho_size() + preto_size();
        if (soma_pilhas <= capacidade/3){
            redutor();
        }
        return array[aux];
    }
    
    public void redutor(){
            int nova_capacidade = capacidade / 2;
            Object[] novo_array = new Object[nova_capacidade];
            for (int i=0;i <= t_vermelho;i++){
                novo_array[i] = array[i];  // copia a parte vermelhha
            }
            int qtd_pretos = capacidade - t_preto;
            int novo_tpreto = nova_capacidade - qtd_pretos;
            
            for (int f = 0; f < qtd_pretos;f++){
                novo_array[novo_tpreto + f] = array[t_preto + f]; // copia a parte preta
            }
            array = novo_array;            
            t_preto = novo_tpreto;
            capacidade = nova_capacidade;
    }
}


