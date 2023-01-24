package br.com.davidrmelo.autoJv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboDesc {

    private ChromeDriver openChrome;

    public RoboDesc(){
        //construtor
        WebDriverManager.chromedriver().setup();
        openChrome = new ChromeDriver();


    }

    public void openSite(String urlSite){
        openChrome.get(urlSite);
    }

    public void doLogin (String login,String password){



    }

}
