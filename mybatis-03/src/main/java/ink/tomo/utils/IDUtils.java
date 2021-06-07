package ink.tomo.utils;
import java.util.UUID;
/**
 * @author
 * @create 2021-06-07 21:15
 **/

public class IDUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
