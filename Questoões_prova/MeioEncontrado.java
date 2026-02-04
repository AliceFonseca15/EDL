import java.util.List

public No MeioEncontrado(){
    No rapido = head.get_next()
    No lento = head.get_next()

    while (rapido != tail && rapido.get_next() != tail){
        lento = lento.get_next();
        rapido = rapido.get_next().get_next()
       
    }

    return lento;
}