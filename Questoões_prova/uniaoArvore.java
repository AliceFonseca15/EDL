import java.util.List
public ArvBin uniao(ArvBinA,ArvBinB){
    List<No> ordemA = InOrder(ArvBinA.root());
    List<No> ordemB = InOrder(ArvBinB.root());
    List<No> listafinal = new ArrayList<>();
    int i = 0, j = 0;
    while (i < ArvBinA.size() && j < ArvBinB.size()){
        if (ordemA.get_elemento(i) < ordemB.get_elemento(j)) {
            listafinal.add(ordemA.get_elemento(i))
            i++;
    } else if (ordemA.get_elemento(i) > ordemB.get_elemento(j)) {
            listafinal.add(ordemB.get_elemento(j));
            j++
    } else {
        
        listafinal.add(ordemA.get_elemento(i));
        i++;
        j++;
    }
    }

    while (i < ordemA.size()) listafinal.add(ordemA.get_elemento(i++));
    while (j < ordemB.size()) listafinal.add(ordemB.get_elemento(j++));
}

