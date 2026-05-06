package sayukiGame.model.beans;

public class ScenarioData {
	private String message; // サユキのセリフ
	private String choice1Text; // 選択肢1
	private String choice2Text; // 選択肢2
	private String choice3Text; // 選択肢3

	// それぞれの選択肢を選んだ時の返答
	private String Res1;
	private String Res2;
	private String Res3;

	// それぞれの選択肢を選んだ時の加算量
	private int c1Love, c1Like;
	private int c2Love, c2Like;
	private int c3Love, c3Like;

	// シナリオのID
	private int scenarioId;

	// シナリオ移行 レベル
	private int phaseLevel;

	// シナリオを統合させるための箱
	private String poolType; // "Common", "Love", "Like" のいずれかが入る

	// 💡 画像情報をひとまとめにして持つ
	private VisualBeans visuals;

	// 選択肢ごとのリアクション用画像
	private VisualBeans res1Visuals;
	private VisualBeans res2Visuals;
	private VisualBeans res3Visuals;

	public VisualBeans getVisuals() {
		return visuals;
	}

	public void setVisuals(VisualBeans visuals) {
		this.visuals = visuals;
	}

	// Getter/Setter
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getChoice1Text() {
		return choice1Text;
	}

	public String getRes1() {
		return Res1;
	}

	public void setRes1(String res1) {
		Res1 = res1;
	}

	public String getRes2() {
		return Res2;
	}

	public void setRes2(String res2) {
		Res2 = res2;
	}

	public String getRes3() {
		return Res3;
	}

	public void setRes3(String res3) {
		Res3 = res3;
	}

	public void setChoice1Text(String choice1Text) {
		this.choice1Text = choice1Text;
	}

	public String getChoice2Text() {
		return choice2Text;
	}

	public void setChoice2Text(String choice2Text) {
		this.choice2Text = choice2Text;
	}

	public String getChoice3Text() {
		return choice3Text;
	}

	public void setChoice3Text(String choice3Text) {
		this.choice3Text = choice3Text;
	}

	public int getC1Love() {
		return c1Love;
	}

	public void setC1Love(int c1Love) {
		this.c1Love = c1Love;
	}

	public int getC1Like() {
		return c1Like;
	}

	public void setC1Like(int c1Like) {
		this.c1Like = c1Like;
	}

	public int getC2Love() {
		return c2Love;
	}

	public void setC2Love(int c2Love) {
		this.c2Love = c2Love;
	}

	public int getC2Like() {
		return c2Like;
	}

	public void setC2Like(int c2Like) {
		this.c2Like = c2Like;
	}

	public int getC3Love() {
		return c3Love;
	}

	public void setC3Love(int c3Love) {
		this.c3Love = c3Love;
	}

	public int getC3Like() {
		return c3Like;
	}

	public void setC3Like(int c3Like) {
		this.c3Like = c3Like;
	}

	public int getScenarioId() {
		return scenarioId;
	}

	public void setScenarioId(int scenarioId) {
		this.scenarioId = scenarioId;
	}

	public int getPhaseLevel() {
		return phaseLevel;
	}

	public void setPhaseLevel(int phaseLevel) {
		this.phaseLevel = phaseLevel;
	}

	public String getPoolType() {
		return poolType;
	}

	public void setPoolType(String poolType) {
		this.poolType = poolType;
	}

	public VisualBeans getRes1Visuals() {
		return res1Visuals;
	}

	public void setRes1Visuals(VisualBeans res1Visuals) {
		this.res1Visuals = res1Visuals;
	}

	public VisualBeans getRes2Visuals() {
		return res2Visuals;
	}

	public void setRes2Visuals(VisualBeans res2Visuals) {
		this.res2Visuals = res2Visuals;
	}

	public VisualBeans getRes3Visuals() {
		return res3Visuals;
	}

	public void setRes3Visuals(VisualBeans res3Visuals) {
		this.res3Visuals = res3Visuals;
	}
}