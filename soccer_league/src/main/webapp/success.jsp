    
    <%@page import="java.util.List"
    import ="java.io.IOException"
import ="java.io.PrintWriter"

import ="javax.servlet.ServletException"
import ="javax.servlet.http.HttpServlet"
import ="javax.servlet.http.HttpServletRequest"
import ="javax.servlet.http.HttpServletResponse"
import ="org.example.entity.LeagueEntity"
import ="org.example.factory.MyHibernateSessionFactory"
import ="org.example.model.League"
import ="org.hibernate.Session"
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>

<%


		League league = (League) request.getAttribute("LEAGUE");
		LeagueEntity entity=new LeagueEntity(league.getYear(), league.getSeason(), league.getTitle());
		try {
				
		    Session s = MyHibernateSessionFactory.getHibernateSession();
			s.getTransaction().begin();
			s.save(entity);
			s.getTransaction().commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		out.println("<h2>League Added Sucessfully l</h2><hr><br/>" + "League year: " + league.getYear()
				+ "<br/>League season: " + league.getSeason() + "<br/>" + "League title: " + league.getTitle()
				+ "<br/><br/>");


%>


<a href='index.jsp'>Home</a>
</body>
</html>