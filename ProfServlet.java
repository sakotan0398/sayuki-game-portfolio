package mainpage.model.beans;

public class ArtBeans {
	private String title;
	private String fileName;
	private String description;
	private String reqFlag;
	private String category; // 💡 追加："SAYUKI" または "DEVELOPER"

	public ArtBeans(String title, String fileName, String description, String reqFlag, String category) {
		this.title = title;
		this.fileName = fileName;
		this.description = description;
		this.reqFlag = reqFlag;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReqFlag() {
		return reqFlag;
	}

	public void setReqFlag(String reqFlag) {
		this.reqFlag = reqFlag;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}