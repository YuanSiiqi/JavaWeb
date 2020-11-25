import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 作者：ysq
 * 日期: 2020/11/21 9:22
 * 描述:
 */
@WebServlet("/login")
public class UserServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        getServletContext().setAttribute("count", 0);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        response.setCharacterEncoding("GBK");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        //创建响应字符输出流
        PrintWriter out = response.getWriter();
        int count = (int) getServletContext().getAttribute("count");
        count++;
        getServletContext().setAttribute("count", count);
        if ("admin".equals(username) && "123".equals(password)) {//登录接口

//            int count = (int) getServletContext().getAttribute("count");

            out.println("<h1>" + username + "登录成功</h1>");
            out.println("<h1>访问次数" + count + "</h1>");
        } else {
            out.println("<h1>登录失败</h1>");
            out.println("<h1>访问次数" + count + "</h1>");
        }
    }
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        int count = (int) getServletContext().getAttribute("count");
//        count++;
//        getServletContext().setAttribute("count", count);
//    }
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//                int count = (int) getServletContext().getAttribute("count");
//        count++;
//        getServletContext().setAttribute("count", count);
//    }
}
