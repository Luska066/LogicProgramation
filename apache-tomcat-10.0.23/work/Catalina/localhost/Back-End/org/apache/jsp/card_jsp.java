/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.23
 * Generated at: 2022-10-10 01:33:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.ArrayList;
import DAO.ComidaDTO.ComidaDTO;
import DAO.ComidaDAO;

public final class card_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("DAO.ComidaDTO.ComidaDTO");
    _jspx_imports_classes.add("DAO.ComidaDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"headercard.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylescard.css\">\n");
      out.write("        <title>Poppalozo</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <section class=\"background\">\n");
      out.write("            <nav>\n");
      out.write("                <h2>Buguer<span class=\"o\"> o </span>Top</h2>\n");
      out.write("                <ul class=\"ul\">\n");
      out.write("                    <li class=\"li\"><a href=\"index.html\">In??cio</a></li>\n");
      out.write("                    <li class=\"home li\">Card??pio</li>\n");
      out.write("                    <li class=\" li\">Contato</li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <section class=\"header\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <article class=\"text title\">\n");
      out.write("                    <h2>Experimente<br>Nosso Hamburguer</h2>\n");
      out.write("                    <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ipsa maxime laboriosam, distinctio neque eum sunt doloribus, dolorum nihil consectetur vel natus necessitatibus dolorem qui omnis repellendus deleniti unde eaque suscipit?</p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <div class=\"slider\">\n");
      out.write("\n");
      out.write("                    <div class=\"slides\">\n");
      out.write("                        <!--Radio Buttons-->\n");
      out.write("                        <input type=\"radio\" name=\"radio-btn\" id=\"radio1\">\n");
      out.write("                        <input type=\"radio\" name=\"radio-btn\" id=\"radio2\">\n");
      out.write("                        <input type=\"radio\" name=\"radio-btn\" id=\"radio3\">\n");
      out.write("                        <input type=\"radio\" name=\"radio-btn\" id=\"radio4\">\n");
      out.write("                        <!-- Fim Radio Buttons-->\n");
      out.write("\n");
      out.write("                        <!--Slides-->\n");
      out.write("                        <div class=\"first slide\">\n");
      out.write("                            <img src=\"images/hamb1.png\" alt=\"hamburguer\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"slide\">\n");
      out.write("                            <img src=\"images/hamb2.png\" alt=\"hamburguer-2\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"slide\">\n");
      out.write("                            <img src=\"images/hamb3.png\" alt=\"milk-shake\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"slide\">\n");
      out.write("                            <img src=\"images/hamb4.png\" alt=\"batata-nuggets-refri\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Navigation auto-->\n");
      out.write("                        <div class=\"navigation-auto\">\n");
      out.write("                            <button class=\"auto-btn1\"></button>\n");
      out.write("                            <button class=\"auto-btn2\"></button>\n");
      out.write("                            <button class=\"auto-btn3\"></button>\n");
      out.write("                            <button class=\"auto-btn4\"></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"manual-navigation\">\n");
      out.write("                        <label for=\"radio1\" class=\"manual-btn\"></label>\n");
      out.write("                        <label for=\"radio2\" class=\"manual-btn\"></label>\n");
      out.write("                        <label for=\"radio3\" class=\"manual-btn\"></label>\n");
      out.write("                        <label for=\"radio4\" class=\"manual-btn\"></label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section id=\"ii\" class=\"itens\">\n");
      out.write("\n");
      out.write("            ");


                ComidaDAO cDAO = new ComidaDAO();
                ComidaDTO cDTO = new ComidaDTO();
                ArrayList<ComidaDTO> list = cDAO.getAllComida();

                for (int i = 0; i == 0; i++) {
                    out.println("<a href='frmItemVIEW.jsp?id=" + list.get(i).getIdComida() + "&name=" + list.get(i).getNomeComida() + "&descCompleta=" + list.get(i).getDescCompleta()+"&price="+list.get(i).getPrice()+"&img="+list.get(i).getImg()+"'>");
                }
            
      out.write("\n");
      out.write("            <article class=\"comida\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img class=\"hamb-class\" src=\"images/Sem T??tulo-1.png\" alt=\"\">\n");
      out.write("\n");
      out.write("                    <ul class=\"ul1\"> \n");
      out.write("\n");
      out.write("                        <li class=\"header\">\n");
      out.write("                            ");
for (int i = 0; i == 0; i++) {
                            out.println("" + list.get(i).getNomeComida());
                        }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li >\n");
      out.write("                            ");
for (int i = 0; i == 0; i++) {
                            out.println("" + list.get(i).getDescParcial());
                        }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"price\">\n");
      out.write("                            ");
for (int i = 0; i == 0; i++) {
                            out.println("" + list.get(i).getPrice() + "R$");
                        }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </article>\n");
      out.write("            ");
out.println("</a>");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
for (int i = 1; i == 1; i++) {
out.println("<a href='frmItemVIEW.jsp?id=" + list.get(i).getIdComida() + "&name=" + list.get(i).getNomeComida() + "&descCompleta=" + list.get(i).getDescCompleta()+"&price="+list.get(i).getPrice()+"&img="+list.get(i).getImg()+"'>");                }
            
      out.write("\n");
      out.write("            <article class=\"comida\">\n");
      out.write("                <div class=\"item \">\n");
      out.write("                    <img class=\"milk\" src=\"images/milk.png\" width=\"100px\" alt=\"\">\n");
      out.write("\n");
      out.write("                    <ul class=\"ul1\"> \n");
      out.write("\n");
      out.write("                        <li class=\"header headermilk\">\n");
      out.write("                            ");
for (int i = 1; i == 1; i++) {
                            out.println("" + list.get(i).getNomeComida());
                        }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li >\n");
      out.write("                            ");
for (int i = 1; i == 1; i++) {
                            out.println("" + list.get(i).getDescParcial());
                        }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"price\">\n");
      out.write("                            ");
for ( int i = 1; i == 1; i++) {
                            out.println("" + list.get(i).getPrice() + "R$");
                        }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </article>\n");
      out.write("        ");
out.println("</a>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
