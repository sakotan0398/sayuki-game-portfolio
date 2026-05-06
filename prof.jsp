<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>Registration - SAYUKI PORTAL</title>
<style>
/* --- 全体設定 --- */
body {
	margin: 0;
	padding: 0;
	font-family: 'Helvetica Neue', 'Hiragino Kaku Gothic ProN', Arial,
		sans-serif;
	background: linear-gradient(135deg, #1a1a2e, #16213e);
	color: #fff;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
	color-scheme: dark;
}

/* --- ガラスパネル（登録カード） --- */
.regist-card {
	background: rgba(255, 255, 255, 0.05);
	backdrop-filter: blur(20px);
	border: 1px solid rgba(255, 255, 255, 0.1);
	border-radius: 20px;
	padding: 50px 40px;
	width: 100%;
	max-width: 450px;
	box-shadow: 0 15px 35px rgba(0, 0, 0, 0.5);
	text-align: center;
}

.regist-card h1 {
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
	display: flex;
	justify-content: space-between;
	align-items: flex-end;
	margin-bottom: 8px;
	font-size: 0.85em;
	color: #ccc;
	letter-spacing: 1px;
}

.input-hint {
	font-size: 0.8em;
	color: #ff69b4;
}

.input-group input {
	width: 100%;
	padding: 12px 15px;
	background: rgba(0, 0, 0, 0.3);
	border: 1px solid rgba(255, 255, 255, 0.2);
	border-radius: 8px;
	color: #fff;
	font-size: 1em;
	box-sizing: border-box;
	transition: 0.3s;
	outline: none;
}

.input-group input:focus {
	border-color: #ff69b4;
	background: rgba(0, 0, 0, 0.5);
	box-shadow: 0 0 10px rgba(255, 105, 180, 0.3);
}

/* --- ボタン類 --- */
.btn-primary {
	width: 100%;
	padding: 15px;
	margin-top: 20px;
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

.divider {
	display: flex;
	align-items: center;
	margin: 25px 0;
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

.btn-outline {
	width: 100%;
	background: transparent;
	color: #aaa;
	border: 1px solid #666;
	padding: 12px;
	border-radius: 8px;
	cursor: pointer;
	transition: 0.3s;
	font-size: 0.9em;
}

.btn-outline:hover {
	background: rgba(255, 255, 255, 0.05);
	color: #fff;
	border-color: #aaa;
}

/* --- 🌟 ローディング画面のデザイン（ログインと同じ） --- */
.loading-overlay {
	position: fixed;
	top: 0;
	left: 0;
	width: 100%;
	height: 100vh;
	background: #0a0a14;
	z-index: 9999;
	display: flex;
	justify-content: center;
	align-items: center;
	opacity: 0;
	pointer-events: none;
	transition: opacity 0.5s;
}

.loading-overlay.active {
	opacity: 1;
	pointer-events: all;
}

.loading-content {
	width: 80%;
	max-width: 400px;
	text-align: center;
}

.spinner {
	width: 40px;
	height: 40px;
	margin: 0 auto 20px;
	border: 4px solid rgba(255, 105, 180, 0.2);
	border-top: 4px solid #ff69b4;
	border-radius: 50%;
	animation: spin 1s linear infinite;
}
@keyframes spin { 
    0% { transform: rotate(0deg); }
    100% { transform: rotate(360deg); }
}

.loading-text {
	color: #ff69b4;
	font-weight: bold;
	letter-spacing: 3px;
	margin-bottom: 15px;
}

.loading-subtext {
	color: #666;
	font-size: 0.8em;
	margin-top: 10px;
	animation: blink 1.5s infinite;
}

@keyframes blink { 
    0%, 100% { opacity: 1; }
    50% { opacity: 0.3; }
}

.progress-bar {
	width: 100%;
	height: 4px;
	background: rgba(255, 255, 255, 0.1);
	border-radius: 2px;
	overflow: hidden;
}

.loading-overlay.active .progress-fill {
	height: 100%;
	background: #ff69b4;
	width: 0%;
	animation: fillUp 2s ease-in-out forwards;
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

	<div class="regist-card">
		<h1>CREATE ACCOUNT</h1>
		<p class="subtitle">アトリエへの新規会員登録</p>

		<%
		String errorMsg = (String) request.getAttribute("errorMsg");
		if (errorMsg != null) {
		%>
		<div
			style="background: rgba(255, 0, 0, 0.1); border: 1px solid #ff4d4d; color: #ff4d4d; padding: 10px; border-radius: 8px; margin-bottom: 20px; font-size: 0.9em;">
			<%=errorMsg%>
		</div>
		<%
		}
		%>

		<form id="regist-form" action="UsersRegistServlet" method="post">

			<div class="input-group">
				<label for="id">USER ID</label> <input type="text" id="id" name="id"
					required placeholder="希望するログインID（半角英数字）">
			</div>

			<div class="input-group">
				<label for="hn">HANDLE NAME <span class="input-hint">※サユキからの呼ばれ方</span></label>
				<input type="text" id="hn" name="hn" required
					placeholder="ゲーム内で表示される名前">
			</div>

			<div class="input-group">
				<label for="pass">PASSWORD</label> <input type="password" id="pass"
					name="pass" required placeholder="パスワードを設定">
			</div>

			<div class="input-group">
				<label for="birthday">BIRTHDAY <span class="input-hint">※お祝いイベントが発生します</span></label>
				<input type="date" id="birthday" name="birthday" required>
			</div>

			<button type="button" id="regist-btn" class="btn-primary">この内容で登録する</button>
		</form>

		<div class="divider">
			<span>すでにアカウントをお持ちの場合</span>
		</div>
		<button type="button" class="btn-outline"
			onclick="location.href='UsersLoginServlet'">ログイン画面に戻る</button>
	</div>

	<div id="loading-screen" class="loading-overlay">
		<div class="loading-content">
			<div class="spinner"></div>
			<p class="loading-text">CREATING ACCOUNT...</p>
			<div class="progress-bar">
				<div class="progress-fill"></div>
			</div>
			<p class="loading-subtext">ユーザー情報を構築中...</p>
		</div>
	</div>

	<script>
        const registForm = document.getElementById('regist-form');
        const registBtn = document.getElementById('regist-btn');
        const loadingScreen = document.getElementById('loading-screen');
        const subText = document.querySelector('.loading-subtext');

        registBtn.addEventListener('click', function() {
            // 1. 入力チェック（必須項目が埋まっているか）
            if (!registForm.checkValidity()) {
                registForm.reportValidity(); 
                return; 
            }

            // 2. 画面を暗転
            loadingScreen.classList.add('active');

            // 3. 1秒後：演出テキスト変更
            setTimeout(() => {
                subText.textContent = "データベースに書き込み中...";
            }, 1000);

            // 4. 2.5秒後：完了演出
            setTimeout(() => {
                subText.textContent = "登録完了！";
                subText.style.color = "#4deeea"; 
                subText.style.animation = "none"; 
            }, 2500);

            // 5. 3.5秒後：本当に送信！
            setTimeout(() => {
                registForm.submit(); 
            }, 3500);
        });
    </script>
</body>
</html>