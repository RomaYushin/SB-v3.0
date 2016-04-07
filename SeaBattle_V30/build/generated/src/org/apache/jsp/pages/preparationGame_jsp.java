package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class preparationGame_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> SEA BATTLE V3.0 </title>\n");
      out.write("        <link href=\"css/SeaBattle_V30_preparationGame.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\t\t\n");
      out.write("\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <a href=\"index.jsp\" id=\"a1\"><button name=\"GamerVSComputer\" value=\"GamerVSComputer\" id=\"btn1\"> BACK </button></a>\t\n");
      out.write("                <p id=\"headerName\" > SEA BATTLE </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"header2\">\n");
      out.write("                <p> ARRANGE SHIPS </p>\n");
      out.write("            </div>\t\n");
      out.write("\n");
      out.write("            <div id=\"Buttons\">\n");
      out.write("                <div id=\"a2\"> \n");
      out.write("                    <a href=\"#\" id=\"a2\"><button name=\"setAuto\" value=\"setAuto\" id=\"btn2\"> ARRANGE SHIPS RANDOMLY </button></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"a3\"> \n");
      out.write("                    <a href=\"pages/game.jsp\" ><button name=\"Game\" value=\"Game\" id=\"btn3\"> GO ON! </button></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\t\n");
      out.write("\n");
      out.write("            <div id=\"mainContent\">\n");
      out.write("                <div id=\"Ships\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"Battlefield\">\n");
      out.write("                </div>\n");
      out.write("            </div>\t\n");
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
