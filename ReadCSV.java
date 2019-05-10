import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadCSV {

public static String readCsv(String fileName) {
	if(fileName == null || fileName.isEmpty()) return "E002:入参输入异常";
	 if(!fileName.endsWith(".csv")) {
		 return "E004:文件格式不正确";
	 }
	 try {
        File file = new File(fileName);
        if (file.isFile() && file.exists()) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String lineTxt = null;
            while ((lineTxt = br.readLine()) != null) {
               System.out.println(lineTxt);
            }
            br.close();
            return "E001:成功";
        } else {
            return "E003:文件不存在";
        }
    } catch (Exception e) {
       return "E000:方法未实现"; 
    }
}
	
public static void main(String[] args) {
	String fileName = "E:\\deepin\\NON\\ou-gatedata\\ManualExtractionData\\Android\\T0_ID000104_SlopeDown.csv";
	System.out.println(readCsv(fileName));
}
}
