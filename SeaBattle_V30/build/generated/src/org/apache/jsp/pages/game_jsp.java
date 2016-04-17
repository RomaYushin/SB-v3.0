package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.lang.Integer;

public final class game_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tlds/Print_Library.tld");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> SEA BATTLE V3.0 </title>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/SeaBattle_V30_game.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/ui/1.11.2/jquery-ui.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/game2.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"header\"> SEA BATTLE </div>\t\t\t\n");
      out.write("            <div id=\"Inf\">\n");
      out.write("                <div id=\"GamerInf\"> GamerInf </div>\t\t\t\t\n");
      out.write("                <div id=\"ComputerInf\"> ComputerInf </div>\t\n");
      out.write("                <div id=\"PictureInf\">                     \n");
      out.write("                    <div id = \"showGamerWin\">\n");
      out.write("                        <p> TRIUMPH !!!         </br>\n");
      out.write("                            YOU ARE WINNER!!!   </br>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id = \"showComputerWin\">\n");
      out.write("                        <p> COMPUTER WIN!!!    </br>\n");
      out.write("                            YOU ARE LOSER !!!   </br>\n");
      out.write("                        </p>\n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("                    <div id = \"showAlreadyShoot\">\n");
      out.write("                        <p> YOU HAVE ALREADY SHOOT </br>\n");
      out.write("                            ON THIS COORDINATE!!! </br>\n");
      out.write("                            TRY AGAIN </br>\n");
      out.write("                        </p>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\t\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"Battlefield\">                \n");
      out.write("                <div id=\"GamerBattlefield\">\t\n");
      out.write("                    ");
      if (_jspx_meth_ex_printUsedBattlefieldGamer_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div> \t\n");
      out.write("\n");
      out.write("                <div id=\"ComputerBattlefield\">             \n");
      out.write("                    ");
      if (_jspx_meth_ex_printUsedBattlefieldComputer_0(_jspx_page_context))
        return;
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"GamerMove\"> \n");
      out.write("                    <!-- GamerMove -->\n");
      out.write("                    <img src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/greenTriangle_150x150.png\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"ComputerMove\"> \n");
      out.write("                    <!-- ComputerMove -->\n");
      out.write("                    <img src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/redTriangle_150x150.png\">\n");
      out.write("                </div>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\" >\n");
      out.write("                <div id=\"GamerFooter\"> MY FLEET </div>\n");
      out.write("                <div id=\"ComputerFooter\"> COMPUTER FLEET </div>\n");
      out.write("                <div id=\"EndGameFooter\">\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ControllerServlet?action=PREPARATION_VS_COMPUTER\">\n");
      out.write("                        <button id=\"btn1\"> \n");
      out.write("                            NEW GAME \n");
      out.write("                        </button></a>\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ControllerServlet?action=INDEX\">\n");
      out.write("                        <button id=\"btn2\"> \n");
      out.write("                            EXIT  \n");
      out.write("                        </button></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_ex_printUsedBattlefieldGamer_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ex:printUsedBattlefieldGamer
    printTags.PrintUsedBattlefieldGamer _jspx_th_ex_printUsedBattlefieldGamer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(printTags.PrintUsedBattlefieldGamer.class) : new printTags.PrintUsedBattlefieldGamer();
    _jspx_th_ex_printUsedBattlefieldGamer_0.setJspContext(_jspx_page_context);
    _jspx_th_ex_printUsedBattlefieldGamer_0.setUsedBattlefieldGamer((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usedBattlefieldGamer}", java.util.Map.class, (PageContext)_jspx_page_context, null));
    _jspx_th_ex_printUsedBattlefieldGamer_0.doTag();
    return false;
  }

  private boolean _jspx_meth_ex_printUsedBattlefieldComputer_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ex:printUsedBattlefieldComputer
    printTags.PrintUsedBattlefieldComputer _jspx_th_ex_printUsedBattlefieldComputer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(printTags.PrintUsedBattlefieldComputer.class) : new printTags.PrintUsedBattlefieldComputer();
    _jspx_th_ex_printUsedBattlefieldComputer_0.setJspContext(_jspx_page_context);
    _jspx_th_ex_printUsedBattlefieldComputer_0.setUsedBattlefieldComp((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usedBattlefieldComp}", java.util.Map.class, (PageContext)_jspx_page_context, null));
    _jspx_th_ex_printUsedBattlefieldComputer_0.doTag();
    return false;
  }
}
