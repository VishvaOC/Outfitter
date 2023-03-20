package Generator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.*;

import java.util.*;

import static java.lang.System.in;


public class LocatorGenerator {

    public static void main(String[] args) throws InterruptedException, ParseException, IOException {
        WebDriver driver;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the url :");
        String url = scan.nextLine();

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get(url);


        Scanner myObj = new Scanner(in);
        System.out.println("Please enter File path : ");

        String filePath = myObj.nextLine();
        System.out.println("Enter json file name");

        String jsonv = myObj.nextLine();

        String file_name = filePath + "\\" + jsonv + ".json";

        // Create a new instance of the ChromeDriver


        System.out.println("Wait,taking all the xpath......");

        // Navigate to the web page you want to generate XPath for

        WebElement xyx = driver.findElement(By.tagName("body"));
        List element = xyx.findElements(By.tagName("*"));
        JSONArray testa = new JSONArray();
        for (Object test : element) {
            if (getXPath((WebElement) test).equalsIgnoreCase("null")) {
            } else {
                testa.add(craetjson((WebElement) test));

            }
        }
            try {
                FileWriter file = new FileWriter(file_name);
                file.write(testa.toJSONString().replace("\\/","/"));
                file.flush();
                System.out.println("Json file generated successfully.   ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        driver.close();
    }

    public static String getXPath(WebElement element) {
        String text;
        String type;
        String id;
        String name;
        String src;
        String href;;

        StringBuilder xpath = new StringBuilder();
        // Get the tag name of the element
        String tagName = element.getTagName();
        if (tagName.equalsIgnoreCase("meta") || tagName.equalsIgnoreCase("script") || tagName.equalsIgnoreCase("body") || tagName.equalsIgnoreCase("path") || tagName.equalsIgnoreCase("source") || tagName.equalsIgnoreCase("video") || tagName.equalsIgnoreCase("noscript") || tagName.equalsIgnoreCase("style") || tagName.equalsIgnoreCase("title") || tagName.equalsIgnoreCase("svg")) {
            text = null;
            id = null;
            name = null;
            src = null;
            href = null;
            type = null;

        } else {

            // Get the text of the element
            text = element.getText();

            // Get the value of the element's "id" attribute
            id = element.getAttribute("id");

            // Get the value of the element's "name" attribute
            name = element.getAttribute("name");
            src = element.getAttribute("src");
            href = element.getAttribute("href");
            type = element.getAttribute("type");
            // Build the XPath expression
            xpath = new StringBuilder("//" + tagName);
        }

        if (id != null && !id.isEmpty()) {
            xpath.append("[@id='" + id + "']");
        } else if (name != null && !name.isEmpty()) {
            xpath.append("[@name='" + name + "']");
        } else if (text != null && !text.isEmpty() && text.length() <= 25) {
            xpath.append("[contains(text(), '" + text + "')]");
        } else if (type != null && !type.isEmpty()) {
            xpath.append("[@type='" + type + "']");}
        else if (src != null && !src.isEmpty()) {
            xpath.append("[@src='" + src + "']");
        } else if (href != null && !href.isEmpty()) {
            xpath.append("[@href='" + href + "']");
        } else {
            xpath= new StringBuilder("null");
        }

        return xpath.toString().replaceAll("\n"," ");

    }

    public static String getElementName(WebElement element) {
        String text = element.getText();
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");

        String elementName;

        if (name != null && !name.isEmpty()) {
            elementName = name;
        } else if (id != null && !id.isEmpty()) {
            elementName = id;
        } else if (text != null && !text.isEmpty() && text.length() <= 25) {
            elementName = text;
        }else {
            elementName = "give_name";
        }
        return elementName.replaceAll(" ","_").replaceAll("\n","_").replaceAll("&","_").replaceAll("-","_");
    }

    public static String getElementType(WebElement element) {
        String tagName = element.getTagName();
        String element_type = null;
        if (tagName.equalsIgnoreCase("button") || tagName.equalsIgnoreCase("span") || tagName.equalsIgnoreCase("img") || tagName.equalsIgnoreCase("nav")) {
            element_type = "Button";
        }

        if (tagName.equalsIgnoreCase("link") || tagName.equalsIgnoreCase("a")) {
            element_type = "Link";
        }

        if (tagName.equalsIgnoreCase("div") || tagName.equalsIgnoreCase("input") || tagName.equalsIgnoreCase("h1") || tagName.equalsIgnoreCase("h2") || tagName.equalsIgnoreCase("h3") || tagName.equalsIgnoreCase("h4") || tagName.equalsIgnoreCase("h5") || tagName.equalsIgnoreCase("h6") || tagName.equalsIgnoreCase("p") || tagName.equalsIgnoreCase("label")) {
            element_type = "Text_box";
        }

        if (tagName.equalsIgnoreCase("iframe")) {
            element_type = "iframe";
        }

        if (tagName.equalsIgnoreCase("table") || tagName.equalsIgnoreCase("tr") || tagName.equalsIgnoreCase("th") || tagName.equalsIgnoreCase("td")){
            element_type = "table";
        }

        if (tagName.equalsIgnoreCase("select") || tagName.equalsIgnoreCase("li") || tagName.equalsIgnoreCase("ul")){
            element_type = "Drop_down";
        }

        return element_type;
    }

    public  static JSONObject craetjson(WebElement element){
        JSONObject j = new JSONObject();
        j.put("platform", "web");
        j.put("element_type", getElementType(element));
        j.put("element_name", getElementName(element));
        j.put("element", getXPath(element));
        return j;

    }


}










