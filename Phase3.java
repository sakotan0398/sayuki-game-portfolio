package sayukiGame.model.beans;

public class Sayuki_Sakota extends Character {

	private String name = "サユキ";
	//好感度、友好度 初期値0
	private int LovePoint = 0;
	private int LikePoint = 0;

	// ターン制限
	private int currentTurn = 1;

	// フラグ管理
	// 1. コーヒー
	private boolean isSleepyInfoRevealed = false;
	private boolean isCoffeeAccepted = false;

	// 2. 本
	private boolean isTechStruggleRevealed = false;
	private boolean isBookGiven = false;

	// 3. スイーツ
	private boolean isWorkSettledRevealed = false;
	private boolean isSweetsGiven = false;

	// 4. PCパーツ
	private boolean isCoolingIssueRevealed = false;
	private boolean isPCPartsGiven = false;

	// 5. デッサン人形
	private boolean isDollBrokenRevealed = false;
	private boolean isDollGiven = false;

	// デートの約束
	private boolean isDateEventRevealed = false;
	private boolean isDatePromised = false;
	
	// セーブとロード
	private int loadedPhase;      // DBから読み込んだPhase保存用
	private int loadedScenarioId; // DBから読み込んだ会話ID保存用

	// LovePointの加算,上限100
	public void addLovePoint(int point) {

		this.setLovePoint(this.getLovePoint() + point);

		// 0以下にならない
		if (this.getLovePoint() <= 0)
			this.setLovePoint(0);

		// 100以上にならない
		if (this.getLovePoint() > 100)
			this.setLovePoint(100);

	}

	// LikePointの加算,上限100
	public void addLikePoint(int point) {
		this.setLikePoint(this.getLikePoint() + point);

		// 0以下にならない
		if (this.getLikePoint() <= 0)
			this.setLikePoint(0);

		// 100以上にならない
		if (this.getLikePoint() > 100)
			this.setLikePoint(100);
	}
	// イベント管理用
		private int eventScore = 0;

	// 名前のgetter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 好感度のgetter,setter
	public int getLovePoint() {
		return LovePoint;
	}

	public void setLovePoint(int lovePoint) {
		LovePoint = lovePoint;
	}

	// 友好度のgetter,setter
	public int getLikePoint() {
		return LikePoint;
	}

	public void setLikePoint(int likePoint) {
		LikePoint = likePoint;
	}

	// フラグのgetter,setter
	public boolean isSleepyInfoRevealed() {
		return isSleepyInfoRevealed;
	}

	public void setSleepyInfoRevealed(boolean isSleepyInfoRevealed) {
		this.isSleepyInfoRevealed = isSleepyInfoRevealed;
	}

	public boolean isCoffeeAccepted() {
		return isCoffeeAccepted;
	}

	public void setCoffeeAccepted(boolean isCoffeeAccepted) {
		this.isCoffeeAccepted = isCoffeeAccepted;
	}

	public boolean isTechStruggleRevealed() {
		return isTechStruggleRevealed;
	}

	public void setTechStruggleRevealed(boolean isTechStruggleRevealed) {
		this.isTechStruggleRevealed = isTechStruggleRevealed;
	}

	public boolean isBookGiven() {
		return isBookGiven;
	}

	public void setBookGiven(boolean isBookGiven) {
		this.isBookGiven = isBookGiven;
	}

	public boolean isWorkSettledRevealed() {
		return isWorkSettledRevealed;
	}

	public void setWorkSettledRevealed(boolean isWorkSettledRevealed) {
		this.isWorkSettledRevealed = isWorkSettledRevealed;
	}

	public boolean isSweetsGiven() {
		return isSweetsGiven;
	}

	public void setSweetsGiven(boolean isSweetsGiven) {
		this.isSweetsGiven = isSweetsGiven;
	}

	public boolean isCoolingIssueRevealed() {
		return isCoolingIssueRevealed;
	}

	public void setCoolingIssueRevealed(boolean isCoolingIssueRevealed) {
		this.isCoolingIssueRevealed = isCoolingIssueRevealed;
	}

	public boolean isPCPartsGiven() {
		return isPCPartsGiven;
	}

	public void setPCPartsGiven(boolean isPCPartsGiven) {
		this.isPCPartsGiven = isPCPartsGiven;
	}

	public boolean isDollBrokenRevealed() {
		return isDollBrokenRevealed;
	}

	public void setDollBrokenRevealed(boolean isDollBrokenRevealed) {
		this.isDollBrokenRevealed = isDollBrokenRevealed;
	}

	public boolean isDollGiven() {
		return isDollGiven;
	}

	public void setDollGiven(boolean isDollGiven) {
		this.isDollGiven = isDollGiven;
	}

	public boolean isDateEventRevealed() {
		return isDateEventRevealed;
	}

	public void setDateEventRevealed(boolean isDateEventRevealed) {
		this.isDateEventRevealed = isDateEventRevealed;
	}

	public boolean isDatePromised() {
		return isDatePromised;
	}

	public void setDatePromised(boolean isDatePromised) {
		this.isDatePromised = isDatePromised;
	}

	
	public int getCurrentTurn() {
		return currentTurn;
	}

	public void setCurrentTurn(int currentTurn) {
		this.currentTurn = currentTurn;
	}

	public int getLoadedPhase() {
		return loadedPhase;
	}

	public void setLoadedPhase(int loadedPhase) {
		this.loadedPhase = loadedPhase;
	}

	public int getLoadedScenarioId() {
		return loadedScenarioId;
	}

	public void setLoadedScenarioId(int loadedScenarioId) {
		this.loadedScenarioId = loadedScenarioId;
	}
	
	public int getEventScore() {
		return eventScore;
	}
	
	public void setEventScore(int eventScore) {
		this.eventScore = eventScore;
	}

	// ターンを1進めるための便利メソッド
	public void nextTurn() {
		this.currentTurn++;
	}

}

