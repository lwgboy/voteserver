package com.jarry.chat.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 * User: Jarry
 * Date: 2018-06-02
 * Time: 19:20
 */
public class DateUtils {
    static String format = "";

    public static Date parse(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
