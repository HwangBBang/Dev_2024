package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String viewPath = "/WEB-INF/views/new-form.jsp";
        // Controller 에서 View 로 이동해야한다. <- Dispatcher 에게 View 경로를 넘겨주면
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);

        // JSP (view) 를 호출
        // dispatcher.forward() : 다른 서블릿이나 JSP로 이동할 수 있는 기능이다.
        // 서버 내부에서 다시 호출이 발생한다.
        dispatcher.forward(request,response);
    }
}
