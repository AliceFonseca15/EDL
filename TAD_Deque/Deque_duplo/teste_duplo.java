public class teste_duplo{
    public static void main(String[] args){
        deque_duplo deque = new deque_duplo();

        System.out.println("Esta vazia:" + deque.isEmpty()); 
        System.out.println("Inserindo elemento");
        deque.inserir_inicio("alice");
        System.out.println("Esta vazia:" + deque.isEmpty());

        System.out.println("Removendo no Inicio:" + deque.remover_inicio());

        System.out.println("Inserindo elemento");
        System.out.println("Inserindo elemento");
        System.out.println("Inserindo elemento");

        
        deque.inserir_inicio("alice");
        deque.inserir_inicio("coleguinha");
        deque.inserir_fim("joao");
        
        System.out.println("Primeiro elemento:" + deque.get_primeiro());
        System.out.println("Último elemento:" + deque.get_ultimo());
        System.out.println("Tamanho atual:" + deque.get_capacidade());
        
        System.out.println("Removendo no Final:" + deque.remover_fim());
        System.out.println("Tamanho atual:" + deque.get_capacidade());

        System.out.println("Removendo no Final:" + deque.remover_fim());
        System.out.println("Tamanho atual:" + deque.get_capacidade());

        System.out.println("Removendo no Final:" + deque.remover_fim());
        System.out.println("Tamanho atual:" + deque.get_capacidade());

        System.out.println("Removendo no Final:" + deque.remover_fim());


        
    }
}