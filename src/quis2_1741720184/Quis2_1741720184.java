/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis2_1741720184;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author ASUS
 */
public class Quis2_1741720184 {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver=null;
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", 
                "../chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.get("https://demo.1crmcloud.com/login.php");
        
        
        driver.findElement(By.xpath("//*[@id=\"login_user\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"login_pass\"]")).sendKeys("admin");
        driver.findElement(By.id("login_button")).click(); //Login Admin
        Thread.sleep(9000);
        
        driver.findElement(By.className("default-avatar")).click(); //Click Gambar
    }
    
}
