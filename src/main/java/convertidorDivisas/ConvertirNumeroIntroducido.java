package convertidorDivisas;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Servlet implementation class ConvertirNumeroIntroducido
 */
public class ConvertirNumeroIntroducido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConvertirNumeroIntroducido() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		float cantidadEuros = Float.parseFloat(request.getParameter("cantidad"));
		String divisaSeleccionada = request.getParameter("divisa");
		
        float resultado = 0;

        if ("pesetas".equals(divisaSeleccionada)) {
            resultado = Convertir.eurosAPesetas(cantidadEuros);
        } else if ("libras".equals(divisaSeleccionada)) {
            resultado = Convertir.eurosALibras(cantidadEuros);
        }

        
        System.out.println("Cantidad: " + cantidadEuros);
        System.out.println("Divisa: " + divisaSeleccionada);
        
        
		response.setContentType("text/plain");
		response.getWriter().write("El resultado es: " + resultado + " " + divisaSeleccionada);
		
		response.setStatus(200);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
	
		
	}

}
