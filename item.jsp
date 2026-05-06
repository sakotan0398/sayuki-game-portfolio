<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>Login - SAYUKI PORTAL</title>
<style>
/* --- 全体設定（ポータルと統一） --- */
body {
	margin: 0;
	padding: 0;
	font-family: 'Helvetica Neue', 'Hiragino Kaku Gothic ProN', Arial,
		sans-serif;
	background: linear-gradient(135deg, #1a1a2e, #16213e); /* 深い夜のような背景 */
	color: #fff;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh; /* 画面の真ん中に配置 */
}

/* --- ガラスパネル（ログインカード） --- */
.login-card {
	background: rgba(255, 255, 255, 0.05);
	backdrop-filter: blur(20px);
	border: 1px solid rgba(255, 255, 255, 0.1);
	border-radius: 20px;
	padding: 50px 40px;
	width: 100%;
	max-width: 400px; /* スマホでもPCでも丁度いい幅 */
	box-shadow: 0 15px 35px rgba(0, 0, 0, 0.5);
	text-align: center;
}

/* タイトル周り */
.login-card h1 {
	margin: 0 0 5px;
	color: #ff69b4;
	font-size: 1.8em;
	letter-spacing: 2px;
}

.subtitle {
	color: #aaa;
	margin-bottom: 30px;
	font-size: 0.9em;
}

/* --- 入力フォーム --- */
.input-group {
	text-align: left;
	margin-bottom: 20px;
}

.input-group label {
	display: block;
	margin-bottom: 8px;
	font-size: 0.85em;
	color: #ccc;
	letter-spacing: 1px;
}

/* テキストボックスをサイバーな半透明に */
.input-group input {
	width: 100%;
	padding: 12px 15px;
	background: rgba(0, 0, 0, 0.3); /* 黒の半透明 */
	border: 1px solid rgba(255, 255, 255, 0.2);
	border-radius: 8px;
	color: #fff;
	font-size: 1em;
	box-sizing: border-box;
	transition: 0.3s;
	outline: none;
}
/* 入力中（フォーカス時）はピンクに光る */
.input-group input:focus {
	border-color: #ff69b4;
	background: rgba(0, 0, 0, 0.5);
	box-shadow: 0 0 10px rgba(255, 105, 180, 0.3);
}

/* --- ボタン類のデザイン --- */
/* メインボタン（ログイン） */
.btn-primary {
	width: 100%;
	padding: 15px;
	margin-top: 10px;
	background: #ff69b4;
	color: #fff;
	border: none;
	border-radius: 30px;
	font-size: 1.1em;
	font-weight: bold;
	cursor: pointer;
	transition: 0.3s;
	box-shadow: 0 5px 15px rgba(255, 105, 180, 0.4);
}

.btn-primary:hover {
	background: #ff1493;
	transform: translateY(-3px);
	box-shadow: 0 8px 20px rgba(255, 105, 180, 0.6);
}

/* 境界線（OR） */
.divider {
	display: flex;
	align-items: center;
	margin: 30px 0;
	color: #666;
	font-size: 0.8em;
}

.divider::before, .divider::after {
	content: '';
	flex: 1;
	border-bottom: 1px solid rgba(255, 255, 255, 0.1);
}

.divider span {
	padding: 0 15px;
}

/* サブボタン（ゲスト・新規） */
.action-links {
	display: flex;
	flex-direction: column;
	gap: 15px;
}

.btn-secondary {
	background: rgba(255, 255, 255, 0.1);
	color: #fff;
	border: none;
	padding: 12px;
	border-radius: 8px;
	cursor: pointer;
	transition: 0.3s;
}

.btn-secondary:hover {
	background: rgba(255, 255, 255, 0.2);
}

.btn-outline {
	background: transparent;
	color: #ff69b4;
	border: 1px solid #ff69b4;
	padding: 12px;
	border-radius: 8px;
	cursor: pointer;
	transition: 0.3s;
}

.btn-outline:hover {
	background: rgba(255, 105, 180, 0.1);
}
/* --- ローディング画面のデザイン --- */
.loading-overlay {
    position: fixed; top: 0; left: 0; width: 100%; height: 100vh;
    background: #0a0a14; /* 漆黒 */
    z-index: 9999; /* 一番手前に */
    display: flex; justify-content: center; align-items: center;
    
    /* 最初は透明にして、クリックできないようにしておく */
    opacity: 0; pointer-events: none; transition: opacity 0.5s;
}

/* JSでこのクラスが付くと、画面が真っ暗になる */
.loading-overlay.active {
    opacity: 1; pointer-events: all;
}

.loading-content { width: 80%; max-width: 400px; text-align: center; }

/* くるくる回るスピナー */
.spinner {
    width: 40px; height: 40px; margin: 0 auto 20px;
    border: 4px solid rgba(255, 105, 180, 0.2);
    border-top: 4px solid #ff69b4; border-radius: 50%;
    animation: spin 1s linear infinite;
}
@keyframes spin { 0% { transform: rotate(0deg); } 100% { transform: rotate(360deg); } }

/* テキストとバー */
.loading-text { color: #ff69b4; font-weight: bold; letter-spacing: 3px; margin-bottom: 15px; }
.loading-subtext { color: #666; font-size: 0.8em; margin-top: 10px; animation: blink 1.5s infinite; }
@keyframes blink { 0%, 100% { opacity: 1; } 50% { opacity: 0.3; } }

.progress-bar { width: 100%; height: 4px; background: rgba(255,255,255,0.1); border-radius: 2px; overflow: hidden; }

/* バーが伸びるアニメーション（JSが動いた時にスタート） */
.loading-overlay.active .progress-fill {
    height: 100%; background: #ff69b4; width: 0%;
    animation: fillUp 2s ease-in-out forwards; /* 2秒かけて満タンになる */
}
@keyframes fillUp {
    0% { width: 0%; }
    40% { width: 60%; }
    80% { width: 80%; }
    100% { width: 100%; }
}
</style>
</head>
<body>

	<div class="login-card">
		<h1>ATELIER SAYUKI</h1>
		<p class="subtitle">サユキの部屋へようこそ</p>
		<%
            String errorMsg = (String) request.getAttribute("errorMsg");
            if (errorMsg != null) {
        %>
            <div style="background: rgba(255,0,0,0.1); border: 1px solid #ff4d4d; color: #ff4d4d; padding: 10px; border-radius: 8px; margin-bottom: 20px; font-size: 0.9em;">
                <%= errorMsg %>
            </div>
        <%
            }
        %>
	
		<form id="login-form" action="UsersLoginServlet" method="post">
            <div class="input-group">
                <label for="id">USER ID</label> <input type="text" id="id" name="id"
					required placeholder="IDを入力">
			</div>
			<div class="input-group">
				<label for="pass">PASSWORD</label> <input type="password" id="pass"
					name="pass" required placeholder="パスワードを入力">
			</div>

		<button type="button" id="login-btn" class="btn-primary">LOGIN</button>		</form>

		<div class="divider">
			<span>OR</span>
		</div>

		<div class="action-links">
			<button type="button" class="btn-secondary"
				onclick="location.href='UsersLoginServlet?action=guest'">ゲストとして覗いてみる</button>
			<button type="button" class="btn-outline"
				onclick="location.href='UsersRegistServlet'">新規アトリエ会員登録</button>
		</div>
	</div>

<form id="login-form" action="UsersLoginServlet" method="post">
    </form>

<div id="loading-screen" class="loading-overlay">
    <div class="loading-content">
        <div class="spinner"></div>
        <p class="loading-text">CONNECTING TO ATELIER...</p>
        <div class="progress-bar">
            <div class="progress-fill"></div>
        </div>
        <p class="loading-subtext">認証キーを確認中...</p>
    </div>
</div>
</body>
<script>
    const loginForm = document.getElementById('login-form');
    const loginBtn = document.getElementById('login-btn'); // 📌 ボタンの情報を取得
    const loadingScreen = document.getElementById('loading-screen');
    const subText = document.querySelector('.loading-subtext');

    // 📌 formの送信ではなく、ボタンの「クリック」を監視する
    loginBtn.addEventListener('click', function() {
        
        // 1. 入力チェック（IDやPASSが空欄じゃないか確認）
        if (!loginForm.checkValidity()) {
            loginForm.reportValidity(); // 空欄ならブラウザの警告を出す
            return; // 処理をストップ
        }

        // 2. 問題なければ画面を真っ暗にする
        loadingScreen.classList.add('active');

        // 3. 1秒後：テキスト変更
        setTimeout(() => {
            subText.textContent = "サユキのデータをロード中...";
        }, 1000);

        // 4. 2.5秒後：接続完了の演出
        setTimeout(() => {
            subText.textContent = "接続完了！";
            subText.style.color = "#4deeea"; // 水色に光らせる
            subText.style.animation = "none"; // 点滅を止める
        }, 2500);

        // 5. 3.5秒後：ここで初めて、JSの力でフォームを送信（submit）する！
        setTimeout(() => {
            loginForm.submit(); 
        }, 3500);
    });
</script>
</html>