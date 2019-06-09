package Quest1;

public class Funcionario {
    private String nome,matricula;
    private double sal;
    
    public Funcionario(String n,String m,double s){
        setNome(n);
        setMatricula(m);
    } 
    
    public String getNome(){ return this.nome;}
    public void setNome(String n){ this.nome=n;}
    
    public String getMatricula(){ return this.matricula;}
    public void setMatricula(String m){ this.matricula=m;} 

    public double getSal(){ return this.sal;}
    public void setSal(double s){ this.sal=s;} 

}
