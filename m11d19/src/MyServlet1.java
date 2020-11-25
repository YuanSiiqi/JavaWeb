import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：ysq
 * 日期: 2020/11/20 10:25
 * 描述:
 */
public class MyServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet被调用");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost被调用");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPut被调用");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete被调用");
    }

    public MyServlet1() {
    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("2.init初始化方法");
        System.out.println("别名" + config.getServletName());
        System.out.println(config.getInitParameter("username"));
        System.out.println(config.getInitParameter("url"));
        System.out.println(config.getServletContext());
    }
}
