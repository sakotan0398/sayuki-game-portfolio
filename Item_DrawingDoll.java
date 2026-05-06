package mainpage.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import mainpage.model.beans.ArtBeans;
import sayukiGame.model.dao.SayukiGameDAO;
import userMS.model.beans.UsersBeans;

@WebServlet("/ArtServlet")
public class ArtServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        UsersBeans loginUser = (UsersBeans) session.getAttribute("loginUser");

        if (loginUser == null) {
            response.sendRedirect("UsersLoginServlet");
            return;
        }

        // 1. DAOからユーザーのクリア状況を取得
        SayukiGameDAO dao = new SayukiGameDAO();
        Map<String, Boolean> clearHistory = dao.getClearHistory(loginUser.getId());

        // 2. 表示するイラストリストの作成（Beansの新しい設計に合わせて作成）
        List<ArtBeans> artList = new ArrayList<>();
        artList.add(new ArtBeans("はじまりのアトリエ", "bg_atelier.jpg", "物語の始まりの場所。", "initial","sayuki"));
        artList.add(new ArtBeans("Love Clear 特典", "sayuki_mesorasi_tere.jpg", "Loveルートをクリアした証。", "love_cleared","sayuki"));
        artList.add(new ArtBeans("Like Clear 特典", "sayuki_focus.jpg", "Likeルートをクリアした証。", "like_cleared","sayuki"));
        artList.add(new ArtBeans("True Clear 特典", "sayuki_scary_smile.jpg", "全ての絆を深めた証。", "true_cleared","sayuki"));

     // 2. 💡 さこたんの開発記録リスト
        List<ArtBeans> devList = new ArrayList<>();
        devList.add(new ArtBeans("DB設計図 v1.0", "db_schema.png", "MySQLで構築したテーブル構造の全容です。", "initial", "DEVELOPER"));
        devList.add(new ArtBeans("進行管理ロジック", "logic_flow.png", "52ターンの進行と分岐を司るJavaプログラムの設計書。", "initial", "DEVELOPER"));
        devList.add(new ArtBeans("サユキのボツ表情案", "rough_sketches.jpg", "実装されなかった初期のラフスケッチ集。", "initial", "DEVELOPER"));

        request.setAttribute("sayukiList", artList);
        request.setAttribute("devList", devList);
        request.setAttribute("clearHistory", clearHistory);
        
        // 3. JSPへデータを渡す
        request.setAttribute("sayukiList", artList);
        request.setAttribute("devList", devList);
        request.setAttribute("clearHistory", clearHistory);
        
        request.getRequestDispatcher("WEB-INF/jsp/contents/art.jsp").forward(request, response);
    }
}