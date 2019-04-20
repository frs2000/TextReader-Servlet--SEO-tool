package ServletPage;

import JavaClass.Logic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello2")
public class MainPage2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doPost(req, resp);

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String textArea1 = request.getParameter("textArea1");
        String textArea2 = request.getParameter("textArea2");
        
        Logic workLogic = new Logic( textArea1 , textArea2 );
        
        request.setAttribute("text111", workLogic.getText111());
        request.setAttribute("text222", workLogic.getText222());
        
        request.getRequestDispatcher("page.jsp").forward(request, response);

    }
}


