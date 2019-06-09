
package Quest1;

public class AssistentesTecnicos extends Assistente{
    private double bonus;
    AssistentesTecnicos(String n,String m,double s,Gerentes sup,double b){
        super(n,m,s,sup);
        setBonus(b);
    }

    public double getBonus() { return this.bonus;}

    public void setBonus(double bonus) { this.bonus=bonus;}
    
    
}
