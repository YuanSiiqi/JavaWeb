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
 * 日期: 2020/11/25 11:07
 * 描述:
 */
@WebServlet("/Demo1Servlet")
public class Demo1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        Cookie[] cookies = request.getCookies();
        for (Cookie co :
                cookies) {
            PrintWriter pw = response.getWriter();
            pw.write("<p>Cookie[" + co.getName() + "=" + co.getValue()+","+co.getMaxAge()+"]</p>");
//            pw.write("<br/>");
        }
//        Cookie cookie = utils.CookieUtils.findCookie("key1", cookies);
//        if (cookie != null) {
//            response.getWriter().write(cookie.toString());
//        }
        response.getWriter().write("");
    }
}
