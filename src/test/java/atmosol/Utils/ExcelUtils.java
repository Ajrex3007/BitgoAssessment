package atmosol.Utils;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {

    public static void main(String[] args) throws IOException {


        System.out.println(System.getProperty("user.dir"));

        File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Testdata.xls");

        FileInputStream fis = new FileInputStream(file);

        Workbook workbook = new HSSFWorkbook(fis);

        Sheet sheet = workbook.getSheet("Sheet1");

        Row row = sheet.getRow(1);

        Cell cell1= row.getCell(0);

        int num1 = (int) cell1.getNumericCellValue();

        Cell cell2= row.getCell(1);

        int num2 = (int) cell2.getNumericCellValue();

        System.out.println(num1);

        System.out.println(num2);

        Cell cell3= row.getCell(2);

        int sum = (int) cell3.getNumericCellValue();

        if(sum == num1 + num2){
            System.out.println();

        }









    }


}
