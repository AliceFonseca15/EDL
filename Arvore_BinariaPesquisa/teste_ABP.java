public class teste_ABP{
    public static void main(String[] args) {
        ArvoreBP_duplamente arvore = new ArvoreBP_duplamente();

        System.out.println("Está vazia:" + ' ' + arvore.isEmpty() );
        System.out.println("Inserindo:" + arvore.insert(10)); // raiz
        System.out.println("Inserindo:" + arvore.insert(5)); // esquerda
        System.out.println("Inserindo:" + arvore.insert(15));
        System.out.println("Inserindo:" + arvore.insert(22));
        System.out.println("Inserindo:" + arvore.insert(8));
        System.out.println("Inserindo:" + arvore.insert(2));
        System.out.println("filhos de 15" + arvore.mostrar_valores(arvore.children(arvore.root().get_filhoD())));
        arvore.mostrar_arvore();
        System.out.println("filhos de 5" + arvore.mostrar_valores(arvore.children(arvore.Buscar(5, arvore.root()))));
        System.out.println("Inserindo:" + arvore.insert(25));
        System.out.println("Tamanho Arvore:" + arvore.size());
        System.out.println("Removendo:" + arvore.remove(5));
        System.out.println("Tamanho Arvore:" + arvore.size());
        System.out.println("filhos do raiz(10)" + arvore.mostrar_valores(arvore.children(arvore.root())));
        arvore.mostrar_arvore();
        System.out.println("InOrder:" + arvore.mostrar_valores(arvore.InOrder(arvore.root())));
        System.out.println("PreOrder:" + arvore.mostrar_valores(arvore.PreOrder(arvore.root())));
        System.out.println("PosOrder:" + arvore.mostrar_valores(arvore.PosOrder(arvore.root())));
    }
}