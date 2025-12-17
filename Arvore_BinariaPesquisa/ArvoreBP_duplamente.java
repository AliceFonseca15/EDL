import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

import java.util.ArrayList;
public class ArvoreBP_duplamente{
    int tamanho;
    int altura;
    No_ABP raiz = new No_ABP();
    public ArvoreBP_duplamente(){
        tamanho = 0;
        altura = 0;
        raiz = null;
    }
    // Variavel Auxiliar Universal
    int aux;
    // Metodos Mostrar
    public List<Integer> mostrar_valores(List<No_ABP> n){
        List<Integer> valores = new ArrayList<>();
        for (No_ABP i : n){
            valores.add(i.get_elemento());
        }
        return valores;
    }

    public void mostrar_arvore(){
        if (isEmpty()){
            System.out.println("Árvore Vazia");
            return;
        }
        mostrar_arvore(raiz, 0);
    }

    private void mostrar_arvore(No_ABP n, int nivel) {
        if (n == null) return;
        mostrar_arvore(n.get_filhoE(), nivel + 1);
        for (int i = 0; i < nivel; i++) System.out.print("  ");
        System.out.println(n.get_elemento());
        mostrar_arvore(n.get_filhoD(), nivel + 1);
    }

    // Metodos Genericos
    public int size(){
        return tamanho;
    }
    public int height(){ // altura da arvore
        return altura;
    }
    public List<Integer> elements(){ // elementos da arvore
        List<Integer> elementos = new ArrayList<>();

        for (No_ABP i : InOrder(raiz)){
            elementos.add(i.get_elemento());
        }  
        return elementos;   
    }

    public boolean isEmpty(){
        if (tamanho == 0){
            return true;
        }else{
            return false;
        }
    }
    public List<No_ABP> nos(){
        List<No_ABP> todos_nos = new ArrayList<>();

        for (No_ABP i : InOrder(raiz)){
            todos_nos.add(i);
        }
        return todos_nos;
    }
    
    //Metodos de acesso
    public No_ABP root(){ // retorna o raiz
        return raiz;
    }
    public No_ABP Parent(No_ABP n){ // Retorna o pai 
        return n.get_pai();
    }
    public List<No_ABP> children(No_ABP n){ // Retorna uma lista com os filhos
        List<No_ABP> filhos = new ArrayList<>();
         
        if (n.get_filhoE() != null){
            filhos.add(n.get_filhoE());
        }             
        if (n.get_filhoD() != null){
            filhos.add(n.get_filhoD());
        }
        return filhos;        
    }
    //Metodos adicionais
    public No_ABP left(No_ABP n){
        return n.get_filhoE();
    }
    public No_ABP right(No_ABP n){
        return n.get_filhoD();
    }
    public boolean hasLeft(No_ABP n){ // Se tem filho esquerdo
        if (n.get_filhoE() != null){
            return true;
        }
        return false;     
    }

    public boolean hasRight(No_ABP n){ // Se tem filho direito
        if(n.get_filhoD() != null){
            return true;
        }
        return false;     
    }

    // Metodos de consulta
    public boolean isInternal(No_ABP n){ // se o No_ABP é Interno(Folha)
        if (n.get_filhoD() == null && n.get_filhoE() == null){
            return true;
        }
        return false;      
    }

    public boolean isExternal(No_ABP n){ // Se o No_ABP é Externo(Não-folha)
        if (n.get_filhoD() != null || n.get_filhoE() != null){ 
            return true;
        }
        return false;
        
    }

    public boolean isRoot(No_ABP n){ // se é raiz
        if (n == raiz){
            return true;
        }
        return false;       
    }

    public int depth(No_ABP n){ // profundidade
        if (isRoot(n)){
            return 0;
        }
        return 1 + depth(Parent(n));       
    }

