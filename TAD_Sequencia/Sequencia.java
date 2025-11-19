public class Sequencia {
    public Sequencia(){

    }
    public No Atrank(int rank){
        No atual;
        if (rank <= size()/2){ // se está na primeira metade
            atual = head.get_Next();
            for (int i = 0; i < rank;i++){
                atual = atual.get_Next();
            }
        }else{
            atual = tail.get_prev();
            for (int i = 0; i < size() - rank - 1;i++){
                atual = atual.get_prev();
            }
        }
        return atual;
    }
    public No rankOf(No n){
        No atual = head.get_Next();
        int contador = 0;
        while (atual != n && atual != tail){
            atual.get_Next();
            contador++;
        }
        return contador;
    }
}
