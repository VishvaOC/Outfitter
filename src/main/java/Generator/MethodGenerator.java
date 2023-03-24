package Generator;

import base.BaseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.util.Scanner;

public class MethodGenerator extends BaseClass {



    public static void main(String[] args) throws IOException, ParseException {
            method_generator();

    }


    public static void method_generator() throws IOException, ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Json file path");
        String Json_file_name = sc.next();

        System.out.println("Please enter class name : ");
        String class_name = sc.next();

        System.out.println("Please enter class path");
        String class_path = sc.next();

        Object o = new JSONParser().parse(new FileReader(Json_file_name));
        JSONArray j = (JSONArray) o;


        String code = "\n"+ "package ObjectRepo."+class_name+";"+
                       "\nimport org.openqa.selenium.By;"+
                        "\nimport static base.BaseClass.driver;"+
                        "\nimport org.openqa.selenium.support.ui.WebDriverWait;"+
                        "\nimport java.time.Duration;" +
                        "\nimport org.openqa.selenium.support.ui.ExpectedConditions;"+
                         "\nimport org.openqa.selenium.WebElement;"+
                       "\nimport org.openqa.selenium.support.ui.Select;"+
                        "\nimport java.util.List;"+
                      "\npublic class "+ class_name+" {\n" ;


        File sourceFile = new File(class_path);
        FileWriter writer = new FileWriter(sourceFile+"//"+class_name+".java",true);
        writer.write(code);

