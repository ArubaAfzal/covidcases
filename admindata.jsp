<%-- 
    Document   : admindata
    Created on : 27-Jan-2022, 12:52:54
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
            
        String Aid=request.getParameter("Aid");
        String Aname=request.getParameter("Aname");
        
           
       
      
        try{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/covidcase","root","");
        Statement st= conn.createStatement();
        
      

        int i = st.executeUpdate("insert into admintable values('"+Aid+"','"+Aname+"')");
        
        out.println("Data Inserted Successfully");
        
      }
      catch (Exception e)
      {
      
      System.out.print(e);
      e.printStackTrace();
      }
       






           %>         
                         

    </body>
</html>
