<%-- 
    Document   : Studentdata
    Created on : 27-Jan-2022, 11:26:53
    Author     : aruba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%@page import ="java.sql.*,java.util.*"%>
        <%
            
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
       



%>

<%!
    
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


           %>         
                         



       
 
           

                           %>
        
    </body>
</html>
