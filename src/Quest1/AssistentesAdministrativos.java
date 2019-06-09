
package Quest1;

public class AssistentesAdministrativos extends Assistente{
    private double addNot;
    public AssistentesAdministrativos(String n,String m,double s,Gerentes sup,double adn){
        super(n,m,s,sup);
        setAddNot(adn);
    }

    public double getAddNot() { return this.addNot;}
    public void setAddNot(double adn) { this.addNot = adn;}
    
}
