public class testeHeap{
    public static void main(String[] args){
        Heap meuHeap  = new Heap(10);

        meuHeap.insert(1, "Alice");
        meuHeap.insert(5, "Miles");
        meuHeap.insert(3, "Paco");
        meuHeap.insert(7, "Biscoito");
        meuHeap.insert(8, "Bolacha");

        meuHeap.mostrar(); 

        meuHeap.remove(); //Alice
        
        meuHeap.mostrar();  

        meuHeap.remove(); //Paco

        meuHeap.mostrar(); 
    }
}