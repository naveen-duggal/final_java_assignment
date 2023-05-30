package in.ineuron;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Database connection details
        String jdbcUrl = "jdbc:mysql:///project";
        String username = "root";
        String password = "Naveen@132";

        // SQL query to retrieve data
        String query = "SELECT * FROM student1";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a statement object to execute the SQL query
            Statement statement = connection.createStatement();

            // Execute the SQL query and obtain the result set
            ResultSet resultSet = statement.executeQuery(query);

            // Set the content type of the response to HTML
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            // Generate the HTML table
            out.println("<html><body>");
            out.println("<table border=\"1\">");
            out.println("<tr><th>ID</th><th>Name</th><th>Age</th><th>Address</th></tr>");

            // Iterate over the result set and populate the HTML table
            while (resultSet.next()) {
                int id = resultSet.getInt("sid");
                String name = resultSet.getString("sname");
                int age = resultSet.getInt("sage");
                String address = resultSet.getString("saddress");

                out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td><td>"+address+"</td></tr>");
            }

            out.println("</table>");
            out.println("</body></html>");

            // Close the database resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}