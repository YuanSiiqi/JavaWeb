import utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 作者：ysq
 * 日期: 2020/11/25 9:53
 * 描述:
 */
@WebServlet("/GetCookies")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        for (Cookie co :
                cookies) {
            PrintWriter pw = resp.getWriter();
            pw.write("<p>Cookie[" + co.getName() + "=" + co.getValue()+"]</p>");
//            pw.write("<br/>");
        }
        Cookie cookie = CookieUtils.findCookie("key1", cookies);
        if (cookie != null) {
            resp.getWriter().write(cookie.toString());
        }

    }
}
