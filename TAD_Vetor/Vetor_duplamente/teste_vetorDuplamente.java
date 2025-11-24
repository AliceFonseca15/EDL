class teste_vetorDuplamente {
    public static void main(String[] args){
        vetor_duplamente meuVetor = new vetor_duplamente();

        System.out.println("Vetor está vazio?" + meuVetor.isEmpty()); 
        System.out.println("Teste do insertAtRank"); // insertAtRank
        System.out.println("Inserindo 'Alice' na posiçao 0");
        meuVetor.insertAtRank(0, "Alice");
        System.out.println("Inserindo 'Fonseca' na posiçao 1");
        meuVetor.insertAtRank(1, "Fonseca");
        System.out.println("Tamanho:" + meuVetor.size());
        System.out.println("Teste do elemAtRank"); // elemAtRank
        System.out.println(meuVetor.elemAtRank(1));
        System.out.println("Teste do replaceAtRank"); // replaceAtRank
        System.out.println("Substituindo 'Fonseca' por 'Santos' ");
        meuVetor.replaceAtRank(1,"Santos");
        System.out.println("Mostrando elemento na posiçao 1");
        System.out.println(meuVetor.elemAtRank(1));
        System.out.println("Teste do removeAtRank na posicao 1");  // removeAtRank
        System.out.println("Removeu:" +  meuVetor.removeAtRank(1)); 
        System.out.println("Posição 0:" + meuVetor.elemAtRank(0));
        System.out.println("Tamanho:" + meuVetor.size());

        
    }  
}