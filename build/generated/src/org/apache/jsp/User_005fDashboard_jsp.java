package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <title>E-Pass Registration</title>\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .abc{\r\n");
      out.write("                padding: 5px;\r\n");
      out.write("                background: linear-gradient(to left, gold, limegreen);\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("            #tagline{\r\n");
      out.write("                color: #000123;\r\n");
      out.write("                margin-top: -15px;\r\n");
      out.write("                font-size: 15px;\r\n");
      out.write("                font-style: italic;\r\n");
      out.write("            }\r\n");
      out.write("            .form{\r\n");
      out.write("                width: 30%;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                background-color: gold;\r\n");
      out.write("                font-family: Arial;\r\n");
      out.write("                font-size: 12px;\r\n");
      out.write("                float: right;\r\n");
      out.write("                margin-top: 10%;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            .heading{\r\n");
      out.write("                color: limegreen;\r\n");
      out.write("                font-family: Arial;\r\n");
      out.write("            }\r\n");
      out.write("            a{\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("            a:hover{\r\n");
      out.write("                color: #000123;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("            }\r\n");
      out.write("            .btn{\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("            }\r\n");
      out.write("            .well{\r\n");
      out.write("                background-color: gold;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                box-shadow: 2px 2px rgba(0,0,0,0.3);\r\n");
      out.write("            }\r\n");
      out.write("            .well{\r\n");
      out.write("                box-shadow: 2px 2px rgba(0,0,0,0.3);\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            String session_username = (String) session.getAttribute("session_username");

            String session_password = (String) session.getAttribute("session_password");
            int session_user_id = (Integer) session.getAttribute("session_uid");

        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"jumbotron abc\">\r\n");
      out.write("            <h3>E-Pass Traveller</h3>\r\n");
      out.write("            <p id=\"tagline\">Govt. Authorised E-Pass Services</p>\r\n");
      out.write("            <h3>Welcome ");
 out.print(session_username);
      out.write(" For E Travel Pass</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-3\">\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <a href=\"ApplyForEPass.html\">Apply For E Pass</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-3\">\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <a href=\"DisplayApprovalPassStatus\">E Pass Approval Status</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-3\">\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <a href=\"EPassStatus\">On Hold</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-3\">\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <a href=\"EPassStatus\">On Hold</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
