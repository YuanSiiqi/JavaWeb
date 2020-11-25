package utils;

import javax.servlet.http.Cookie;

/**
 * 作者：ysq
 * 日期: 2020/11/25 9:42
 * 描述:
 */
public class CookieUtils {

    public static Cookie findCookie(String name, Cookie[] cookies) {
        if (name == null || cookies == null || cookies.length == 0) {
            return null;
        }
        for (Cookie cookie :
                cookies) {
            if (name.equals(cookie.getName())) {
                return cookie;
            }
        }
        return null;
    }
}
