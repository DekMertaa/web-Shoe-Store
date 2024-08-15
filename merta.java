package merta;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "merta", urlPatterns = {"/merta"})
public class merta extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Shoe Store</title>");
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: Arial, sans-serif;");
            out.println("  margin: 0;");
            out.println("  padding: 0;");
            out.println("  background-color: #f4f4f4;");
            out.println("}");
            out.println("header {");
            out.println("  background-color: #9e9e9e;"); // Abu-abu
            out.println("  color: white;");
            out.println("  padding: 10px 0;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav {");
            out.println("  margin: 0;");
            out.println("  padding: 10px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav a {");
            out.println("  margin: 0 15px;");
            out.println("  text-decoration: none;");
            out.println("  color: #1976d2;");
            out.println("}");
            out.println("section {");
            out.println("  padding: 20px;");
            out.println("  text-align: center;");
            out.println("  display: flex;");
            out.println("  flex-wrap: wrap;");
            out.println("  justify-content: center;");
            out.println("}");
            out.println("div.product {");
            out.println("  margin: 20px;");
            out.println("  padding: 20px;");
            out.println("  background-color: white;");
            out.println("  border-radius: 8px;");
            out.println("  box-shadow: 0 0 10px rgba(0,0,0,0.1);");
            out.println("  width: 200px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("img {");
            out.println("  width: 100%;");
            out.println("  height: auto;");
            out.println("  border-radius: 8px;");
            out.println("}");
            out.println("h2 { color: #1976d2; }");
            out.println("footer {");
            out.println("  background-color: #9e9e9e;"); // Abu-abu
            out.println("  color: white;");
            out.println("  padding: 10px 0;");
            out.println("  text-align: center;");
            out.println("  position: fixed;");
            out.println("  width: 100%;");
            out.println("  bottom: 0;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Welcome to Shoe Store</h1>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href='snkrs'>SNKRS</a>");
            out.println("<a href='about'>About</a>");
            out.println("<a href='contact'>Contact</a>");
            out.println("</nav>");
            out.println("<section>");
            out.println("<div class='product'>");
            out.println("<img src='path/to/shoe1.jpg' alt='Casual Sneakers'>");
            out.println("<h2>Casual Sneakers</h2>");
            out.println("<p>Price: $50</p>");
            out.println("<p>Comfortable sneakers for everyday wear.</p>");
            out.println("</div>");

            out.println("<div class='product'>");
            out.println("<img src='path/to/shoe2.jpg' alt='Formal Shoes'>");
            out.println("<h2>Formal Shoes</h2>");
            out.println("<p>Price: $80</p>");
            out.println("<p>Elegant shoes for formal occasions.</p>");
            out.println("</div>");

            out.println("<div class='product'>");
            out.println("<img src='path/to/shoe3.jpg' alt='Sports Footwear'>");
            out.println("<h2>Sports Footwear</h2>");
            out.println("<p>Price: $70</p>");
            out.println("<p>Durable footwear designed for sports and activities.</p>");
            out.println("</div>");
            
            out.println("</section>");
            out.println("<footer>");
            out.println("<p>&copy; 2024 Shoe Store. All rights reserved.</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Shoe Store Webpage";
    }
}
