class teste_vetorDuplamente {
    public static void main(String[] args){
        vetor_duplamente meuVetor = new vetor_duplamente();

        System.out.println("Vetor está vazio?" + meuVetor.isEmpty()); 
        System.out.println("Teste do insertAtRank");
        System.out.println("Inserindo 'Alice' na posiçao 1");
        meuVetor.insertAtRank(1, "Alice");
        System.out.println("Inserindo 'Fonseca' na posiçao 2");
        meuVetor.insertAtRank(2, "Fonseca");
        System.out.println("Tamanho:" + meuVetor.size());
        System.out.println("Teste do elemAtRank");
        System.out.println(meuVetor.elemAtRank(1));
        System.out.println("Teste do replaceAtRank");
        System.out.println("Substituindo 'Fonseca' por 'Santos' ");
        meuVetor.replaceAtRank(2,"Santos");
        System.out.println("Mostrando elemento na posiçao 2");
        System.out.println(meuVetor.elemAtRank(2));
        System.out.println("Teste do removeAtRank na posicao 2");
        System.out.println(meuVetor.removeAtRank(2));
        System.out.println(meuVetor.elemAtRank(2));
        System.out.println("Tamanho:" + meuVetor.size());

    }  
}