public class teste_PilhaRubroNegra {
	public static void main(String[] args) {
        System.out.println("--Teste Pilha Rubro Negra--");
        System.out.println("Pilha com capacidade inicial de 4");
        PilhaRubroNegra minhaPilha = new PilhaRubroNegra(4);
        System.out.println("--Estado Inicial:--");
        System.out.println("Tamanho Pilha Vermelha: " + minhaPilha.vermelho_size()); //  0
        System.out.println("Pilha Vermelha Vazia? " + minhaPilha.vermelho_isEmpty()); //  true
        System.out.println("Tamanho Pilha Preta: " + minhaPilha.preto_size()); //  0
        System.out.println("Pilha Preta Vazia? " + minhaPilha.preto_isEmpty()); // true
        System.out.println("Testando push na Pilha Vermelha");
        for (int i = 1; i <= 5; i++) {
            minhaPilha.vermelho_push(i); //Aqui tmb é feito o teste da duplicação
        }
        System.out.println("--Estado após push:--");
        System.out.println("Tamanho Pilha Vermelha: " + minhaPilha.vermelho_size()); //  5
        System.out.println("Pilha Vermelha Vazia? " + minhaPilha.vermelho_isEmpty()); // false

        System.out.println("Testando push na Pilha Preta");
        for (int i = 10; i >= 6; i--) {
            minhaPilha.preto_push(i);
        }
        System.out.println("--Estado após push:--");
        System.out.println("Tamanho Pilha Preta: " + minhaPilha.preto_size()); // 5
        System.out.println("Pilha Preta Vazia? " + minhaPilha.preto_isEmpty()); // false
        
        System.out.println("Testando top");
        System.out.println("Topo da Pilha Vermelha: " + minhaPilha.vermelho_top()); // 5
        System.out.println("Topo da Pilha Preta: " + minhaPilha.preto_top()); // 6

        System.out.println("Testando pop nas Pilhas"); // Aqui será feito o teste do redutor
        System.out.println("Retirando da Pilha Vermelha: " + minhaPilha.vermelho_pop()); //  remove 5
        System.out.println("Retirando da Pilha Preta: " + minhaPilha.preto_pop()); // remove 6

        System.out.println("--Estado após 2 pops:--");
        System.out.println("Tamanho Pilha Vermelha: " + minhaPilha.vermelho_size()); // Deve ser 4
        System.out.println("Tamanho Pilha Preta: " + minhaPilha.preto_size()); // Deve ser 4
    }
}