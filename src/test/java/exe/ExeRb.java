package exe;

import br.com.davidrmelo.autoJv.RoboDesc;

public class ExeRb {

    public static void main(String[] args){
        RoboDesc robodesc = new RoboDesc();
        robodesc.openSite("https://globoplay.globo.com/");
        robodesc.doLogin("david.13rodrigues@hotmail.com","david");

    }

}
