
package Quest2;

import Quest1.*;

public class TestaEmpresa {
    public static void main(String[] args){
        
        Gerentes g1=new Gerentes("TheBoss1","11111111",999999,"Setor1");
        Gerentes g2=new Gerentes("TheBoss2","22222222",999999,"Setor2");
        
        AssistentesAdministrativos ad1=new AssistentesAdministrativos("Pikachu","Eu3sc0lh0v0c3",1234,g1,56);
        AssistentesTecnicos at1=new AssistentesTecnicos("Shazam","C4r41",6543,g2,21);
    }
}
