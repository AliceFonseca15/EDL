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
    public Iterator<String> elements(){
        List<String> elementos = new ArrayList<>();

        
        
    }
    public boolean isEmpty(){
        if (tamanho == 0){
            return true;
        }else{
            return false;
        }
    }

    //Metodos de acesso
    public No root(){ // retorna o raiz
        return raiz;
    }
    public No Parent(No n){ // Retorna o pai 
        return n.get_pai();
    }
    public Iterator<No> children(No n){ // Retorna uma lista com os filhos
        List<No> filhos = new ArrayList<>();
         
        if (n.get_filhoE() != null){
            filhos.add(n.get_filhoE());
        }
        if (n.get_filhoD() != null){
            filhos.add(n.get_filhoD());
        }

        return filhos.iterator();        
    }

    // Metodos de consulta
    public boolean isInternal(No n){ // se o No é Interno(Folha)
        if (n.get_filhoD() == null && n.get_filhoE() == null){
            return true;
        }else{
            return false;
        }
    }
    public boolean isExternal(No n){ // Se o No é Externo(Não-folha)
        if (n.get_filhoD() != null || n.get_filhoE() != null){ 
            return true;
        }else{
            return false;
        }
    }
    public boolean isRoot(No n){ // se é raiz
        if (n.get_pai() == null){
            return true;
        }else{
            return false;
        }
    }
    public int depth(No n){ // profundidade
        if (isRoot(n)){
            return 0;
        }else{
            return 1 + depth(Parent(n));
        }
    } 
    // Metodo de atualização
    public Object replace(No n, Object o){
        aux = n.get_elemento();
        n.set_elemento(o);
        return aux;
    }


}