import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Sample extends HttpServlet
{
  @override
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
      res.setContentType("text/html");
      PrintWriter p=res.getWriter();
      p.print("Hello I am Shreyas Kulkarni");
    }
    @override
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
      doPost(req,res);
     }
 }
