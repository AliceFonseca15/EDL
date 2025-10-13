package Deque_simples;

public class No{
    private Object elemento;
    private No next;
    public No(int dado){
         elemento = dado;
        next = null;
    }
    public Object get_elemento(){
        return elemento;
    }
    public No get_Next(){    
        return next;
    }
    public void set_Next(No n){
        next = n;      
    }
}
