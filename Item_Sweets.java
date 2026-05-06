package mainpage.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import sayukiGame.model.beans.Sayuki_Sakota;
import sayukiGame.model.dao.SayukiGameDAO;
import userMS.model.beans.UsersBeans;

@WebServlet("/ProfServlet")
public class ProfServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        UsersBeans loginUser = (UsersBeans) session.getAttribute("loginUser");

        // 1. ログインチェック（未ログインならログイン画面へ）
        if (loginUser == null) {
            response.sendRedirect("UsersLoginServlet");
            return;
        }

        // 2. データの準備
        // セッションに最新のゲームデータがあるか確認
        Sayuki_Sakota s = (Sayuki_Sakota) session.getAttribute("sayukiData");
        
        // セッションが空（ブラウザを開き直した直後など）なら、DAOでDBからロード
        if (s == null) {
            SayukiGameDAO dao = new SayukiGameDAO();
            s = dao.loadGameData(loginUser.getId());
            
            // ロードできた場合はセッションに入れておく（プロフで表示するため）
            if (s != null) {
                session.setAttribute("sayukiData", s);
            }
        }

        // 3. プロフィール画面（JSP）へフォワード
        // 将来的にフォルダ分けをするなら "WEB-INF/jsp/contents/prof.jsp"
        request.getRequestDispatcher("WEB-INF/jsp/contents/prof.jsp").forward(request, response);
    }
}