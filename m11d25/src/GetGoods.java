import org.apache.tools.ant.util.StringUtils;
import org.junit.Test;
import utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：ysq
 * 日期: 2020/11/25 14:33
 * 描述:
 */
@WebServlet("/goods")
public class GetGoods extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Cookie good = CookieUtils.findCookie("goods", cookies);
        String goodname = req.getParameter("name");
        if (good == null) {
            Cookie cookie = new Cookie("goods", goodname);
            cookie.setMaxAge(60 * 60 * 24);
            resp.addCookie(cookie);
        } else {
            goodname = good.getValue();
            if (!good.getValue().contains(req.getParameter("name"))) {
                goodname = good.getValue() + "&" + req.getParameter("name");
            }
            good.setValue(goodname);
            resp.addCookie(good);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            System.out.println(goodname);

        }

    }
}
