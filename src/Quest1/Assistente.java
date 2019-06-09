
package Quest1;

public class Assistente extends Funcionario{
    Gerentes supervisor;
    
    Assistente(String n,String m,double s,Gerentes sup){
        super(n,m,s);
    }
    public Gerentes getSupervisor(){ return this.supervisor;}
    public void setSupervisor(Gerentes sup){ this.supervisor=sup;}
}
