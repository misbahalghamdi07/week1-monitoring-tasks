package Day04;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;


/*
  Task:  Go to "http://webdriveruniversity.com/To-Do-List/index.html" and create a test that:

          Uses Faker to generate 5 random task names
          Adds all tasks to the todo list
          Marks every other task as completed (strikethrough)
          Deletes all completed tasks
          Verifies only incomplete tasks remain
  */

public class T05DynamicListManagement {
    // Task:  Go to "http://webdriveruniversity.com/To-Do-List/index.html" and create a test that:

    @Test
    public void testTodoListFunction() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Faker faker = new Faker();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        //  Uses Faker to generate 5 random task names

        WebElement inputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']")));
        for (int i = 0; i < 5; i++) {
            String task = faker.job().title();
            inputBox.sendKeys(task);
            inputBox.sendKeys(Keys.ENTER);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'" + task + "')]")));
        }


        // Marks every other task as completed (strikethrough)

        List<WebElement> tasks = driver.findElements(By.cssSelector("ul li"));
        for (int i = 0; i < tasks.size(); i++) {
            if (i % 2 == 0) {
                tasks.get(i).click(); // Apply strikethrough to mark as completed
            }
        }


        //  Deletes all completed tasks

        List<WebElement> completedTasks = driver.findElements(By.cssSelector("ul li.completed"));
        for (WebElement task : completedTasks) {
            js.executeScript("arguments[0].remove();", task);
        }


        //   Verifies only incomplete tasks remain

        List<WebElement> remainingTasks = driver.findElements(By.cssSelector("ul li"));
        for (WebElement task : remainingTasks) {
            boolean isCompleted = task.getAttribute("class").contains("completed");
            assertFalse(isCompleted, "Task should not be marked as completed");
        }

        driver.quit(); //close browser
    }
}