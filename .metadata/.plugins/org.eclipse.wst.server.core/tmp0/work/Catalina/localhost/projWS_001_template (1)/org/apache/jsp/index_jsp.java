/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2016-05-02 17:01:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- JAX-RS @MatrixParam example ######################################## -->\r\n");
      out.write("    <!-- TITLE -->\r\n");
      out.write("\t<h1>Jersey RESTful Web Application!</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- TXT -->\r\n");
      out.write("\t<p>Testing the API created using this logic: \r\n");
      out.write("\t\t<a href=\"http://www.mkyong.com/webservices/jax-rs/jax-rs-matrixparam-example/\">MatrixParam Example</a>\r\n");
      out.write("\t</p><br/>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- LINKS -->\r\n");
      out.write("\t<h3>/projWS_001_template</h3>\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/\">WEB API (index)</a><br/><br/>\r\n");
      out.write("\t\r\n");
      out.write("\t<h3>/projWS_001_template/more-params</h3>\r\n");
      out.write("\t<p>In above URI, the matrix parameter is author=americo, separate by a semi colon ;</p>\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/americolib/ws/2011/\">MatrixParam multiple PARAMETERS 1</a><br/><br/>\t\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/americolib/ws/2011;author=americo\">MatrixParam multiple PARAMETERS 2</a><br/><br/>\t\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/americolib/ws/2011;author=tomas;country=portugal\">MatrixParam multiple PARAMETERS 3</a><br/><br/>\t\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/americolib/ws/2011;country=malaysia;author=ana\">MatrixParam multiple PARAMETERS 4</a><br/><br/>\t\r\n");
      out.write("\t   \r\n");
      out.write("    <!-- JAX-RS @FormParam example ######################################## -->\r\n");
      out.write("    <!-- FORM: binding between html and java classes -->  \r\n");
      out.write("    <h1>JAX-RS @FormQuery Testing</h1>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"americolib/ws/add\" method=\"post\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\tName : <input type=\"text\" name=\"name\" />\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\tAge : <input type=\"text\" name=\"age\" />\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"Add User\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Get HTTP header in JAX-RS ######################################## -->\r\n");
      out.write("    <!-- TITLE -->\r\n");
      out.write("\t<h1>Jersey RESTful Web Application!</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- TXT -->\r\n");
      out.write("\t<p>Testing the API created using this logic: \r\n");
      out.write("\t\t<a href=\"http://www.mkyong.com/webservices/jax-rs/get-http-header-in-jax-rs/\">HeaderParam  Example</a>\r\n");
      out.write("\t</p><br/>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- LINKS -->\r\n");
      out.write("\t<h3>/projWS_001_template</h3>\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/\">WEB API (index)</a><br/><br/>\r\n");
      out.write("\t\r\n");
      out.write("\t<h3>/projWS_001_template/more-params</h3>\r\n");
      out.write("\t<p>In this example, it gets the browser user-agent from request header</p>\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/americolib/ws/get1/\">HeaderParam 1</a><br/><br/>\t\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/americolib/ws/get2/\">HeaderParam 2</a><br/><br/>\t\r\n");
      out.write("\r\n");
      out.write("  \t<!-- Download text file from JAX-RS ######################################## -->\r\n");
      out.write("    <!-- TITLE -->\r\n");
      out.write("\t<h1>Jersey RESTful Web Application!</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- TXT -->\r\n");
      out.write("\t<p>Testing the API created using this logic: \r\n");
      out.write("\t\t<a href=\"http://www.mkyong.com/webservices/jax-rs/download-text-file-from-jax-rs/\">Download Text File Example</a>\r\n");
      out.write("\t</p><br/>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- LINKS -->\r\n");
      out.write("\t<h3>/projWS_001_template</h3>\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/\">WEB API (index)</a><br/><br/>\r\n");
      out.write("\t\r\n");
      out.write("\t<h3>/projWS_001_template/americolib/ws/file/get/</h3>\r\n");
      out.write("\t<a href=\"http://localhost:8085/projWS_001_template/americolib/ws/file/get\">Download Text File</a><br/><br/>\t\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
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
