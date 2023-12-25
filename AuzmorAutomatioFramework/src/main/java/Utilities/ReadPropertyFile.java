package Utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import Basetest.BaseClass;
import org.apache.commons.lang3.StringUtils;

public class ReadPropertyFile {
    static Properties pro = new Properties();
    public static String getProperty1(String key) throws Exception {
        String filePath= System.getProperty("user.dir")+"/src/main/resources/configfiles/config.properties";
        FileInputStream fr=new FileInputStream(filePath);

        pro.load(fr);
        //System.out.println(pro.getProperty("browser"));
        //System.out.println(pro.getProperty("testurl"));
        String value =pro.get(key).toString();
        if(StringUtils.isEmpty(value))
        {
            throw new Exception("value is not specified for key: "+key+" in propertiesFile");
        }
        return  value;
    }


}
