package br.com.davidrmelo.autoJv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robodesc {

    public ChromeDriver openChrome;

    public void abrirChrome(){
        WebDriverManager.chromedriver().setup();
        openChrome = new ChromeDriver();
    }

    public void openSite(){
        openChrome.get("https://ge.globo.com/?utm_source=barraGCOM");
    }

    public void fazerLogin (){
        System.out.println("Vou fazer login!");

    }

}
