public class No_heap{
    private Object elemento;
    private No_heap pai;
    private No_heap filhoE;
    private No_heap filhoD;
    public No_heap(){
        elemento = null;
        pai = null;
        filhoE = null;
        filhoD = null;
        chave= int
    }
    public set_chave(int n){
        chave = n
    }
    public get_chave(){
        return chave
    }
    public void set_elemento(Object n){
        elemento = n;
    }    
    public Object get_elemento(){
        return elemento;
    }
    public No_heap get_pai(){    
        return pai;
    }
    public void set_pai(No_heap n){
        pai = n;
    }
    public No_heap get_filhoE(){    
        return filhoE;
    }
    public void set_filhoE(No_heap n){
        filhoE = n;      
    }
    public No_heap get_filhoD(){
        return filhoD;
    }
    public void set_filhoD(No_heap n){
        filhoD = n;      
    }

}