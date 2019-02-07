package just.fo.fun.utils;

import org.springframework.beans.BeanUtils;

public class Utils {

    public static  <T> T copyProperties(Object from , T to){
        BeanUtils.copyProperties(from, to);
        return to;
    }
}
