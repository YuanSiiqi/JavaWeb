import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：ysq
 * 日期: 2020/11/25 9:35
 * 描述:
 */
@WebServlet("/createCookies")
public class CreateCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        Cookie cookie = new Cookie("key3", "value1");
        Cookie cookie1 = new Cookie("key4", "value2");
        cookie.setMaxAge(60 * 60 * 24);
        cookie1.setMaxAge(60 * 60 * 24);
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        resp.getWriter().write("cookie创建成功");
    }
}
