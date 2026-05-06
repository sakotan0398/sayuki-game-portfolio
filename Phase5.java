package sayukiGame.model.beans;

import java.io.Serializable;

public class VisualBeans implements Serializable {

	private String backgroundImage; // 背景画像パス
	private String characterImage; // キャラクター立ち絵パス
	private String effectType; // 画面のサユキの出し方
	private String zoomType; // カメラ寄り (normal, close_up)

	// コンストラクタ
	public VisualBeans(String charImg, String bgImg, String effect, String zoom) {
		this.characterImage = charImg;
		this.backgroundImage = bgImg;
		this.effectType = effect;
		this.setZoomType(zoom);
	}

	// Getter / Setter
	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public String getCharacterImage() {
		return characterImage;
	}

	public void setCharacterImage(String characterImage) {
		this.characterImage = characterImage;
	}

	public String getEffectType() {
		return effectType;
	}

	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public String getZoomType() {
		return zoomType;
	}

	public void setZoomType(String zoomType) {
		this.zoomType = zoomType;
	}

}