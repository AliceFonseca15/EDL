public class teste_PilhaRubroNegra {
    public static void main(String[] args) {
        System.out.println("Pilha com capacidade inicial de 2");
        PilhaRubroNegra minhaPilha = new PilhaRubroNegra(2);


        System.out.println("Pilha Vermelha Vazia? " + minhaPilha.vermelho_isEmpty()); 
        System.out.println("Pilha Preta Vazia? " + minhaPilha.preto_isEmpty()); 

        System.out.println("Testando push na Pilha Vermelha");
        minhaPilha.vermelho_push(2);

        System.out.println("--Estado após push:--");
        System.out.println("Tamanho Pilha Vermelha: " + minhaPilha.vermelho_size());  
        System.out.println("Pilha Vermelha Vazia? " + minhaPilha.vermelho_isEmpty()); 

        System.out.println("Testando push na Pilha Preta");
        minhaPilha.preto_push(7);
        System.out.println("--Estado após push:--");
        System.out.println("Tamanho Pilha Preta: " + minhaPilha.preto_size()); 
        System.out.println("Pilha Preta Vazia? " + minhaPilha.preto_isEmpty()); 
        System.out.println("Array Capacidade: " + minhaPilha.get_capacidade());

        System.out.println("Testando duplicação, inserindo vermelho:");
        minhaPilha.vermelho_push(8);
        System.out.println("Array Capacidade: " + minhaPilha.get_capacidade());
        System.out.println("Tamanho Pilha Vermelha: " + minhaPilha.vermelho_size()); 
        System.out.println("Tamanho Pilha Preta: " + minhaPilha.preto_size());  

        System.out.println("Testando top");
        System.out.println("Topo da Pilha Vermelha: " + minhaPilha.vermelho_top()); 
        System.out.println("Topo da Pilha Preta: " + minhaPilha.preto_top());


        System.out.println("Testando pop e redutor nas Pilhas"); 
        System.out.println("Retirando da Pilha Vermelha: " + minhaPilha.vermelho_pop()); 
        System.out.println("Retirando da Pilha Preta: " + minhaPilha.preto_pop()); 
       
        System.out.println("--Estado após 3 pops:--");
        System.out.println("Tamanho Pilha Vermelha: " + minhaPilha.vermelho_size()); 
        System.out.println("Tamanho Pilha Preta: " + minhaPilha.preto_size()); 
        System.out.println("Array Capacidade: " + minhaPilha.get_capacidade()); 
    }
}
