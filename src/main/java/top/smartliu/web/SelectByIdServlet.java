package top.smartliu.web;

import top.smartliu.pojo.Brand;
import top.smartliu.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SelectByIdServlet", value = "/selectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
    private BrandService service = new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        Brand brand = service.selectById(Integer.parseInt(id));

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write(brand.toString());
    }
}
