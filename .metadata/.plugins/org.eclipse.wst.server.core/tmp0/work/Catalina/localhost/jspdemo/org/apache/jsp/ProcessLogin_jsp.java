/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.92
 * Generated at: 2023-10-18 07:26:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProcessLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Welcome to the Portal</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Add colorful CSS */\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Times New Roman', serif;\r\n");
      out.write("            background-color: #ffe4e1; /* Light Pink */\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            max-width: 600px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background: #fff; /* White */\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        h2 {\r\n");
      out.write("            font-size: 28px;\r\n");
      out.write("            color: #8e44ad; /* Purple */\r\n");
      out.write("        }\r\n");
      out.write("        .message {\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            color: #3498db; /* Blue */\r\n");
      out.write("        }\r\n");
      out.write("        .button {\r\n");
      out.write("            background-color: #f39c12; /* Yellow */\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            padding: 12px 24px;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            transition: background-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("        .button:hover {\r\n");
      out.write("            background-color: #e67e22; /* Orange */\r\n");
      out.write("        }\r\n");
      out.write("        .error {\r\n");
      out.write("            color: #e74c3c; /* Red */\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    ");

    String user = request.getParameter("username");
    String password = request.getParameter("password");

    if (user.equals("Akula") && password.equals("Akula@143")) {
        session.setAttribute("user", user);
    
      out.write("\r\n");
      out.write("        <h2>Welcome, ");
      out.print(user);
      out.write("</h2>\r\n");
      out.write("        <p class=\"message\">You are now logged in.</p>\r\n");
      out.write("        <h3 style=\"color:#f39c12\">Welcome to the Add Product Page</h3>\r\n");
      out.write("        <a class=\"button\" href='AddProduct.jsp'>Add a New Product</a>\r\n");
      out.write("    ");

    } else if (user.equals("User") && password.equals("User@143")) {
        session.setAttribute("user", user);
    
      out.write("\r\n");
      out.write("        <h2>Welcome, ");
      out.print(user);
      out.write("</h2>\r\n");
      out.write("        <p class=\"message\">You are now logged in.</p>\r\n");
      out.write("        <h3 style=\"color:#f39c12\">Welcome to the Product List Page</h3>\r\n");
      out.write("        <a class=\"button\" href=\"ProductList.jsp\">View Products</a>\r\n");
      out.write("    ");

    } else {
    
      out.write("\r\n");
      out.write("        <h3 class=\"error\">Invalid credentials</h3>\r\n");
      out.write("        <a class=\"button\" href=\"Login.html\">Retry</a>\r\n");
      out.write("    ");

    }
    
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
