package mainpage.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import mainpage.model.beans.ItemBeans;
import userMS.model.beans.UsersBeans;

@WebServlet("/ItemServlet")
public class ItemServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        UsersBeans loginUser = (UsersBeans) session.getAttribute("loginUser");

        // ログインチェック
        if (loginUser == null) {
            response.sendRedirect("UsersLoginServlet");
            return;
        }

        // 表示するツールリストの作成
        List<ItemBeans> itemList = new ArrayList<>();
        
        // 末尾の数値をなくし、4つの引数だけで作成
        itemList.add(new ItemBeans("OBS用 チャット表示ツール", "配信画面にコメントを透過して表示するツールです。CSSでデザイン変更可能。", "Python / HTML / CSS", "v1.2"));
        itemList.add(new ItemBeans("素材自動振り分けスクリプト", "ダウンロードした画像や音源を、拡張子ごとに自動でフォルダ分けします。", "Python / OSモジュール", "v1.0"));
        itemList.add(new ItemBeans("Live2D 瞬き自動化プラグイン", "モデリングの際、まばたきのパラメータを自動でランダム生成します。", "Java", "v0.8 Beta"));

        request.setAttribute("itemList", itemList);
        request.getRequestDispatcher("WEB-INF/jsp/contents/item.jsp").forward(request, response);
    }
}