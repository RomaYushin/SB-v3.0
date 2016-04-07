package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import SeaBattle_V20.PreparationGame;

public final class gamerBattlefield_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
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
      out.write("<table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>  </th>\n");
      out.write("                    <th> A </th>\n");
      out.write("                    <th> B </th>\n");
      out.write("                    <th> C </th>\n");
      out.write("                    <th> D </th>\n");
      out.write("                    <th> E </th>\n");
      out.write("                    <th> F </th>\n");
      out.write("                    <th> G </th>\n");
      out.write("                    <th> H </th>\n");
      out.write("                    <th> I </th>\n");
      out.write("                    <th> J </th>\n");
      out.write("                </tr>\n");
      out.write("                ");
 String valueOfCaseGamer; 
      out.write("\n");
      out.write("                ");
 try { 
      out.write("\n");
      out.write("                    ");
 Map<String, Integer> battlefieldGamer = PreparationGame.getBattlefieldGamer(); 
      out.write("\n");
      out.write("                    ");
 battlefieldGamer.get("A1"); 
      out.write("\n");
      out.write("                    ");
 for (int i = 1; i <= 10; i++) {
      out.write("\n");
      out.write("                        <tr><td class = \"left-column\"> ");
      out.print( i);
      out.write(" </td>\n");
      out.write("                            ");
 for (int j = 65; j <= 74; j++) { 
      out.write("                                                   \n");
      out.write("                                ");
 valueOfCaseGamer = Character.toString((char) j) + i;
      out.write("                                         \n");
      out.write("                                ");
 if (battlefieldGamer.get(valueOfCaseGamer)>100){
      out.write("\n");
      out.write("                                    <td class=\"yesShip\" id = \" ");
      out.print( "G" + valueOfCaseGamer );
      out.write("\" ></td>                                            \n");
      out.write("                                ");
 } else {
      out.write("\n");
      out.write("                                    <td id = \"");
      out.print( "G" + valueOfCaseGamer );
      out.write("\" > </td>\n");
      out.write("                                ");
}
      out.write("                                            \n");
      out.write("                            ");
}
      out.write("  \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                ");
} catch (NullPointerException e) {
      out.write("\n");
      out.write("                    ");
 System.out.println(e); 
      out.write("\n");
      out.write("                    ");
 for (int i = 1; i <= 10; i++) {
      out.write("\n");
      out.write("                        <tr><td class = \"left-column\"> ");
      out.print( i);
      out.write(" </td>\n");
      out.write("                            ");
 for (int j = 65; j <= 74; j++) { 
      out.write("                                                   \n");
      out.write("                                ");
 valueOfCaseGamer = Character.toString((char) j) + i;
      out.write("                                          \n");
      out.write("                                    <td id = \"");
      out.print( "G" + valueOfCaseGamer );
      out.write("\" > </td>                                                                           \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                    ");
}
      out.write("                     \n");
      out.write("                ");
}
      out.write("\n");
      out.write("</table>\n");
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
