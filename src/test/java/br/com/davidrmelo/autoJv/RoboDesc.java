package br.com.davidrmelo.autoJv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpResponse;

import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboDesc {

    private WebDriver driver;

    public RoboDesc() {


        //construtor

    }

    public void doLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.globo.com/login/6888/connect-confirm?url=https%3A%2F%2Fid.globo.com%2Fauth%2Frealms%2Fglobo.com%2Flogin-actions%2Fauthenticate%3Fsession_code%3Dw0Q7y4zKptLaSmWJNSRZb0tK7aUWBRfWWIXs6VQYLAc%26execution%3Db5dd88dc-447e-468f-945e-e7c7de4883b7%26client_id%3Dgloboplay-web%2540globoid-connect%26tab_id%3DlgD6uMQXlOU%26request-context%3DGOetzW&error=&request-context=GOetzW");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement textBox = driver.findElement(By.name("login"));
        WebElement textBox1 = driver.findElement(By.name("password"));
        textBox.sendKeys("David.13rodrigues@hotmail.com");
        textBox1.sendKeys("Davidksksksk");
        WebElement submitButton = driver.findElement(By.className("button ng-scope"));
        submitButton.click();

    }


}