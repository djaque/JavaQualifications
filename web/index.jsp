<%-- 
    Document   : index
    Created on : 26-jul-2019, 19:47:47
    Author     : dany
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.students.Qualifications"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Notas!</h1>
        
        
        <table border="1">
            <TR>
                <TD colspan="3">
                    <form action="save" method="post">
                        <input type="text" name="alumno" placeholder="Nombre del alumno:">
                        <input type="text" name="nota"   placeholder="Nota">
                        <input type="hidden" name="action" value="Guardar">
                        <input type="submit" value="Save">
                    </form>
                </TD>
                
            </TR>
            <%! private List<Qualifications> students = new ArrayList<>();%>
            
            <% 
                if( null != request.getAttribute("students")) {
                    students = (List<Qualifications>)request.getAttribute("students"); 
                }
            %>
            
            <%
                for(int s=0; s< students.size(); s++) {
                    Qualifications q = students.get(s);
                    %>
                    <tr>
                        <td><%=q.getId()%></td>
                        <td><%=q.getName()%></td>
                        <td><%=q.getQualification()%></td>
                    </tr>
                    <%
                }
             %>
        </table>
    </body>
</html>
