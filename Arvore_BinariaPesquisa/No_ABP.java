public class No_ABP{
    private int elemento;
    private No_ABP pai;
    private No_ABP filhoE;
    private No_ABP filhoD;
    public No_ABP(){
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
    public No_ABP get_pai(){    
        return pai;
    }
    public void set_pai(No_ABP n){
        pai = n;
    }
    public No_ABP get_filhoE(){    
        return filhoE;
    }
    public void set_filhoE(No_ABP n){
        filhoE = n;      
    }
    public No_ABP get_filhoD(){
        return filhoD;
    }
    public void set_filhoD(No_ABP n){
        filhoD = n;      
    }

}