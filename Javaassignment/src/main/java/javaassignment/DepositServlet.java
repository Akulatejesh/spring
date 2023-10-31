package javaassignment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("userId") != null) {
            String userId = (String) session.getAttribute("userId");
            double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));

            Connection connection = null;

            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");


                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db", "root", "Tejeshakula123@");

               
                String updateBalanceQuery = "UPDATE users SET balance = balance + ? WHERE user_id = ?";
                PreparedStatement updateBalanceStatement = connection.prepareStatement(updateBalanceQuery);
                updateBalanceStatement.setDouble(1, depositAmount);
                updateBalanceStatement.setString(2, userId);
                int rows = updateBalanceStatement.executeUpdate();

                if (rows > 0) {
                
                    String getBalanceQuery = "SELECT balance FROM users WHERE user_id = ?";
                    PreparedStatement getBalanceStatement = connection.prepareStatement(getBalanceQuery);
                    getBalanceStatement.setString(1, userId);
                    ResultSet resultSet = getBalanceStatement.executeQuery();

                    if (resultSet.next()) {
                        double updatedBalance = resultSet.getDouble("balance");

                      
                        request.setAttribute("balance", updatedBalance);

                      
                        request.getRequestDispatcher("balance.jsp").forward(request, response);
                    } else {
                      
                        response.sendRedirect("home.jsp");
                    }
                } else {
                    
                    response.sendRedirect("home.jsp");
                }
            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("home.jsp");
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}