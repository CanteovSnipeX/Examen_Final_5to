package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import modelo.Persona;
import modeloDAO.PersonaDAO;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Página Web - Listar</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #e1e1e1;\">\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron jumbotron-fluid text-center bg-light rounded\" style=\"padding: 2rem;\">\n");
      out.write("                <h1 class=\"display-4 text-uppercase\"> <strong>Pagina de Listar  </strong></h1>\n");
      out.write("                <hr class=\"my-4\">\n");
      out.write("                <p>Para agregar un nuevo dato, hacer click en el siguiente botón</p>\n");
      out.write("                <a class=\"btn btn-success btn-lg btn-block\" href=\"Controlador?accion=add\"> <strong>Agregar Nuevo</strong></a>\n");
      out.write("                                <hr>\n");
      out.write("\n");
      out.write("                <p class=\"lead text-muted\">Aquí podras encontrar los datos ingresados.</p>\n");
      out.write("            </div>\n");
      out.write("                <table class=\"table table-bordered bg-light\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td class=\" btn-primary btn-lg text-center \"><Strong>CODIGO PERSONA</Strong></td>\n");
      out.write("                            <td class=\"btn-primary btn-lg text-center\"><Strong>DPI</Strong></td>\n");
      out.write("                            <td class=\"btn-primary btn-lg text-center\"><Strong>NOMBRES</Strong></td>\n");
      out.write("                            <td class=\"btn-primary btn-lg text-center\"><Strong>ACCIONES</Strong></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    ");
 
                        PersonaDAO dao = new PersonaDAO();
                        List<Persona> listaPersona = dao.listar();
                        Iterator<Persona> iterator = listaPersona.iterator();
                        Persona per = null;
                        while (iterator.hasNext()){
                            per = iterator.next();

                    
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"text-center \">");
      out.print(per.getCodigoPersona()  );
      out.write("</td>\n");
      out.write("                            <td class=\"text-center\">");
      out.print(per.getDPI()  );
      out.write("</td>\n");
      out.write("                            <td class=\"text-center \">");
      out.print(per.getNombrePersona()  );
      out.write("</td>\n");
      out.write("\n");
      out.write("                            <td class=\"text-center\">\n");
      out.write("                            <a  class=\" btn btn-primary \"  href=\"Controlador?accion=editar&codigoPersona=");
      out.print( per.getCodigoPersona());
      out.write("\"> Editar </a>\n");
      out.write("                            <a   class=\"btn btn-danger\" href= \"Controlador?accion=eliminar&codigoPersona=");
      out.print( per.getCodigoPersona());
      out.write("\"> Eliminar </a>        \n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>       \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write(" \n");
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
