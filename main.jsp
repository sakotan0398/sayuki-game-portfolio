<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, mainpage.model.beans.ItemBeans" %>
<%
    List<ItemBeans> itemList = (List<ItemBeans>) request.getAttribute("itemList");
%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>Tools - SAYUKI PORTAL</title>
<style>
body { 
    margin: 0; padding: 0; background: #111; color: #fff;
    font-family: 'Helvetica Neue', Arial, sans-serif;
    min-height: 100vh;
    background: linear-gradient(135deg, #141e30, #243b55); /* ツール用背景 */
}

/* ナビゲーション共通（プロフ・ギャラリーと同じ） */
.back-home { position: fixed; top: 20px; left: 20px; z-index: 1000; background: rgba(74, 144, 226, 0.8); color: white; padding: 10px 25px; text-decoration: none; border-radius: 30px; font-weight: bold; transition: 0.3s; }
.back-home:hover { background: #357abd; transform: scale(1.05); }
.hamburger { position: fixed; top: 20px; right: 20px; width: 30px; height: 24px; cursor: pointer; display: flex; flex-direction: column; justify-content: space-between; z-index: 2000; }
.hamburger span { display: block; width: 100%; height: 3px; background-color: #fff; border-radius: 2px; transition: all 0.4s; }
.active-btn span:nth-child(1) { transform: translateY(10.5px) rotate(45deg); }
.active-btn span:nth-child(2) { opacity: 0; }
.active-btn span:nth-child(3) { transform: translateY(-10.5px) rotate(-45deg); }
.full-menu { position: fixed; top: 0; right: -100%; width: 300px; height: 100vh; background: rgba(0, 0, 0, 0.95); z-index: 1500; transition: 0.5s; padding-top: 100px; }
.full-menu.active { right: 0; }
.full-menu ul { list-style: none; padding: 0; text-align: center; }
.full-menu ul li a { color: white; text-decoration: none; font-size: 1.5em; }

/* 💻 ツール固有：リストレイアウト */
.item-container { max-width: 900px; margin: 0 auto; padding: 100px 20px; }
.tool-card {
    background: rgba(255, 255, 255, 0.08);
    backdrop-filter: blur(15px);
    border: 1px solid rgba(255, 255, 255, 0.1);
    border-left: 6px solid #4a90e2; /* 青いアクセント線 */
    border-radius: 15px;
    padding: 30px;
    margin-bottom: 25px;
    transition: 0.3s;
}
.tool-card:hover { background: rgba(255, 255, 255, 0.12); transform: translateX(10px); }

.tool-header { display: flex; justify-content: space-between; align-items: center; margin-bottom: 15px; }
.tool-title { font-size: 1.4em; color: #fff; margin: 0; }
.tool-ver { font-size: 0.8em; background: rgba(74, 144, 226, 0.2); color: #4a90e2; padding: 3px 10px; border-radius: 10px; border: 1px solid #4a90e2; }
.tool-tech { color: #aaa; font-size: 0.9em; margin-bottom: 15px; }
.tool-tech span { color: #4a90e2; font-weight: bold; }
.tool-desc { line-height: 1.8; color: #ddd; margin-bottom: 20px; }

.dl-btn {
    background: #4a90e2; color: white; border: none; padding: 12px 30px;
    border-radius: 8px; font-weight: bold; cursor: pointer; transition: 0.2s;
}
.dl-btn:hover { background: #357abd; box-shadow: 0 0 15px rgba(74, 144, 226, 0.5); }
</style>
</head>
<body>

    <a href="MainServlet" class="back-home">◀ PORTAL HOME</a>
    <div class="hamburger" id="ham-btn"><span></span><span></span><span></span></div>

    <nav class="full-menu" id="full-menu">
        <ul>
            <li><a href="MainServlet">Portal Top</a></li>
            <li><a href="SayukiGameServlet">Atelier Game</a></li>
            <li><a href="ProfServlet">Official Profile</a></li>
            <li><a href="ArtServlet">Illustration Gallery</a></li>
            <li><a href="ItemServlet">Technical Tools</a></li>
        </ul>
    </nav>

    <div class="item-container">
        <h2 style="border-left: 5px solid #4a90e2; padding-left: 15px; margin-bottom: 40px;">Technical Tools & Scripts</h2>
        <% for(ItemBeans item : itemList) { %>
            <div class="tool-card">
                <div class="tool-header">
                    <h3 class="tool-title"><%= item.getTitle() %></h3>
                    <span class="tool-ver"><%= item.getVersion() %></span>
                </div>
                <div class="tool-tech">Environment: <span><%= item.getTechStack() %></span></div>
                <p class="tool-desc"><%= item.getDescription() %></p>
                <button class="dl-btn">⬇ Download ZIP Package</button>
            </div>
        <% } %>
    </div>

    <script>
    const hamBtn = document.getElementById('ham-btn');
    const menu = document.getElementById('full-menu');
    hamBtn.addEventListener('click', () => { menu.classList.toggle('active'); hamBtn.classList.toggle('active-btn'); });
    menu.addEventListener('click', () => { menu.classList.remove('active'); hamBtn.classList.remove('active-btn'); });
    </script>
</body>
</html>