    public int Altura(No_ABP n){ // Altura de um No_ABP
        if (isExternal(n)){
            return 0;
        }else{
            int contador = 0;
            for (No_ABP i : children(n)){
                contador = Math.max(contador,Altura(i));
            }
            return 1 + contador;
        }
    }
    public List<No_ABP> InOrder(No_ABP n) {
        List<No_ABP> visitados = new ArrayList<>();

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

    public List<No_ABP> PreOrder(No_ABP n){
        List<No_ABP> visitados = new ArrayList<>();

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
    
    public List<No_ABP> PosOrder(No_ABP n){
        List<No_ABP> visitados = new ArrayList<>();

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
        return visitados;
    }

    // Metodo de atualização
    public int replace(No_ABP n, int o){
        aux = n.get_elemento();
        n.set_elemento(o);
        return aux;
    }
     // Metodos de Arvore Binaria de Pesquisa

    public No_ABP Buscar(int valor, No_ABP raiz_atual) {
        if (raiz_atual == null) return null;
        if (valor == raiz_atual.get_elemento()) {
            return raiz_atual; 
        }
        
        if (valor < raiz_atual.get_elemento()) {
            return Buscar(valor, left(raiz_atual));
        }
        
        return Buscar(valor, right(raiz_atual));
    }

    public No_ABP Comparador(int n, No_ABP raiz_atual) {
        if (raiz_atual == null) {
            return null;
        }
        if (n < raiz_atual.get_elemento()) {
            if (raiz_atual.get_filhoE() == null){
                return raiz_atual;
            }else{
                return Comparador(n, raiz_atual.get_filhoE());
            }
        }else {
            if (raiz_atual.get_filhoD() == null) return raiz_atual;
            return Comparador(n, raiz_atual.get_filhoD());
        }
    }

    public int insert(int valor){
        No_ABP novo = new No_ABP();
        novo.set_elemento(valor);
        if (isEmpty()){
            raiz = novo;
            tamanho++;
            return raiz.get_elemento();
        }
        No_ABP PaiEncontrado = Comparador(valor,raiz);
        if (valor < PaiEncontrado.get_elemento()){ // valor menor que pai
            PaiEncontrado.set_filhoE(novo);         
        }else{
            PaiEncontrado.set_filhoD(novo); // valor maior que paior que paior que pai
        }
        novo.set_pai(PaiEncontrado); // aponta para o pai
        tamanho++;
        return novo.get_elemento();
    }

    public int remove(int valor){
        if (isEmpty()){
            throw new RuntimeException("A Árvore está vazia");
        }

        No_ABP RemovidoEncontrado = Buscar(valor,raiz);
        if (RemovidoEncontrado == null) throw new RuntimeException("Valor não encontrado");
        No_ABP aux = RemovidoEncontrado;
        int valorRemovido = aux.get_elemento();
        No_ABP pai = RemovidoEncontrado.get_pai();

        if (!isExternal(RemovidoEncontrado)){ // Caso 1 de não ter filhos
            if (pai == null){
                raiz = null;
                tamanho--;
                return valorRemovido;
            }else{
                if (RemovidoEncontrado == pai.get_filhoE()){
                    pai.set_filhoE(null);
                }else{
                    pai.set_filhoD(null);
                }
                tamanho--;
            }
        }else{
            //Caso 2 - tem um dos filhos
            if (hasLeft(RemovidoEncontrado) ^ hasRight(RemovidoEncontrado)){ 
                No_ABP filhoUnico;
                if (hasLeft(RemovidoEncontrado)){
                    filhoUnico = RemovidoEncontrado.get_filhoE();
                }else{
                    filhoUnico = RemovidoEncontrado.get_filhoD();
                }
                if (pai == null){
                    raiz = filhoUnico;
                    filhoUnico.set_pai(null);
                    tamanho--;
                }else if (RemovidoEncontrado == pai.get_filhoE()){
                    pai.set_filhoE(filhoUnico);
                    filhoUnico.set_pai(pai);
                    tamanho--;
                }else{
                    pai.set_filhoD(filhoUnico);
                    filhoUnico.set_pai(pai);
                    tamanho--;
                }                   
            }else{
                // Caso 3 - Tem dois filhos
                if (hasLeft(RemovidoEncontrado) && hasRight(RemovidoEncontrado)){
                    No_ABP sucessor = RemovidoEncontrado.get_filhoD();
                    while (hasLeft(sucessor)){
                        sucessor = sucessor.get_filhoE();
                    }
                    RemovidoEncontrado.set_elemento(sucessor.get_elemento());

                    No_ABP paiSucessor = sucessor.get_pai();
                    No_ABP filhoDireito = sucessor.get_filhoD();

                    if (paiSucessor == null){
                        raiz = filhoDireito;
                        if (filhoDireito != null) filhoDireito.set_pai(null);
                    }else if (sucessor == paiSucessor.get_filhoE()){
                        paiSucessor.set_filhoE(filhoDireito);
                    }else{
                        paiSucessor.set_filhoD(filhoDireito);
                    }

                    if (filhoDireito != null){
                        filhoDireito.set_pai(paiSucessor);
                    }
                    tamanho--;
                }
            }
        }
    return valorRemovido;
    }
}
