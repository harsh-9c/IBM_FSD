<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page   import ="java.io.IOException"
import ="java.io.PrintWriter"
import ="java.util.Iterator"

import ="java.util.List"
import ="javax.persistence.TypedQuery"
import ="javax.servlet.ServletException"
import ="javax.servlet.http.HttpServlet"
import ="javax.servlet.http.HttpServletRequest"
import ="javax.servlet.http.HttpServletResponse"

import ="org.example.entity.LeagueEntity"
import ="org.example.factory.MyHibernateSessionFactory"
import ="org.hibernate.Session"
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All leagues</title>
</head>
<body>

<%
    List<LeagueEntity> leagueList=null;


    try {
	    Session s=MyHibernateSessionFactory.getHibernateSession();
	    TypedQuery<LeagueEntity> query=s.createQuery(" FROM LeagueEntity L",LeagueEntity.class);
	    leagueList=query.getResultList();
     } catch (Exception e) {
	
	    e.printStackTrace();
     }

%>

      <html>
      <head>
      <title>All leagues</title>
      </head>
      <body bgcolor='white'>
      <table border='1' cellpadding='5' cellspacing='0' width='400'>
      <tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
      <td><h3>Duke's soccer league</h3></td>
      
      </tr>
      
      </table>
      
      <p>Available leagues are:</p>
      
      <ul>
        <%
           Iterator<LeagueEntity> items = leagueList.iterator();
           while (items.hasNext()) {
	           LeagueEntity league = items.next();
	           out.println(" <li>" + league.getTitle() + "</li>");
           }%>
           </ul>
           <br/><br/>
           <a href='index.jsp'>Home</a>     
      
      </body>
      </html>

</body>
</html>