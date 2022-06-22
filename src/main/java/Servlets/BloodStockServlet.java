package Servlets;

import DAOs.BloodStockDAO;
import Entities.BloodStock;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/BloodStockServlet")
public class BloodStockServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("action").equals("addblood"))
        {
            String blood_group = request.getParameter("blood_group");
            Integer Quantity = Integer.parseInt(request.getParameter("quantity"));
            Integer Location = Integer.parseInt(request.getParameter("Location"));
            Integer donor = Integer.parseInt(request.getParameter("donor"));
            BloodStock b_obj= new BloodStock();
            b_obj.setBloodgroup(blood_group);
            b_obj.setFkdonor(donor);
            b_obj.setQuantity(Quantity);
            b_obj.setFklocation(Location);
            BloodStockDAO bdao= new BloodStockDAO();
            if(bdao.saveBlood(b_obj)){
                RequestDispatcher rd= request.getRequestDispatcher("add-blood.jsp");
                rd.forward(request,response);
            }


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
