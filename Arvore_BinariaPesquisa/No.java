public class No{
    private int elemento;
    private No pai;
    private No filhoE;
    private No filhoD;
    public No(){
        elemento = 0;
        pai = null;
        filhoE = null;
        filhoD = null;
    }
    public void set_elemento(int n){
        elemento = n;
    }    
    public int get_elemento(){
        return elemento;
    }
    public No get_pai(){    
        return pai;
    }
    public void set_pai(No n){
        pai = n;
    }
    public No get_filhoE(){    
        return filhoE;
    }
    public void set_filhoE(No n){
        filhoE = n;      
    }
    public No get_filhoD(){
        return filhoD;
    }
    public void set_filhoD(No n){
        filhoD = n;      
    }
}