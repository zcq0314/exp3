package exp3;

import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
/**
 * Servlet implementation class logCheckServlet
 */
public class logCheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userid = request.getParameter("userid");
        String userpwd = request.getParameter("userpwd");
        String usercheckcode = request.getParameter("checkcode");
        String info = "";
        HttpSession session = request.getSession();
        String servercheckcode = (String)session.getAttribute("createImageServlet");
        if(!servercheckcode.equalsIgnoreCase(usercheckcode)){
            info = "验证码不正确，请重新输入";
        }else if("user".equals(userid)&&"password".equals(userpwd)){
            info = "登陆成功";
        }else{
            info = "用户名或密码不正确";
        }
        request.setAttribute("info", info);
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
 
}

