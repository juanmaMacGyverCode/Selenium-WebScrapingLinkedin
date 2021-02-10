package com.browserscrappingselenium.demo.service;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@AllArgsConstructor
public class ScrapperService {

    //private static final String URL = "https://relatedwords.org/relatedto/";

    //private final ChromeDriver driver;

    //@PostConstruct
    //void postConstruct(){
    //    scrape("rubius");
    //}

    /*public void scrape(final String value){
        driver.get(URL + value);
        final WebElement words = driver.findElementByClassName("words");
        final List<WebElement> wordList = words.findElements(By.tagName("a"));
        wordList.forEach(word -> System.out.println(word.getText()));
        driver.quit();
    }*/
}
