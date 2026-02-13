import java.util.lista

public boolean éABP(ArvBin A){
    raiz = A.root();

    ArvoreOrdenada = InOrder(raiz);
    for (i = 0; i < ArvoreOrdenada.size() - 1;i++){
        if (ArvoreOrdenada(i) >= ArvoreOrdenada(i + 1 )){
            return false
        }        
    }
    return true
}