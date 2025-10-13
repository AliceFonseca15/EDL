public class No{
    private Object elemento;
    private No next;
    private No prev;
    public No(Object dado){
        elemento = dado;
        next = null;
        prev = null;
    }
    public Object get_elemento(){
        return elemento;
    }
    public No get_Next(){    
        return next;
    }
    public No get_prev(){    
        return prev;
    }
    public void set_Next(No n){
        next = n;      
    }
    public void set_prev(No n){
        prev = n;      
    }

}