package Servlets;

import DAOs.RequestDAO;
import Entities.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/RequestServlet")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String first_name= request.getParameter("first_name");
        String last_name= request.getParameter("last_name");
        String email= request.getParameter("email");
        String phone= request.getParameter("phone");
        String address= request.getParameter("address");
        String bloodgroup= request.getParameter("bloodgroup");
        Integer location= Integer.parseInt(request.getParameter("Location"));

        Request req= new Request();
        req.setFirst_Name(first_name);
        req.setLast_Name(last_name);
        req.setEmail(email);
        req.setPhone(phone);
        req.setBloodgroup(bloodgroup);
        req.setAddress(address);
        req.setLocationfk(location);

        RequestDAO reqdao= new RequestDAO();
        if(reqdao.saverequest(req)){
            ///Check Bloodstock email method
            //Bloods.jsp should be modified  should be able to see total blood stock
            // also should be able to search blood according location
        }





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
