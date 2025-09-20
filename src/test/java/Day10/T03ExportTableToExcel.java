package Day10;

import Utilities.TestBase2;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.*;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.List;

public class T03ExportTableToExcel extends TestBase2 {

    /*
Go to https://claruswaysda.github.io/webTable.html
Write the entire Table 1 to a new Excel sheet.
*/

    @Test
    void exportTableToExcel() throws IOException{

        //Go to https://claruswaysda.github.io/webTable.html

        driver.get("Go to https://claruswaysda.github.io/webTable.html");
        logger.info("Page is opened");

        //Write the entire Table 1 to a new Excel sheet.

        WebElement Table1 = driver.findElement(By.xpath("//table[@id='t1']"));
        List<WebElement> rows = Table1.findElements(By.tagName("tr"));
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet1 = workbook.createSheet("Table1");

        for (int i = 0; i < rows.size(); i++) {
            Row excelRow = sheet1.createRow(i);
            List<WebElement> cells = rows.get(i).findElements(By.tagName("th"));
            if (cells.isEmpty()) {
                cells = rows.get(i).findElements(By.tagName("td"));
            }

            for (int j = 0; j < cells.size(); j++) {
                Cell excelCell = excelRow.createCell(j);
                excelCell.setCellValue(cells.get(j).getText());
            }
        }

        String filePath = "Table1.xlsx";
        FileOutputStream fileOut = new FileOutputStream(filePath);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();

        logger.info("Table1 data write the " + filePath);
    }


    }




