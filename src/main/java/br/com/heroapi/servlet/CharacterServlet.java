package br.com.heroapi.servlet;

import br.com.heroapi.client.ClientHTTP;
import br.com.heroapi.urls.ApiUrl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/character")
public class CharacterServlet extends HttpServlet {
    private ClientHTTP clientHTTP = new ClientHTTP();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("character-id");

        String information = clientHTTP.requestInformation(ApiUrl.DISNEY_GET_CHARACTER_BY_ID.getLink() + parameter);

        req.setAttribute("content", information);

        req.getRequestDispatcher("second-page.jsp").forward(req,resp);

    }
}
