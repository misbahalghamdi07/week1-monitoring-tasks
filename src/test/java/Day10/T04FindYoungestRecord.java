package Day10;

import Utilities.TestBase2;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.ArrayList;

public class T04FindYoungestRecord extends TestBase2 {

    /*
Go to https://claruswaysda.github.io/addRecordWebTable.html
Add 10 records using Faker.
Find the name of the youngest record.
*/

    @Test
    void findYoungestRecordTest() {
//Go to https://claruswaysda.github.io/addRecordWebTable.html
        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");
        logger.info(" Page is opened");
        Faker faker = new Faker();


//Add 10 records using Faker.

        for (int i = 0; i < 10; i++) {

            driver.findElement(By.id("addNewRecordButton")).click();
            driver.findElement(By.id("firstName")).sendKeys(faker.name().firstName());
            driver.findElement(By.id("lastName")).sendKeys(faker.name().lastName());
            driver.findElement(By.id("age")).sendKeys(String.valueOf(faker.number().numberBetween(20, 100)));
            driver.findElement(By.id("email")).sendKeys(faker.internet().emailAddress());
            driver.findElement(By.id("salary")).sendKeys(String.valueOf(faker.number().numberBetween(7000, 50000)));
            driver.findElement(By.id("department")).sendKeys(faker.company().industry());
            driver.findElement(By.id("submit")).click();

        }
//Find the name of the youngest record.

        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.className("rt-td"));
            if (cells.size() > 2) {
                String fullName = cells.get(0).getText() + " " + cells.get(1).getText();
                String ageText = cells.get(2).getText();

                if (!ageText.isEmpty()) {
                    names.add(fullName);
                    ages.add(Integer.parseInt(ageText));

                }
            }


        }
    }
}
