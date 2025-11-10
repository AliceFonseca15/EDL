public class teste_vetorArray {
    public static void main(String[] args){
    vetor_array meuVetor = new vetor_array(10);

    System.out.println("Vetor está vizio?" + meuVetor.isEmpty());
    System.out.println("Teste do insertAtRank");
    System.out.println("Inserindo 'Alice' na posiçao 1");
    meuVetor.insertAtRank(1, "Alice");
    System.out.println("Inserindo 'Fonseca' na posiçao 2");
    meuVetor.insertAtRank(2, "Fonseca");
    System.out.println(meuVetor.mostrar_vetor());
    System.out.println("Teste do elemAtRank");
    System.out.println(meuVetor.elemAtRank(1));
    System.out.println("Teste do replaceAtRank");
    System.out.println("Substituindo 'Fonseca' por 'Santos' ");
    meuVetor.replaceAtRank(2,"Santos");
    System.out.println(meuVetor.mostrar_vetor());
    System.out.println("Teste do removeAtRank");
    System.out.println(meuVetor.removeAtRank(2));
    System.out.println(meuVetor.mostrar_vetor());
    System.out.println("Vetor está vizio?" + meuVetor.isEmpty());
    }
}
