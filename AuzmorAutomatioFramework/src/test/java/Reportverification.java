import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Reportverification {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\91889\\Downloads\\Report.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = wb.getSheet("Learner info");

        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();
        //System.out.println(rowCount+"  "+columnCount);

        int mailIndex = 0;
        int statusIndex = 0;

        for (int i = 0; i < columnCount; i++) {
            if ("Progress Status".equals(sheet.getRow(0).getCell(i).getStringCellValue())) {
                statusIndex = i;
            }
            else if ("Email/Username".equals(sheet.getRow(0).getCell(i).getStringCellValue())) {
                mailIndex = i;
            }
        }

        if ( mailIndex == 0 ) {
            System.out.println("The Email/Username column has not founded.");
            return;
        }
        if ( statusIndex == 0 ){
            System.out.println("The progress status column has not founded.");
            return;
        }

        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = sheet.getRow(i);

            if (row == null) {
                System.out.println("Row " + i + " is null.");
                continue;
            }

            XSSFCell cell1 = row.getCell(mailIndex);
            XSSFCell cell2 = row.getCell(statusIndex);

            if (cell1 == null || cell2 == null) {
                System.out.println("One of the cells in row " + i + " is null.");
                continue;
            }

            String mail = getCellValueAsString(cell1);
            String status = getCellValueAsString(cell2);
            //System.out.println("The person with " + mail + " had the status " + status);

            if ("Completed".equals(status)) {
                System.out.println("The person with " + mail + " had the status " + status);
            } else {
                System.out.println("The person with " + mail + " had the status " + status);
            }
        }
    }

    private static String getCellValueAsString(XSSFCell cell) {
        if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else {
            return "";
        }

    }
}