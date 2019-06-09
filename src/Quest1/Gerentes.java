
package Quest1;

public class Gerentes extends Funcionario{
    private String departamento;
    public Gerentes(String n,String m,double s,String dp){
        super(n,m,s);
        setDepartamento(dp);
    }

    public String getDepartamento() { return this.departamento;}
    public void setDepartamento(String dp) { this.departamento=dp;}
    
}
