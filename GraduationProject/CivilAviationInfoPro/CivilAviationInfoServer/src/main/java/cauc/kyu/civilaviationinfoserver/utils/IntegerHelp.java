package cauc.kyu.civilaviationinfoserver.utils;

import java.util.regex.Pattern;


public class IntegerHelp {

    /**
     * 判断string是否为整数
     * @param str
     * @return 整数返回true,否则返回false
     */
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    /**
     * 判断string是否为非负整数
     * @param str
     * @return 非负整数返回true，否则返回false
     */
    public static boolean isNon_negativeInteger(String str){
        Pattern pattern = Pattern.compile("^[1-9]\\d*|0$");
        return pattern.matcher(str).matches();
    }

    /**
     * 判断是否为正整数
     * @param str
     * @return 正整数返回true，否则返回false
     */
    public static boolean isPositiveInteger(String str){
        Pattern pattern = Pattern.compile("^[1-9]\\d*$");
        return pattern.matcher(str).matches();
    }
}
