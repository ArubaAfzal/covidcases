package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Studentdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    
                           public int positivecases(String Stest)
                         {
int count =0;
                         
                           if(Stest=="positive")
                     {
                            count++; 
                        
                            }
return(count);
}

public int check( int a)
{
if(a=='a')



{
System.out.println("error");

}


return(a);


}


           
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"Administration.jsp\">next page </a>\n");
      out.write("        \n");
      out.write("        ");

            
        String Sclass=request.getParameter("Sclass");
        String Sname=request.getParameter("Sname");
        String Stest=request.getParameter("Stest");
            int a= Integer.parseInt(Sclass);
       
      
        try{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/covidcase","root","");
        Statement st= conn.createStatement();
        
      

        int i = st.executeUpdate("insert into studenttable values('"+Sclass+"','"+Sname+"','"+Stest+"','"+positivecases(Stest)+"')");
        
        out.println("Data Inserted Successfully");
        
      }
      catch (Exception e)
      {
      
      System.out.print(e);
      e.printStackTrace();
      }
       




      out.write('\n');
      out.write('\n');
      out.write("         \n");
      out.write("                         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write(" \n");
      out.write("           \n");
      out.write("\n");
      out.write("                           %>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
