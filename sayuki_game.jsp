<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>GALLERY - SAYUKI & SAKOTAN</title>
    <style>
        /* --- 全体のテーマ設定 --- */
        body {
            background-color: #0a0a15;
            color: #fff;
            font-family: 'Helvetica Neue', 'Hiragino Kaku Gothic ProN', sans-serif;
            margin: 0; padding: 40px 20px;
        }
        
        .section-title {
            text-align: center;
            letter-spacing: 5px;
            margin: 60px 0 30px;
        }

        .sayuki-title {
            color: #ff69b4;
            text-shadow: 0 0 15px rgba(255, 105, 180, 0.5);
        }

        /* --- 開発記録セクションのタイトル（青色・サイバー風） --- */
        .dev-title-sec {
            color: #00d4ff;
            text-shadow: 0 0 15px rgba(0, 212, 255, 0.5);
            font-family: 'Courier New', monospace;
        }

        .gallery-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(280px, 1fr));
            gap: 30px;
            max-width: 1200px;
            margin: 0 auto;
        }

        /* --- 共通カードスタイル --- */
        .art-card {
            background: rgba(255, 255, 255, 0.05);
            border-radius: 15px;
            overflow: hidden;
            box-shadow: 0 10px 20px rgba(0,0,0,0.5);
            transition: 0.3s;
            border: 1px solid transparent;
        }

        /* 🌸 サユキ用カードのホバー */
        .sayuki-card { border: 1px solid rgba(255, 105, 180, 0.3); }
        .sayuki-card:not(.locked):hover {
            transform: translateY(-5px);
            border-color: #ff69b4;
            box-shadow: 0 15px 30px rgba(255, 105, 180, 0.2);
        }

        /* 🛠️ さこたん（開発記録）用カードのデザイン --- */
        .dev-card {
            background: rgba(0, 40, 80, 0.2);
            border: 1px solid rgba(0, 212, 255, 0.3);
            border-radius: 5px; /* 少し角を尖らせる */
        }
        .dev-card:hover {
            transform: scale(1.02);
            border-color: #00d4ff;
            background: rgba(0, 40, 80, 0.4);
        }

        .art-img-box {
            width: 100%; height: 200px;
            background: #000;
            display: flex; align-items: center; justify-content: center;
            overflow: hidden; position: relative;
        }

        .art-img-box img { width: 100%; height: 100%; object-fit: cover; transition: 0.3s; }

        .art-info { padding: 15px; }
        .art-title { font-weight: bold; margin-bottom: 5px; font-size: 1.1em; }
        .art-desc { font-size: 0.85em; color: #aaa; line-height: 1.4; }

        /* 🔒 ロック演出 */
        .locked .art-img-box img { filter: blur(15px) brightness(0.3) grayscale(100%); }
        .lock-icon { position: absolute; font-size: 3em; color: rgba(255,255,255,0.3); }

        .btn-back {
            display: block; width: 200px; margin: 60px auto; padding: 15px;
            text-align: center; color: white; text-decoration: none;
            border: 2px solid #ff69b4; border-radius: 50px; transition: 0.3s;
        }
        .btn-back:hover { background: #ff69b4; box-shadow: 0 0 20px #ff69b4; }
    </style>
</head>
<body>

    <h1 class="section-title sayuki-title">SAYUKI'S ARTWORKS</h1>
    <div class="gallery-grid">
        <c:forEach var="art" items="${sayukiList}"> <c:set var="isUnlocked" value="${art.reqFlag == 'initial' || clearHistory[art.reqFlag]}" />
            <div class="art-card sayuki-card ${isUnlocked ? '' : 'locked'}">
                <div class="art-img-box">
                    <img src="${pageContext.request.contextPath}/images/background/${art.fileName}">
                    <c:if test="${!isUnlocked}"><div class="lock-icon">🔒</div></c:if>
                </div>
                <div class="art-info">
                    <div class="art-title">${isUnlocked ? art.title : '？？？？？？'}</div>
                    <div class="art-desc">${isUnlocked ? art.description : 'クリア後に解放されます'}</div>
                </div>
            </div>
        </c:forEach>
    </div>

    <h1 class="section-title dev-title-sec">DEVELOPMENT ARCHIVES</h1>
    <div class="gallery-grid">
        <c:forEach var="dev" items="${devList}"> <div class="art-card dev-card">
                <div class="art-img-box">
                    <img src="${pageContext.request.contextPath}/images/developer/${dev.fileName}">
                </div>
                <div class="art-info">
                    <div class="art-title" style="color:#00d4ff">${dev.title}</div>
                    <div class="art-desc">${dev.description}</div>
                </div>
            </div>
        </c:forEach>
    </div>

    <a href="MainServlet" class="btn-back">TITLE MENU</a>

</body>
</html>