        for(int i = 0; i< j.size();i++){
            JSONObject testa = (JSONObject) j.get(i);
            String web_element_type = (String) testa.get("element_type");
            String web_element_name = (String) testa.get("element_name");


            if(web_element_type.equalsIgnoreCase("button")){

                String code1 = "public void click_on_"+web_element_name+"(){\n" +
                          "driver.findElement(By.xpath(\""+testa.get("element")+"\")).click(); \n"+
                        "}\n";


                String code2 = "public boolean is_displayed_"+web_element_name+"(){\n" +
                        "boolean flag = false;\n"+
                        "flag = driver.findElement(By.xpath(\""+testa.get("element")+"\")).isDisplayed();\n"+
                        "if (flag) {\n" +
                        "System.out.println(\"The element is Displayed\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The element is not Displayed\");\n" +
                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code3 = "public boolean is_enable_"+web_element_name+"(){\n" +
                        "boolean flag = false;\n"+
                        "flag = driver.findElement(By.xpath(\""+testa.get("element")+"\")).isEnabled();\n"+
                        "if (flag) {\n" +
                        "System.out.println(\"The element is Enabled\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The element is not Enabled\");\n" +
                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code4 = "public String click_on_"+web_element_name+"_get_text(){\n" +
                        "String text = driver.findElement(By.xpath(\""+testa.get("element")+"\")).getText(); \n"+
                        "return text;\n" +
                        "}";


                writer.write(code1);
                writer.write(code2);
                writer.write(code3);
                writer.write(code4);


            }
            if(web_element_type.equalsIgnoreCase("Text_box")){

                String code1 = "public void click_on_"+web_element_name+"(){\n" +
                        "driver.findElement(By.xpath(\""+testa.get("element")+"\")).click(); \n"+
                        "}\n";

                String code2 = "public boolean send_key_"+web_element_name+ "(String text) {\n"+
                         "boolean flag = false;\n" +
                          "try { \n"+
                             "WebElement ele = driver.findElement(By.xpath(\""+testa.get("element")+"\"));\n"+
                              "flag = ele.isDisplayed();\n" +
                              "ele.clear();\n" +
                              "ele.sendKeys(text);\n"+
                        "flag = true;\n" +
                        "} catch (Exception e) {\n" +
                        "System.out.println(\"Locator Not found\");\n" +
                        "flag = false;\n" +
                        "} finally {\n" +
                        " if (flag) { \n" +
                           " System.out.println(\"Successfully entered value\");\n"+
                        "} else { \n" +
                            "System.out.println(\"Unable to enter value\");\n"+
                       "}\n" +

                      "}\n" +
                      "return flag;\n" +
                   "}";

                String code3 = "public boolean is_displayed_"+web_element_name+"(){\n" +
                        "boolean flag = false;\n"+
                        "flag = driver.findElement(By.xpath(\""+testa.get("element")+"\")).isDisplayed();\n"+
                        "if (flag) {\n" +
                        "System.out.println(\"The element is Displayed\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The element is not Displayed\");\n" +
                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code4 = "public boolean is_enable_"+web_element_name+"(){\n" +
                        "boolean flag = false;\n"+
                        "flag = driver.findElement(By.xpath(\""+testa.get("element")+"\")).isEnabled();\n"+
                        "if (flag) {\n" +
                        "System.out.println(\"The element is Enabled\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The element is not Enabled\");\n" +
                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code5 = "public String click_on_"+web_element_name+"_get_text(){\n" +
                        "String text = driver.findElement(By.xpath(\""+testa.get("element")+"\")).getText(); \n"+
                        "return text;\n" +
                        "}";


                writer.write(code1);
                writer.write(code2);
                writer.write(code3);
                writer.write(code4);
                writer.write(code5);


            }
            if(web_element_type.equalsIgnoreCase("Link")){

                String code1 = "public void click_on_"+web_element_name+"(){\n" +
                        "driver.findElement(By.xpath(\""+testa.get("element")+"\")).click(); \n"+
                        "}\n";


                String code2 = "public boolean is_displayed_"+web_element_name+"(){\n" +
                        "boolean flag = false;\n"+
                        "flag = driver.findElement(By.xpath(\""+testa.get("element")+"\")).isDisplayed();\n"+
                        "if (flag) {\n" +
                        "System.out.println(\"The element is Displayed\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The element is not Displayed\");\n" +
                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code3 = "public boolean is_enable_"+web_element_name+"(){\n" +
                        "boolean flag = false;\n"+
                        "flag = driver.findElement(By.xpath(\""+testa.get("element")+"\")).isEnabled();\n"+
                        "if (flag) {\n" +
                        "System.out.println(\"The element is Enabled\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The element is not Enabled\");\n" +
                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code4 = "public String click_on_"+web_element_name+"_get_text(){\n" +
                        "String text = driver.findElement(By.xpath(\""+testa.get("element")+"\")).getText(); \n"+
                        "return text;\n" +
                        "}";


                writer.write(code1);
                writer.write(code2);
                writer.write(code3);
                writer.write(code4);

            }
            if(web_element_type.equalsIgnoreCase("iframe")){

               String code1 = "public boolean switch_to_frame_by_index_"+web_element_name+"(int index) {\n"+
                   " boolean flag = false;\n"+
                   "try { \n" +
                        "new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(\""+testa.get("element")+"\"))); \n;"+
                       "driver.switchTo().frame(index);\n"+
                        "flag = true;\n" +
                        "return true; \n"+
                    "} catch (Exception e) { \n"+
                        "return false;\n" +
                   " } finally { \n" +
                        "if (flag) { \n" +
                            "System.out.println(\"Frame with index \"+ index + \" is selected\");\n" +
                        "} else {\n" +
                            "System.out.println(\"Frame with index \"+ index + \" is not selected\");\n"+
                        "}"+
                    "}" +
                "}";


               String code2 = "public boolean switch_to_frame_by_id_"+web_element_name+"(String idValue) {\n"+
                       "boolean flag = false;\n"+
                       "try { \n" +
                       "driver.switchTo().frame(idValue);\n"+
                       "flag = true;\n" +
                       "return true; \n"+
                       "} catch (Exception e) { \n"+
                       "return false;\n" +
                       " } finally { \n" +
                       "if (flag) { \n" +
                       "System.out.println(\"Frame with Id\"+ idValue + \" is selected\");\n" +
                       "} else {\n" +
                       "System.out.println(\"Frame with Id\"+ idValue + \" is not selected\");\n"+
                       "}"+
                       "}" +
                       "}";


                String code3 = "public boolean switch_to_frame_by_name_"+web_element_name+"(String nameValue) {\n"+
                        "boolean flag = false;\n"+
                        "try { \n" +
                        "driver.switchTo().frame(nameValue);\n"+
                        "flag = true;\n" +
                        "return true; \n"+
                        "} catch (Exception e) { \n"+
                        "return false;\n" +
                        " } finally { \n" +
                        "if (flag) { \n" +
                        "System.out.println(\"Frame with Name\"+ nameValue+ \" is selected\");\n" +
                        "} else {\n" +
                        "System.out.println(\"Frame with Name\"+ nameValue+ \" is not selected\");\n"+
                        "}"+
                        "}" +
                        "}";

                String code4 = "public boolean switch_to_default_frame_"+web_element_name+"() {\n"+
                        "boolean flag = false;\n"+
                        "try { \n" +
                        "driver.switchTo().defaultContent();\n"+
                        "flag = true;\n" +
                        "return true; \n"+
                        "} catch (Exception e) { \n"+
                        "e.printStackTrace();\n"+
                        "return false;\n" +
                        " } finally { \n" +
                        "if (flag) { \n" +
                        "System.out.println(\"Frame with Name is selected\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The Frame is not selected\");\n"+
                        "}"+
                        "}" +
                        "}";

                writer.write(code1);
                writer.write(code2);
                writer.write(code3);
                writer.write(code4);

            }
            if(web_element_type.equalsIgnoreCase("Drop_down")){

              String code1 = "public void click_on_"+web_element_name+"(){\n" +
                      "driver.findElement(By.xpath(\""+testa.get("element")+"\")).click(); \n"+
                      "}\n";

              String code2 = "public boolean select_by_send_keys_"+web_element_name+"(String value) {\n"+
                  "boolean flag = false;\n"+
                  "WebElement ele = driver.findElement(By.xpath(\""+testa.get("element")+"\"));\n"+
                  "try {\n"+
                      "ele.sendKeys(value);\n"+
                      "flag = true;\n"+
                      "return true;\n"+
                  "} catch (Exception e) {\n"+
                      "return false;\n"+
                  "} finally {\n"+
                     "if (flag) {\n"+
                          "System.out.println(\"Select value from the DropDown\");\n"+
                      "} else {\n"+
                          "System.out.println(\"Not Selected value from the DropDown\");\n"+
                      "}\n"+
                  "}\n"+
              "}\n";

              String code3 = "public boolean select_by_index_"+web_element_name+"(int index) {\n"+
                      "boolean flag = false;\n"+
                      "WebElement ele = driver.findElement(By.xpath(\""+testa.get("element")+"\"));\n"+
                      "try {\n"+
                      "Select s = new Select(ele);\n"+
                      "s.selectByIndex(index);\n"+
                      "flag = true;\n"+
                      "return true;\n"+
                      "} catch (Exception e) {\n"+
                      "return false;\n"+
                      "} finally {\n"+
                      "if (flag) {\n"+
                      "System.out.println(\"Option selected by Index\");\n"+
                      "} else {\n"+
                      "System.out.println(\"Option not selected by Index\");\n"+
                      "}\n"+
                      "}\n"+
                      "}\n";

              String code4 = "public boolean select_by_value_"+web_element_name+"(String value) {\n"+
                      "boolean flag = false;\n"+
                      "WebElement ele = driver.findElement(By.xpath(\""+testa.get("element")+"\"));\n"+
                      "try {\n"+
                      "Select s = new Select(ele);\n"+
                      "s.selectByValue(value);\n"+
                      "flag = true;\n"+
                      "return true;\n"+
                      "} catch (Exception e) {\n"+
                      "return false;\n"+
                      "} finally {\n"+
                      "if (flag) {\n"+
                      "System.out.println(\"Option selected by Value\");\n"+
                      "} else {\n"+
                      "System.out.println(\"Option not selected by Value\");\n"+
                      "}\n"+
                      "}\n"+
                      "}\n";

              String code5 = "public boolean select_by_visible_text"+web_element_name+"(String visibletext) {\n"+
                      "boolean flag = false;\n"+
                      "WebElement ele = driver.findElement(By.xpath(\""+testa.get("element")+"\"));\n"+
                      "try {\n"+
                      "Select s = new Select(ele);\n"+
                      "s.selectByValue(visibletext);\n"+
                      "flag = true;\n"+
                      "return true;\n"+
                      "} catch (Exception e) {\n"+
                      "return false;\n"+
                      "} finally {\n"+
                      "if (flag) {\n"+
                      "System.out.println(\"Option selected by VisibleText\");\n"+
                      "} else {\n"+
                      "System.out.println(\"Option not selected by VisibleText\");\n"+
                      "}\n"+
                      "}\n"+
                      "}\n";

                String code6 = "public String click_on_"+web_element_name+"_get_text(){\n" +
                        "String text = driver.findElement(By.xpath(\""+testa.get("element")+"\")).getText(); \n"+
                        "return text;\n" +
                        "}";

              writer.write(code1);
              writer.write(code2);
              writer.write(code3);
              writer.write(code4);
              writer.write(code5);
              writer.write(code6);
          }
            if(web_element_type.equalsIgnoreCase("table")){

                String code1 = "public void click_on_"+web_element_name+"(){\n" +
                        "driver.findElement(By.xpath(\""+testa.get("element")+"\")).click(); \n"+
                        "}\n";

                String code2 = "public boolean send_key_"+web_element_name+ "(String text) {\n"+
                        "boolean flag = false;\n" +
                        "try { \n"+
                        "WebElement ele = driver.findElement(By.xpath(\""+testa.get("element")+"\"));\n"+
                        "flag = ele.isDisplayed();\n" +
                        "ele.clear();\n" +
                        "ele.sendKeys(text);\n"+
                        "flag = true;\n" +
                        "} catch (Exception e) {\n" +
                        "System.out.println(\"Locator Not found\");\n" +
                        "flag = false;\n" +
                        "} finally {\n" +
                        " if (flag) { \n" +
                        " System.out.println(\"Successfully entered value\");\n"+
                        "} else { \n" +
                        "System.out.println(\"Unable to enter value\");\n"+
                        "}\n" +

                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code3 = "public boolean is_displayed_"+web_element_name+"(){\n" +
                        "boolean flag = false;\n"+
                        "flag = driver.findElement(By.xpath(\""+testa.get("element")+"\")).isDisplayed();\n"+
                        "if (flag) {\n" +
                        "System.out.println(\"The element is Displayed\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The element is not Displayed\");\n" +
                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code4 = "public boolean is_enable_"+web_element_name+"(){\n" +
                        "boolean flag = false;\n"+
                        "flag = driver.findElement(By.xpath(\""+testa.get("element")+"\")).isEnabled();\n"+
                        "if (flag) {\n" +
                        "System.out.println(\"The element is Enabled\");\n" +
                        "} else {\n" +
                        "System.out.println(\"The element is not Enabled\");\n" +
                        "}\n" +
                        "return flag;\n" +
                        "}";

                String code5 = "public int get_column_count_"+web_element_name+"(WebElement row) {\n"+
                    "List<WebElement> columns = row.findElements(By.tagName(\"td\"));\n"+
                    "int a = columns.size();\n"+
                    "System.out.println(columns.size());\n"+
                    "for (WebElement column : columns) {\n"+
                        "System.out.print(column.getText());\n"+
                        "System.out.print(\"|\");\n"+
                    "}\n"+
                    "return a;\n"+
                "}\n";

                String code6 = "public int get_row_count_"+web_element_name+"(WebElement table) {\n"+
                    "List<WebElement> rows = table.findElements(By.tagName(\"tr\"));\n"+
                    "int a = rows.size() - 1;\n"+
                    "return a;\n"+
                "}\n";

                String code7 = "public String click_on_"+web_element_name+"_get_text(){\n" +
                        "String text = driver.findElement(By.xpath(\""+testa.get("element")+"\")).getText(); \n"+
                        "return text;\n" +
                        "}";

                writer.write(code1);
                writer.write(code2);
                writer.write(code3);
                writer.write(code4);
                writer.write(code5);
                writer.write(code6);
                writer.write(code7);

            }
        }
        writer.write("}");
        writer.close();
        System.out.println("All methods generated successfully");
    }


}

