package ServletPage;

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

        String[] line;
        String delimeter = "\n";
        line = textArea1.split(delimeter);
        //System.out.println(line.length);

        for (int i = 0 ; i<line.length ; i++){
            //System.out.println(line[i]);
            String tempWord = line[i];
            if (tempWord.indexOf(' ') != -1){
                line[i] = tempWord.substring(0, tempWord.length()-1);
            }
        }

        String str = textArea2;
        String[] srt2;
        String delimeter2 = "\n";
        srt2 = textArea2.split(delimeter2);

        int tempParam = 0;
        for (int i = 0 ; i<line.length ; i++) {
            //System.out.println(line[i]);

            String tempWirhPoint = line[i]+"." ;
            String tempWithChar = line[i]+"," ;

            if (str.indexOf(line[i]) != -1 || str.indexOf(tempWirhPoint) != -1 || str.indexOf(tempWithChar) != -1) {
                String []splitArray = textArea2.split(line[i]);
                tempParam = splitArray.length - 1;
            }
            line[i] = line[i] + " ("+tempParam+")";
            tempParam = 0;
        }

        String forPrint = "" ;
        for (int i = 0 ; i<line.length ; i++){
            // System.out.println(line[i]);
            forPrint = forPrint + line[i]+" \n";
        }

        String text111 = "";
        for (int aaa = 0 ; aaa<line.length ; aaa++){
            text111 = text111 + line[aaa] + "\n";
        }

        String text222 = "";
        for (int bbb = 0 ; bbb<srt2.length ; bbb++){
            text222 = text222 + srt2[bbb] + "\n";
        }

        request.setAttribute("text111", text111);
        request.setAttribute("text222", text222);

        request.getRequestDispatcher("page.jsp").forward(request, response);

    }
}


