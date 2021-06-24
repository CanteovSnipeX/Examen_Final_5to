package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"./css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Sitio Web Admins</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession ses = request.getSession();
           
            String usuario;
            int nivel=0;
            
            if(ses.getAttribute("Usuario")!=null && ses !=null && ses.getAttribute("nivel")!=null){
                usuario = ses.getAttribute("usuario").toString();
                nivel = Integer.parseInt(ses.getAttribute("nivel").toString());
                
                if(nivel!=1){
                            response.sendRedirect("index.jsp");
                }    
            }else{       
                response.sendRedirect("index.jsp"); 
            }   
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"position-relative\" style=\"max-height: 100vh; max-width: 100vw\">\n");
      out.write("            <img src=\"img/3.jpg\" class=\"img-index\" alt=\"Responsive image\" style=\"width: 100%; height: 100vh;\">\n");
      out.write("            <div class=\"col-9 text-center text-light\" style=\"position: absolute; bottom: 100px; color: white;\">\n");
      out.write("                <div class=\"container col text-container\">\n");
      out.write("                    <h1 class=\"text-center text-uppercase\">Bienvenidos al Apartado de Administacion</h1>\n");
      out.write("                    <p class=\"lead\">No conozco la clave del éxito, pero sé que la clave del fracaso es tratar de complacer a todo el mundo <br></p>\n");
      out.write("                </div><br>\n");
      out.write("                    <a  class=\"btn btn-primary btn-lg\" href=\"Controlador?accion=listar\"><strong>Ingresar</strong></a>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
