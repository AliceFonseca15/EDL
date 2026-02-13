public class Heap{
    private Object[] elementos;
    private int[] chaves;
    private int tamanho;
    private int capacidade;
    
    public Heap(int cap){
        capacidade = cap;
        chaves = new int[cap + 1];
        elementos = new Object[cap + 1];
        tamanho = 0;
    }
    public boolean isEmpty(){
        if (tamanho == 1){
            return true;
        }
        return false;  
    }
    public void insert(int key, Object elem){
        if (tamanho >= capacidade - 1){
            throw new RuntimeException("O Heap está cheio!"); 
        }else{
            tamanho++;
            chaves[tamanho] = key;
            elementos[tamanho] = elem;
            heapUp(tamanho);
        }
    }
    public void heapUp(int indice){
        while (indice > 1){
            int pai = indice / 2;

            if (chaves[indice] < chaves[pai]){
                swap(indice,pai);
                indice = pai;
            }else{
                break;
            }
        }     
    }

    public void swap(int i, int p){
        int aux = chaves[i];

        chaves[i] = chaves[p];
        chaves[p] = aux;

        Object auxx = elementos[i];

        elementos[i] = elementos[p];
        elementos[p] = auxx;
    }

    public Object remove(){

        if (isEmpty()){
            throw new RuntimeException("O Heap está vazio!") ;
        }

        Object removido = elementos[1];

        chaves[1] = chaves[tamanho];
        elementos[1] = elementos[tamanho];

        chaves[tamanho] = 0; 
        elementos[tamanho] = null;
        tamanho--;

        if (tamanho > 1){
            headown(1);
        }
        
        return removido;
    }

    public void headown(int i){
        while (2 * i <= tamanho) {
        int filhoMenor = 2 * i; 

        if (filhoMenor + 1 <= tamanho && chaves[filhoMenor + 1] < chaves[filhoMenor]) {
            filhoMenor = filhoMenor + 1; 
        }

        if (chaves[i] <= chaves[filhoMenor]) {
            break;
        }

        swap(i, filhoMenor);

        i = filhoMenor;
        }
    }

    public void mostrar() {
    System.out.print("Heap (Vetor): [ ");
    for (int i = 0; i <= tamanho; i++) {
        System.out.print("(" + chaves[i] + ":" + elementos[i] + ") ");
    }
    System.out.println("]");
    }
}






    
