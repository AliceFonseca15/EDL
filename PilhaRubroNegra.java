import java.util.Scanner;

public class PilhaRubroNegra{   
    private Object[] array;
    private int t_vermelho;
    private int t_preto;
    private int capacidade;

    public PilhaRubroNegra(int n){
        this.capacidade = n;
        this.t_vermelho = -1;
        this.t_preto = capacidade;
        this.array = new Object[capacidade];
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
            Object[] novo_array = new Object[capacidade];
            for (int i=0;i <- t_vermelho;i++){
                novo_array[i] = array[i];
            for (int f = capacidade; f > t_preto;f--) 
                novo_array[f] = array[f];
            array = novo_array;
            }
        }else{
            t_vermelho += 1;
            array[t_vermelho + 1] = o;
        }
    };
    public void preto_push(Object o){
        
    };
    public void duplica(){
        capacidade *= 2
        
    }

//   public Object vermelho_pop() throws PilhaVaziaExcecao;
//    public Object preto_pop() throws PilhaVaziaExcecao;
     public static void main(String[] args){
            PilhaRubroNegra inicio_pilha = new PilhaRubroNegra(15);
            Scanner scanner = new Scanner(System.in);
            int escolha_cor = -1;
            while (escolha_cor !0){
                System.out.println("Informe a cor para o número:");
                System.out.println("1- Vermelho");
                System.out.println("2- Preto ");
                System.out.println("3- Mostrar o array");
                System.out.println("0- Sair");
                int escolha = scanner.nextInt();
                if (escolha == 1){
                    System.out.println("Informe a operação da pilha vermelha:");
                    System.out.println("1- size():");
                    System.out.println("2- isEmpty()");
                    System.out.println("3- top()");
                    System.out.println("4- push()");
                    System.out.println("5- pop()");
                    int escolha_vermelho = scanner.nextInt();
                    if (escolha_vermelho == 1){
                        System.out.println(inicio_pilha.vermelho_size());
                    }
                    else if(escolha_vermelho == 2){
                        System.out.println(inicio_pilha.vermelho_isEmpty());
                    }
                    else if(escolha_vermelho == 3){
                        System.out.println(inicio_pilha.vermelho_top());
                    }
                    else if(escolha_vermelho == 4){
                        System.out.println("Informe o número a ser inserido:");
                        int n = scanner.nextInt();
                        inicio_pilha.vermelho_push(n);
                        System.out.println("elemento inserido");
                    }
                    else if(escolha_vermelho == 5){
                        System.out.println(inicio_pilha.vermelho_pop());
                    }
                }
                else if (escolha == 2){
                    System.out.println("Informe a operação da pilha preta:");
                    System.out.println("1- size():");
                    System.out.println("2- isEmpty()");
                    System.out.println("3- top()");
                    System.out.println("4- push()");
                    System.out.println("5- pop()");
                    int escolha_preto = scanner.nextInt();
                    if (escolha_preto == 1){
                        System.out.println(inicio_pilha.preto_size());
                    }
                    else if(escolha_preto == 2){
                        System.out.println(inicio_pilha.preto_isEmpty());
                    }
                    else if(escolha_preto == 3){
                        System.out.println(inicio_pilha.preto_top());
                    }
                    else if(escolha_preto == 4){
                        System.out.println("Informe o número a ser inserido:");
                        int n = scanner.nextInt();
                        inicio_pilha.preto_push(n);
                        System.out.println("elemento inserido");
                    }
                    else if(escolha_preto == 5){
                        System.out.println(inicio_pilha.preto_pop());
                    }
                }
                else if (escolha == 3){
                    System.out.println(inicio_pilha.capacidade);
                }
                else if (escolha == 0){
                    scanner.close();
                }
            }
}

