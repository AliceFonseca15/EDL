public class teste_lista {
    public static void main(String[] args){
        lista_array Minhalista = new lista_array(5);
        System.out.println("Está vazia:" + ' ' + Minhalista.isEmpty() );
        System.out.println("Teste de InsertFist");
        System.out.println("Inserindo...");
        Minhalista.insertFirst("Santos");
        System.out.println(Minhalista.mostrar_array());
        System.out.println("Inserindo...");
        Minhalista.insertFirst("Alice");
        System.out.println(Minhalista.mostrar_array());

        System.out.println(" ");

        System.out.println("Teste de InsertBefore");
        System.out.println("Inserindo...");
        Minhalista.insertBefore(0, "Maria");
        System.out.println(Minhalista.mostrar_array());

        System.out.println(" ");

        System.out.println("Teste de InsertAfter");
       System.out.println("Inserindo...");
        Minhalista.insertAfter(1,"Fonseca");
        System.out.println(Minhalista.mostrar_array());

        System.out.println(" ");

        System.out.println("Teste de InsertLast");
        Minhalista.insertLast("Batista");
        System.out.println(Minhalista.mostrar_array());

        System.out.println(" ");

        System.out.println("Teste de replaceElement");
        System.out.println("Substituindo 'Batista' por 'Ricardo' " );
        Minhalista.replaceElement(4,"Ricardo");
        System.out.println(Minhalista.mostrar_array());

        System.out.println(" ");

        System.out.println("Teste de swapElements");
        Minhalista.swapElements(2,3);
        System.out.println(Minhalista.mostrar_array());

        System.out.println(" ");

        System.out.println("Teste de remove");
        System.out.println(Minhalista.remove(4));
        System.out.println(Minhalista.mostrar_array());
        
        System.out.println(Minhalista.remove(0));
        System.out.println(Minhalista.mostrar_array());
    }
}
