import com.zx.microserver.register.util.ReadPropertiesUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

/**
 * @author:智霸霸
 * @Date 2020/10/13
 */
public class PropertiesTest {
    public static void main(String[] args) {
        BigDecimal x=new BigDecimal(0.10) ;
        BigDecimal y=new BigDecimal(0.20);
        System.out.println(x.add(y));
    }
}
