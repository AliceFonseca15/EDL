import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class ArvoreBP_duplamente{
    int tamanho;
    int altura;
    No raiz = new No();
    public ArvoreBP_duplamente(){
        tamanho = 0;
        altura = 0;
        raiz = null;
    }
    // Variavel Auxiliar Universal
    Object aux;
    // Metodos Genericos
    public int size(){
        return tamanho;
    }
    public int height(){ // altura da arvore
        return altura;
    }
    public Iterator<Integer> elements(){
        List<Integer> elementos = new ArrayList<>();

        for (No i : InOrder(raiz)){
            elementos.add(i.get_elemento());
        }  
        return elementos.iterator();   
    }
    public boolean isEmpty(){
        if (tamanho == 0){
            return true;
        }else{
            return false;
        }
    }
    public Iterator<No> nos(){
        List<No> todos_nos = new ArrayList<>();

        for (No i : InOrder(raiz)){
            todos.nos.add(i);
        }
        return todos_nos.Iterator();
    }
    
    //Metodos de acesso
    public No root(){ // retorna o raiz
        return raiz;
    }
    public No Parent(No n){ // Retorna o pai 
        return n.get_pai();
    }
    public List<No> children(No n){ // Retorna uma lista com os filhos
        List<No> filhos = new ArrayList<>();
         
        if (n.get_filhoE() != null){
            filhos.add(n.get_filhoE());
        }             
        if (n.get_filhoD() != null){
            filhos.add(n.get_filhoD());
        }
        return filhos;        
    }
    //Metodos adicionais
    public No left(No n){
        return n.get_filhoE();
    }
    public No right(No n){
        return n.get_filhoD();
    }
    public boolean hasLeft(No n){
        if (n.get_filhoE() != null){
            return true;
        }
        return false;     
    }

    public boolean hasRight(No n){
        if(n.get_filhoD() != null){
            return true;
        }
        return false;     
    }

    // Metodos de consulta
    public boolean isInternal(No n){ // se o No é Interno(Folha)
        if (n.get_filhoD() == null && n.get_filhoE() == null){
            return true;
        }
        return false;      
    }

    public boolean isExternal(No n){ // Se o No é Externo(Não-folha)
        if (n.get_filhoD() != null || n.get_filhoE() != null){ 
            return true;
        }
        return false;
        
    }

    public boolean isRoot(No n){ // se é raiz
        if (n == raiz){
            return true;
        }
        return false;       
    }

    public int depth(No n){ // profundidade
        if (isRoot(n)){
            return 0;
        }
        return 1 + depth(Parent(n));       
    }

    public int Altura(No n){ // Altura de um No
        if (isExternal(n)){
            return 0;
        }else{
            int contador = 0;
            for (No i : children(n)){
                contador = Math.max(contador,Altura(i));
            }
            return 1 + contador;
        }
    }
    public List<No> InOrder(No n) {
        List<No> visitados = new ArrayList<>();

        if (n == null) { // Se n for vazio
            return visitados;
        }

        if (n.get_filhoE() != null) {
            visitados.addAll(InOrder(n.get_filhoE()));
        }

        visitados.add(n); 

        if (n.get_filhoD() != null) {
            visitados.addAll(InOrder(n.get_filhoD()));
        }
        return visitados;
    }

    public List<No> PreOrder(No n){
        List<No> visitados = new ArrayList<>();

        if (n == null) { // Se n for vazio
            return visitados;
        }

        visitados.add(n);

        if (n.get_filhoE() != null){
            visitados.addAll(PreOrder(n.get_filhoE()));
        }

        if (n.get_filhoD() != null){
            visitados.addAll(PreOrder(n.get_filhoD()));
        }

        return visitados;
    }
    
    public List<No> PosOrder(No n){
        List<No> visitados = new ArrayList<>();

        if (n == null) { // Se n for vazio
            return visitados;
        }

        if (n.get_filhoE() != null){
            visitados.addAll(PosOrder(n.get_filhoE()));
        }

        if (n.get_filhoD() != null){
            visitados.addAll(PosOrder(n.get_filhoD()));
        }

        visitados.add(n);
    }

    // Metodo de atualização
    public Object replace(No n, Object o){
        aux = n.get_elemento();
        n.set_elemento(o);
        return aux;
    }
     // Metodos de Arvore Binaria de Pesquisa

     No Buscar(int n, No raiz) {
        if (raiz.isExternal()) {
            return null; 
        }

        if (n == raiz.get_elemento()) {
            return raiz; 
        }

        if (n < raiz.get_elemento()) {
            return Buscar(n, raiz.get_filhoE()); 
        }
        return Buscar(n, raiz.get_filhoD()); 
    }  

}

